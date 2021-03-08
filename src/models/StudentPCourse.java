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
public class StudentPCourse {

    //fields
    private Course course;
    ArrayList<Student> students = new ArrayList<>();

    //getter
    public Course getCourse() {
        return course;
    }

    //setter
    public void setCourse(Course course) {
        this.course = course;
    }

    //getter
    public ArrayList<Student> getStudents() {
        return students;
    }

    //setter
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentPCourse{" + "course=" + course + ", students=" + students + '}';
    }

    //constructor
    public StudentPCourse(Course course) {
        this.course = course;
    }

    //constructor simple
    public StudentPCourse() {
    }
        

}