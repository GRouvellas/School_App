/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecta;

import java.util.ArrayList;
import models.Assignment;
import models.AssignmentPStudent;
import models.Student;
import models.Trainer;

/**
 *
 * @author Geo
 */
public class RemoveDuplicates {

    public static ArrayList<Trainer> removeDublicateTrainers(ArrayList<Trainer> y) {
        //creates a new Trainer Arraylist and then checks if an element of the Trainer ArrayList
        // y exists in the new ArrayList. If it does not then it gets stored in the new
        // Arraylist (thus giving us a new ArrayList without duplicates)
        ArrayList<Trainer> newTrainerList = new ArrayList<>();
        for (Trainer x : y) {
            if (!newTrainerList.contains(x)) {
                newTrainerList.add(x);
            }
        }
        return newTrainerList;
    }

    public static ArrayList<Student> removeDublicateStudents(ArrayList<Student> y) {
        //creates a new Student Arraylist and then checks if an element of the Student ArrayList
        // y exists in the new ArrayList. If it does not then it gets stored in the new
        // Arraylist (thus giving us a new ArrayList without duplicates)
        ArrayList<Student> newStudentList = new ArrayList<>();
        for (Student x : y) {
            if (!newStudentList.contains(x)) {
                newStudentList.add(x);
            }
        }
        return newStudentList;
    }

    public static ArrayList<Assignment> removeDublicateAssignments(ArrayList<Assignment> y) {
        //creates a new Assignment Arraylist and then checks if an element of the Assignment ArrayList
        // y exists in the new ArrayList. If it does not then it gets stored in the new
        // Arraylist (thus giving us a new ArrayList without duplicates)
        ArrayList<Assignment> newAssignmentList = new ArrayList<>();
        for (Assignment x : y) {
            if (!newAssignmentList.contains(x)) {
                newAssignmentList.add(x);
            }
        }
        return newAssignmentList;
    }

        public static ArrayList<AssignmentPStudent> removeDublicateAssignmentPStudents(ArrayList<AssignmentPStudent> y) {
        //creates a new Assignment Arraylist and then checks if an element of the Assignment ArrayList
        // y exists in the new ArrayList. If it does not then it gets stored in the new
        // Arraylist (thus giving us a new ArrayList without duplicates)
        ArrayList<AssignmentPStudent> newAssignmentList = new ArrayList<>();
        for (AssignmentPStudent x : y) {
            if (!newAssignmentList.contains(x)) {
                newAssignmentList.add(x);
            }
        }
        return newAssignmentList;
    }
        
}
