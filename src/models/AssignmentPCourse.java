/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author Geo
 */
public class AssignmentPCourse {

    //fields
    private Course course;
    private ArrayList<Assignment> assignments = new ArrayList<>();

    //getter
    public Course getCourse() {
        return course;
    }

    //setter
    public void setCourse(Course course) {
        this.course = course;
    }

    //getter
    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    //setter
    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }

    @Override
    public String toString() {
        return "AssignmentPCourse{" + "course=" + course + ", assignments=" + assignments + '}';
    }

    //constructor
    public AssignmentPCourse(Course course) {
        this.course = course;
    }
    
    //constructor simple
    public AssignmentPCourse() {
    }
    
    
   }
