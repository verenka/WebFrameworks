/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webf.webservice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import webf.hibernate.HibernateUtil;
import webf.hibernate.db.Person;
import webf.hibernate.db.Course;
import webf.hibernate.db.PersonCourseMembership;
import webf.hibernate.db.PersonCourseMembershipId;
import webf.webservice.login.types.LoginRequestType;
import webf.webservice.login.LoginResponse;
import webf.webservice.login.types.LoginResponseType;
import webf.webservices.course.CourseDetailRequest;
import webf.webservices.course.CourseListType;
import webf.webservices.course.CourseType;

/**
 *
 * @author PU
 */
@WebService(serviceName = "WebServices")
public class WebServices {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public LoginResponseType login(@WebParam(name = "parameter") LoginRequestType parameter) {
        
        parameter.getLoginRequest().getUsername();
        LoginResponse lr = new LoginResponse();
        LoginResponseType lrt = new LoginResponseType();
        
        SessionFactory sf = HibernateUtil.getSessionFactory();  //Initialisierung der SessionFactory
        Session s = sf.openSession();                           //Öffne eine Session 
        Transaction tx = null;
        
        try{
            
            tx = s.beginTransaction();                          //Beginne Transaktion
            String hql = "FROM Person P WHERE P.username = :name";  //HQL Query um Person zu suchen
            Query query = s.createQuery(hql);                   //HQL Query zuweisen
            query.setParameter("name",parameter.getLoginRequest().getUsername());                    //Wert für den namen einfügen (gegen SQL Injection!)
            List results = query.list();                        //Abfrage durchführen

            Person personFromDb = (Person)results.get(0);       //Resultat in person casten
            
             if(personFromDb.getPassword().equals(parameter.getLoginRequest().getPassw())){             //Überprüfen des Passworts und entsprechend Response mit Sccuess/Failure info befüllen
                lr.setStatus("Success!");
                lr.setUserId(String.valueOf(personFromDb.getPersonPk()));
                
            }else{
                lr.setStatus("Failure!");
            }
            
            tx.commit();            //Transaktion durchführen
        } catch (Exception e) {
        
            if(tx !=null){
                tx.rollback();      //Bei Fehlerfall => Rollback!
            }
        } finally {
            s.close();              //Session schließen egal ob Erfolg oder Fehler
        }
        
