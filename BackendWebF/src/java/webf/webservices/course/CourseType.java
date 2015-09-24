/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webf.webservices.course;

import webf.hibernate.db.Course;

/**
 *
 * @author verenka
 */
public class CourseType {
    private Integer coursePk;
    private String title;
    private String description;

    public CourseType() {
    }

    public CourseType(Course c) {
        this.coursePk = c.getCoursePk();
        this.title = c.getTitle();
        this.description = c.getDescription();
    }

    public Integer getCoursePk() {
        return coursePk;
    }

    public void setCoursePk(Integer coursePk) {
        this.coursePk = coursePk;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}

