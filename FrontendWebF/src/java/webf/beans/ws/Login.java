/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webf.beans.ws;

import javax.faces.context.FacesContext;
import javax.inject.Named;
import webf.beans.CourseDetailRequest;
import webf.beans.CourseListType;
import webf.beans.CourseType;
import webf.beans.LoginRequest;
import webf.beans.LoginRequestType;
import webf.beans.LoginResponse2;
import webf.beans.LoginResponseType;
import webf.beans.WebServices;
import webf.beans.WebServices_Service;

/**
 *
 * @author PU
 */
@Named
public class Login {
    
    private String username;
    private String password;
    private String userId;
    private LoginResponse2 lResp;
    private CourseListType courseList;
    private CourseType ct;
    private CourseDetailRequest cdr = new CourseDetailRequest();
    private String rowsAffected;
    private String role;
    private CourseType ct2;
    private CourseType ect = new CourseType();

    public CourseType getEct() {
        return ect;
    }

    public void setEct(CourseType ect) {
        this.ect = ect;
    }

    public CourseType getCt2() {
        return ct2;
    }

    public void setCt2(CourseType ct2) {
        this.ct2 = ct2;
    }
    
    
    public CourseType getCt() {
        return ct;
    }

    public void setCt(CourseType ct) {
        this.ct = ct;
    }
    
    public CourseDetailRequest getCdr() {
        return cdr;
    }

    public void setCdr(CourseDetailRequest cdr) {
        this.cdr = cdr;
    }

    public CourseListType getCourseList() {
        if (courseList == null) {
        getCourseListByUserId();
        }
        return courseList;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public String login(){
    
        //call WS        
        
        WebServices_Service service = new WebServices_Service();//webservice aufrufen
        WebServices port = service.getWebServicesPort();   //Detailaufrufe über port   
        
        LoginRequestType lrt = new LoginRequestType();//Type objekt
        LoginRequest lr = new LoginRequest();
        lr.setUsername(username);
        lr.setPassw(password);
        lrt.setLoginRequest(lr);
                
        LoginResponseType lRespT =  port.login(lrt);    //Request wird zum webservice geschickt
        lResp = lRespT.getLoginResponse();
        String status = lResp.getStatus();
        userId = lResp.getUserId();
        role = port.getRole(lResp);
        
        
        int x = 0;
        x++;
        if(status == null){
            username = "";
            password = "";
            return "failure";
        }
        if(status.equals("Success!")){
            if (role.equals("Teacher")){
            return "teacher";
            
            }else if(role.equals("Student")){
            return "student";
            }
            
            else{return "error";}
            
            
        }else {
            username = "";
            password = "";
            return "failure";
        }
        
        
        
    }
    
    public void getCourseListByUserId(){
    //call WS        
        
        WebServices_Service service = new WebServices_Service();//webservice aufrufen
        WebServices port = service.getWebServicesPort();   //Detailaufrufe über port   
        
        courseList = port.getCourses(lResp);
       
    }
        
    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/index.xhtml?faces-redirect=true";
    
    }

    public void getCurrentCourseId(String coursePk) {
      cdr.setCoursePk(coursePk);        
    }
    
    
    public String getCourseDetails() {
        
        WebServices_Service service = new WebServices_Service();//webservice aufrufen
        WebServices port = service.getWebServicesPort();   //Detailaufrufe über port   
        
        ct = port.getCourseDetail(cdr);
        
        return "coursedetail";
    }
    
    public String saveCourseEdit() {
        WebServices_Service service = new WebServices_Service();//webservice aufrufen
        WebServices port = service.getWebServicesPort();   //Detailaufrufe über port  
        
        CourseType editedCourse = new CourseType();
        editedCourse.setTitle(getCt().getTitle());
        editedCourse.setDescription(getCt().getDescription());
        editedCourse.setCoursePk(getCt().getCoursePk());
        
        rowsAffected = port.saveCourseDetail(editedCourse);
        getCourseListByUserId();
        
        return "courselist";
    }
    
    public String getAllCourses(){
    //call WS        
        
        WebServices_Service service = new WebServices_Service();//webservice aufrufen
        WebServices port = service.getWebServicesPort();   //Detailaufrufe über port   
        
        courseList = port.getAllCourses(ct2);
        
        return "allCourses";
       
    }
    
        public String deleteCourse() {
        
        WebServices_Service service = new WebServices_Service();//webservice aufrufen
        WebServices port = service.getWebServicesPort();   //Detailaufrufe über port   
        
        CourseType deletedCourse = new CourseType();
        deletedCourse.setCoursePk(Integer.parseInt(cdr.getCoursePk())); //Null Pointer Exception
        port.deleteCourse(deletedCourse);
        
        getCourseListByUserId();
        return "courselist";
    }
        
        public String saveNewCourse() {
        WebServices_Service service = new WebServices_Service();//webservice aufrufen
        WebServices port = service.getWebServicesPort();   //Detailaufrufe über port  

        CourseType newCourse = new CourseType();
        
        newCourse.setTitle(ect.getTitle());
        newCourse.setDescription(ect.getDescription());
        
        rowsAffected = port.createNewCourse(lResp,newCourse);
        
        getCourseListByUserId();
        
        return "updateCourse";
    }

    
}






