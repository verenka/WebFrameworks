/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webf.webservices.course;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author verenka
 */
public class CourseListType {
    private List<CourseType> cLT;

    public List<CourseType> getcLT() {
        return cLT;
    }

    public void setcLT(List<CourseType> cLT) {
        this.cLT = cLT;
    }
   
    public void addCourseListType(CourseType ct) {
        cLT.add(ct);
    }
    
    public CourseListType() {
    }
    
}
