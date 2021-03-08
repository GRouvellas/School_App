/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Geo
 */
public class AssignmentPStudent {
    private Student student;
    private ArrayList<Assignment> assignments = new ArrayList<>();

    //getter
    public Student getStudent() {
        return student;
    }

    //setter
    public void setStudent(Student student) {
        this.student = student;
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
        return "AssignmentPStudent{" + "student=" + student + ", assignments=" + assignments + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.student);
        hash = 59 * hash + Objects.hashCode(this.assignments);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AssignmentPStudent other = (AssignmentPStudent) obj;
        if (!Objects.equals(this.student, other.student)) {
            return false;
        }
        if (!Objects.equals(this.assignments, other.assignments)) {
            return false;
        }
        return true;
    }
    
    //constructor
    public AssignmentPStudent(Student student) {
        this.student = student;
    }
    
    //constructor simple
    public AssignmentPStudent() {
    }
    
      
}
