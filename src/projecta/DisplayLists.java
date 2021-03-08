/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecta;

import java.util.ArrayList;
import java.util.Scanner;
import models.Assignment;
import models.AssignmentPCourse;
import models.AssignmentPStudent;
import models.Course;
import models.Student;
import models.StudentPCourse;
import models.Trainer;
import models.TrainerPCourse;

/**
 *
 * @author Geo
 */
public class DisplayLists {

    public static void displayLists(ArrayList<Student> studentList, ArrayList<Trainer> trainerList,
            ArrayList<Assignment> assignmentList, ArrayList<Course> courseList, ArrayList<StudentPCourse> studentPCourseList,
            ArrayList<TrainerPCourse> trainerPCourseList, ArrayList<AssignmentPCourse> assignmentPCourseList, ArrayList<AssignmentPStudent> assignmentPStudentList) {
        //puts the results of the methods of the class ObjectsInArrayLists in a switch statement and asks the user 
        //which one he wants to display
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("\nEnter the number of the List you wish to display from "
                    + "the following Menu: \n1. List of all the Students \n2. List of all "
                    + "the Trainers \n3. List of all the Assignments \n4. List of all the "
                    + "Courses \n5. List of all the Students per Course \n6. List of all "
                    + "the Trainers per Course \n7. List of all the Assignments per Course"
                    + "\n8. List of all the Assignments per Student \n9. List of Students that"
                    + " belong to more than one Courses \n10. Enter a date so as to see a list"
                    + " of all the Students who need to submit one or more Assignments on the "
                    + "same calendar week as the given date \n11. Exit this Menu");            
            num = Integer.parseInt(Checks.integerCheck(sc.nextLine()));
            switch (num) {
                case 1:
                    System.out.println(studentList);
                    break;
                case 2:
                    System.out.println(trainerList);
                    break;
                case 3:
                    System.out.println(assignmentList);
                    break;
                case 4:
                    System.out.println(courseList);
                    break;
                case 5:
                    System.out.println(studentPCourseList);
                    break;
                case 6:
                    System.out.println(trainerPCourseList);
                    break;
                case 7:
                    System.out.println(assignmentPCourseList);
                    break;
                case 8:
                    System.out.println(assignmentPStudentList);
                    break;
                case 9:
                    System.out.println("Students in more than one Courses: " + RemoveDuplicates.
                            removeDublicateStudents(ObjectsInArrayLists.multipleCoursesStudents(studentPCourseList)));
                    break;
                case 10:
                    System.out.println("The aforementioned Students are : " + RemoveDuplicates.removeDublicateStudents(ObjectsInArrayLists.
                            studentsWithAssignmentsEnding(assignmentPStudentList)));
                    break;
                case 11:
                    break;
                default:
                    System.out.println("Input a number from 1-11");
            }
        } while (num != 11);
    }

}
