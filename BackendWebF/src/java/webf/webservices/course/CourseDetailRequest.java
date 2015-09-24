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
public class CourseDetailRequest {
    private String coursePk;

    public String getCoursePk() {
        return coursePk;
    }

    public void setCoursePk(String coursePk) {
        this.coursePk = coursePk;
    }
    
    public CourseDetailRequest() {
    }
    
}
