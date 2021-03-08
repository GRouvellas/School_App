/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecta;

import java.util.ArrayList;
import models.Assignment;
import models.Course;
import models.AssignmentPCourse;
import models.AssignmentPStudent;
import models.StudentPCourse;
import models.TrainerPCourse;
import models.Student;
import models.Trainer;

/**
 *
 * @author Geo
 */
public class ProjectA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<TrainerPCourse> trainerPCourseList = new ArrayList<>();
        ArrayList<StudentPCourse> studentPCourseList = new ArrayList<>();
        ArrayList<AssignmentPCourse> assignmentPCourseList = new ArrayList<>();
        ArrayList<AssignmentPStudent> assignmentPStudentList = new ArrayList();//may contain duplicates
        ArrayList<Course> courseList = new ArrayList<>();
        ArrayList<Trainer> trainerList = new ArrayList<>();
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Assignment> assignmentList = new ArrayList<>();

        ObjectsInArrayLists.addCoursesFromUser(trainerPCourseList, studentPCourseList,
                assignmentPCourseList, courseList);
        ObjectsInArrayLists.addTrainerForCourses(trainerPCourseList, trainerList);
        ObjectsInArrayLists.addStudentForCourses(studentPCourseList, studentList);
        ObjectsInArrayLists.addAssignmentForCourses(assignmentPCourseList, assignmentList);
        ObjectsInArrayLists.addAssignmentForStudents(studentPCourseList, assignmentPCourseList, assignmentPStudentList);

        DisplayLists.displayLists(studentList, trainerList, assignmentList, courseList, studentPCourseList, trainerPCourseList, assignmentPCourseList, assignmentPStudentList);
    }

}