        lrt.setLoginResponse(lr);
        return lrt;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCourses")
    public CourseListType getCourses(@WebParam(name = "userId") LoginResponse userId) {
        
        CourseListType courseList = new CourseListType();
        ArrayList al = new ArrayList();
        courseList.setcLT(al);
        
        SessionFactory sf = HibernateUtil.getSessionFactory();  //Initialisierung der SessionFactory
        Session s = sf.openSession();                           //Öffne eine Session 
        Transaction tx = null;
        
        try {
            tx = s.beginTransaction();  
            String hql= "FROM Course C join fetch C.personCourseMemberships m join fetch m.person P WHERE P.personPk = :id";
            Query query = s.createQuery(hql);                   //HQL Query zuweisen
            query.setParameter("id", Integer.parseInt(userId.getUserId()));                    //Wert für die id einfügen (gegen SQL Injection!)
            List results = query.list();   
            
            //Course courseFromDb = (Course) results.get(0);
            
            for(int x = 0; x<results.size(); x++){
               Course c = (Course) results.get(x);
               CourseType ct = new CourseType(c);
               courseList.addCourseListType(ct);
               
               // courseList.addCourseListType(new CourseType((Course)results.get(x)));
               //each result is cast into a course, saved as a coursetype object into a the list called courseList
               
            }

            
        } catch (Exception e) {
            int i = 0;
        }finally {
            s.close();              //Session schließen egal ob Erfolg oder Fehler
        }
               
        return courseList;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCourseDetail")
    public CourseType getCourseDetail(@WebParam(name = "courseDetailReq") CourseDetailRequest courseDetailReq) {
        
        SessionFactory sf = HibernateUtil.getSessionFactory();  //Initialisierung der SessionFactory
        Session s = sf.openSession();                           //Öffne eine Session 
        Transaction tx = null;
        
        try {
            tx = s.beginTransaction();  
            String hql= "FROM Course C WHERE C.coursePk = :id";
            Query query = s.createQuery(hql);                   //HQL Query zuweisen
            query.setParameter("id", Integer.parseInt(courseDetailReq.getCoursePk()));                    //Wert für die id einfügen (gegen SQL Injection!)
            List result = query.list();
            
            if (result.size()>0) {
            Course c = (Course) result.get(0);
            CourseType ct = new CourseType(c);
            return ct;
            }
            } catch (Exception e) {
                int i = 0;
            }finally {
            s.close();              //Session schließen egal ob Erfolg oder Fehler
        }
        return null;
    }

    /**
     * Web service operation
     * @param parameter
     */
    @WebMethod(operationName = "saveCourseDetail")
    public String saveCourseDetail(@WebParam(name = "parameter") CourseType parameter) {
        SessionFactory sf = HibernateUtil.getSessionFactory();  //Initialisierung der SessionFactory
        Session s = sf.openSession();                           //Öffne eine Session 
        Transaction tx = null;
        
        try {
            tx = s.beginTransaction();  
            String hql= "UPDATE Course C SET C.title = :title, C.description = :description WHERE C.coursePk = :id";
            Query query = s.createQuery(hql);                   //HQL Query zuweisen
            query.setParameter("id", parameter.getCoursePk()); 
            query.setParameter("title", parameter.getTitle());
            query.setParameter("description", parameter.getDescription());
            
            int result = query.executeUpdate();
            tx.commit();
            return result + "Kurs aktualisiert";
            
            
        } catch (Exception e) {
            int i = 1;
        }finally {
            s.close();              //Session schließen egal ob Erfolg oder Fehler
        }
       return null; 
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getRole")
    public String getRole(@WebParam(name = "lResp") LoginResponse lResp) {
        SessionFactory sf = HibernateUtil.getSessionFactory();  //Initialisierung der SessionFactory
        Session s = sf.openSession();                           //Öffne eine Session 
        Transaction tx = null;
        
        String role = null;
        
        try {
            tx = s.beginTransaction();
            String hql_role = "FROM Person WHERE personPk = :id";
            Query query_role = s.createQuery(hql_role);
            query_role.setParameter("id", Integer.parseInt(lResp.getUserId()));
            List result_role = query_role.list();
            
            if (result_role.size() > 0){
                Person p = (Person) result_role.get(0);
                role = p.getRole();
            }
                    
        } catch (Exception e) {
        }finally {
            s.close();              //Session schließen egal ob Erfolg oder Fehler
        }
        return role;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllCourses")
    public CourseListType getAllCourses(@WebParam(name = "courseAll") CourseType courseAll) {
        CourseListType courseList = new CourseListType();
        ArrayList al = new ArrayList();
        courseList.setcLT(al);
        
        SessionFactory sf = HibernateUtil.getSessionFactory();  //Initialisierung der SessionFactory
        Session s = sf.openSession();                           //Öffne eine Session 
        Transaction tx = null;
        
        try {
            tx = s.beginTransaction();  
            String hql= "FROM Course";
            Query query = s.createQuery(hql);                   //HQL Query zuweisen
            //query.setParameter("title", courseAll.getTitle());                    //Wert für die id einfügen (gegen SQL Injection!)
            List results = query.list();   
            
            //Course courseFromDb = (Course) results.get(0);
            
            for(int x = 0; x<results.size(); x++){
               Course c = (Course) results.get(x);
               CourseType ct = new CourseType(c);
               courseList.addCourseListType(ct);
               
               // courseList.addCourseListType(new CourseType((Course)results.get(x)));
               //each result is cast into a course, saved as a coursetype object into a the list called courseList
               
            }

            
        } catch (Exception e) {
            int i = 0;
        }finally {
            s.close();              //Session schließen egal ob Erfolg oder Fehler
        }
               
        return courseList;
    }

    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteCourse")
    public void deleteCourse(@WebParam(name = "deleteParameter") CourseType deleteParameter) {
        SessionFactory sf = HibernateUtil.getSessionFactory();  //Initialisierung der SessionFactory
        Session s = sf.openSession();                           //Öffne eine Session 
        Transaction tx = null;
        
        try {
            tx = s.beginTransaction();
            
            // Kurs holen, der zur ID gehört
            String hql = "FROM Course WHERE coursePk = :id";
            Query query = s.createQuery(hql);
            query.setParameter("id", deleteParameter.getCoursePk());
  
            //Code von Philipp Urbauer angepasst auf Kurs
            List<Course> cList = query.list(); //Suche nach dem entsprechenden Kurs
            if(!cList.isEmpty()){ //Liste darf nicht leer sein
                if(!cList.get(0).getPersonCourseMemberships().isEmpty()){ // Memberships auch nicht

                    Set<PersonCourseMembership> pcmSet = cList.get(0).getPersonCourseMemberships();
                    for (Iterator<PersonCourseMembership> iterator = pcmSet.iterator(); iterator.hasNext();) {
                        PersonCourseMembership next = iterator.next(); //Durchspringen der Membership Einträge
                        s.delete(next); //Löschen des aktuellen Eintrags in Membership
                    }
                }
            }
            
            s.delete(cList.get(0)); //zuletzt noch den Kurslöschen
            tx.commit();
            
        } catch (Exception e) {
            System.out.println(e);
            
        } finally {
            s.close();              //Session schließen egal ob Erfolg oder Fehler
        }

    }
    
/**
     * Web service operation
     */
    @WebMethod(operationName = "createNewCourse")
    public String createNewCourse(@WebParam(name = "teacherId") LoginResponse teacherId, @WebParam(name = "newCourse") CourseType newCourse) {
        SessionFactory sf = HibernateUtil.getSessionFactory();  //Initialisierung der SessionFactory
        Session s = sf.openSession();                           //Öffne eine Session 
        Transaction tx = null;
             
        try {
            tx = s.beginTransaction();
            
            Course c = new Course();
            c.setDescription(newCourse.getDescription());
            c.setTitle(newCourse.getTitle());
            
            Integer primaryKey = (Integer)s.save(c);
            
            PersonCourseMembership pcm = new PersonCourseMembership();
            int tId = Integer.parseInt(teacherId.getUserId());
            pcm.setId(new PersonCourseMembershipId(tId, primaryKey));
            pcm.setNote(1);
            
            s.save(pcm);
            
            tx.commit();
            } catch (Exception e) {
            int i = 1;
            
        }finally {
            s.close();              //Session schließen egal ob Erfolg oder Fehler
        }
            return "String";
    }

    
}
        
        
        
        
        


       


      
    


