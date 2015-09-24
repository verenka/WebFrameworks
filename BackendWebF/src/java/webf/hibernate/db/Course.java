package webf.hibernate.db;
// Generated 09.04.2015 08:20:19 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Course generated by hbm2java
 */
public class Course  implements java.io.Serializable {


     private Integer coursePk;
     private String title;
     private String description;
     private Set personCourseMemberships = new HashSet(0);

    public Course() {
    }

	
    public Course(String title, String description) {
        this.title = title;
        this.description = description;
    }
    public Course(String title, String description, Set personCourseMemberships) {
       this.title = title;
       this.description = description;
       this.personCourseMemberships = personCourseMemberships;
    }
   
    public Integer getCoursePk() {
        return this.coursePk;
    }
    
    public void setCoursePk(Integer coursePk) {
        this.coursePk = coursePk;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Set getPersonCourseMemberships() {
        return this.personCourseMemberships;
    }
    
    public void setPersonCourseMemberships(Set personCourseMemberships) {
        this.personCourseMemberships = personCourseMemberships;
    }




}


