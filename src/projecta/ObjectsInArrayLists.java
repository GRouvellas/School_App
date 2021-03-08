/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecta;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Scanner;
import models.Assignment;
import models.AssignmentPCourse;
import models.AssignmentPStudent;
import models.Course;
import models.Student;
import models.StudentPCourse;
import models.TrainerPCourse;
import models.Trainer;


/**
 *
 * @author Geo
 */
public class ObjectsInArrayLists {

    static Scanner sc = new Scanner(System.in);

    public static void addCoursesFromUser(ArrayList<TrainerPCourse> trainerPCourseList, ArrayList<StudentPCourse> studentPCourseList,
            ArrayList<AssignmentPCourse> assignmentPCourseList, ArrayList<Course> courseList) {
        //creates one or many new Course object(s) either with input from the user or by running the corresponding SyntheticData
        //method and stores it in 4 ArrayLists (the ArrayList with all the Course objects, the ArrayList with the TrainerPCourse
        // objects, the ArrayList with the StudentPCourse objects and the ArrayList with the AssignmentPCourse objects)
        String reply;
        System.out.println("Αdd a new Course");
        do {
            System.out.println("Do you want to type the data(y/n)");
            reply = sc.nextLine();
            if (reply.trim().equalsIgnoreCase("y")) {
                Course course = new Course();
                System.out.println("Add title");
                course.setTitle(sc.nextLine());
                System.out.println("Add stream");
                course.setStream(sc.nextLine());
                System.out.println("Add type");
                course.setType(sc.nextLine());
                System.out.println("Add start_date (yyyy-MM-dd)");                
                course.setStart_date(LocalDate.parse(Checks.dateCheck(sc.nextLine())));
                System.out.println("Add end_date (yyyy-MM-dd)");                
                course.setEnd_date(LocalDate.parse(Checks.dateCheck(sc.nextLine())));
                courseList.add(course);
                trainerPCourseList.add(new TrainerPCourse(course));
                studentPCourseList.add(new StudentPCourse(course));
                assignmentPCourseList.add(new AssignmentPCourse(course));
            } else {
                Course a = SyntheticData.getRandomSynthCourse();
                courseList.add(a);
                trainerPCourseList.add(new TrainerPCourse(a));
                studentPCourseList.add(new StudentPCourse(a));
                assignmentPCourseList.add(new AssignmentPCourse(a));
            }
            System.out.println("Do you want to add another course?(y/n)");
            reply = sc.nextLine();
        } while (reply.trim().equalsIgnoreCase("y"));
    }

    public static void addTrainerForCourses(ArrayList<TrainerPCourse> trainerPCourseList, ArrayList<Trainer> trainerList) {
        //creates one or many new Trainer object(s) either with input from the user or by running the corresponding SyntheticData
        //method and stores it in 2 ArrayLists (the ArrayList with all the Trainer objects and the Arraylist with all the
        // TrainerPCourse objects
        String reply;
        System.out.println("For every Course, add its trainer(s)");
        for (int i = 0; i < trainerPCourseList.size(); i++) {
            System.out.println("For course "
                    + trainerPCourseList
                            .get(i)
                            .getCourse()
                            .getTitle());
            System.out.println("Add a new Trainer");
            do {
                System.out.println("Do you want to type the data(y/n)");
                reply = sc.nextLine();
                if (reply.trim().equalsIgnoreCase("y")) {
                    Trainer trainer = new Trainer();
                    System.out.println("Add First Name");
                    trainer.setFirstName(sc.nextLine());
                    System.out.println("Add Last Name");
                    trainer.setLastName(sc.nextLine());
                    System.out.println("Add subject");
                    trainer.setSubject(sc.nextLine());
                    trainerList.add(trainer);
                    trainerPCourseList.get(i).getTrainers().add(trainer);
                } else {
                    Trainer a = SyntheticData.getRandomSynthTrainer();
                    trainerList.add(a);
                    trainerPCourseList.get(i).getTrainers().add(a);
                }
                System.out.println("Do you want to add another Trainer(y/n)?");
                reply = sc.nextLine();
            } while (reply.trim().equalsIgnoreCase("y"));
        }
    }

    public static void addStudentForCourses(ArrayList<StudentPCourse> studentPCourseList, ArrayList<Student> studentList) {
        //creates one or many new Student object(s) either with input from the user or by running the corresponding SyntheticData
        //method and stores it in 2 ArrayLists (the ArrayList with all the Student objects and the Arraylist with all the
        // StudentPCourse objects
        String reply;
        System.out.println("For every Course, add its student(s)");
        for (int i = 0; i < studentPCourseList.size(); i++) {
            System.out.println("For course "
                    + studentPCourseList
                            .get(i)
                            .getCourse()
                            .getTitle());
            System.out.println("Add a new Student");
            do {
                System.out.println("Do you want to type the data(y/n)");
                reply = sc.nextLine();
                if (reply.trim().equalsIgnoreCase("y")) {
                    Student student = new Student();
                    System.out.println("Add First Name");
                    student.setFirstName(sc.nextLine());
                    System.out.println("Add Last Name");
                    student.setLastName(sc.nextLine());
                    System.out.println("Add Date of Birth (yyyy-MM-dd)");
                    student.setDateOfBirst(LocalDate.parse(Checks.dateCheck(sc.nextLine())));
                    System.out.println("Add Tuition Fees");                    
                    student.setTuitionFees(Float.parseFloat(Checks.floatCheck(sc.nextLine())));                    
                    studentList.add(student);
                    studentPCourseList.get(i).getStudents().add(student);
                } else {
                    Student a = SyntheticData.getRandomSynthStudent();
                    studentList.add(a);
                    studentPCourseList.get(i).getStudents().add(a);
                }
                System.out.println("Do you want to add another Student(y/n)?");
                reply = sc.nextLine();
            } while (reply.trim().equalsIgnoreCase("y"));
        }
    }

    public static void addAssignmentForCourses(ArrayList<AssignmentPCourse> assignmentPCourseList, ArrayList<Assignment> assignmentList) {
        //creates one or many new Assignment object(s) either with input from the user or by running the corresponding SyntheticData
        //method and stores it in 2 ArrayLists (the ArrayList with all the Assignment objects and the Arraylist with all the
        // AssignmentPCourse objects
        String reply;
        System.out.println("For every Course, add its assignment(s)");
        for (int i = 0; i < assignmentPCourseList.size(); i++) {
            System.out.println("For course "
                    + assignmentPCourseList
                            .get(i)
                            .getCourse()
                            .getTitle());
            System.out.println("Add a new Assignment");
            do {
                System.out.println("Do you want to type the data(y/n)");
                reply = sc.nextLine();
                if (reply.trim().equalsIgnoreCase("y")) {
                    Assignment assignment = new Assignment();
                    System.out.println("Add Title");
                    assignment.setTitle(sc.nextLine());
                    System.out.println("Add Description");
                    assignment.setDescription(sc.nextLine());
                    System.out.println("Add SubDateTime (yyyy-MM-dd)");                    
                    assignment.setSubDateTime(LocalDate.parse(Checks.dateCheck(sc.nextLine())));                    
                    System.out.println("Add oralMark");                    
                    assignment.setOralMark(Integer.parseInt(Checks.integerCheck(sc.nextLine())));
                    System.out.println("Add totalMark");
                    assignment.setTotalMark(Integer.parseInt(Checks.integerCheck(sc.nextLine())));
                    assignmentList.add(assignment);
                    assignmentPCourseList.get(i).getAssignments().add(assignment);
                } else {
                    Assignment a = SyntheticData.getRandomSynthAssignment();
                    assignmentList.add(a);
                    assignmentPCourseList.get(i).getAssignments().add(a);
                }
                System.out.println("Do you want to add another Assignment(y/n)?");
                reply = sc.nextLine();
            } while (reply.trim().equalsIgnoreCase("y"));
        }
    }

    public static void addAssignmentForStudents(ArrayList<StudentPCourse> studentPCourseList,
            ArrayList<AssignmentPCourse> assignmentPCourseList, ArrayList<AssignmentPStudent> assignmentPStudentList) {
        //gets the Student from every studentPCourse object in the studentPCourseList and stores it in new AssignmentPStudent objects in assignmentPStudentList
        for (int i = 0; i < studentPCourseList.size(); i++) {
            for (int j = 0; j < studentPCourseList.get(i).getStudents().size(); j++) {
                assignmentPStudentList.add(new AssignmentPStudent(studentPCourseList.get(i).getStudents().get(j)));
            }
        }
        //checks for every Student in which Course it is, and then adds the Assignments of that Course to the Student(One of the given conditions of the project 
        //is that ALL THE STUDENTS WITHIN A COURSE HAVE THE ASSIGNMENTS OF THAT COURSE). Because of the program's structure,the Course objects in the objects of 
        //the ArrayLists assignmentPCourseList and studentPCourseList are the same and in the same order (for example the objects in the first position in both the
        //ArrayLists, let's call them AssignmentPCourse 0 and StudentPerCourse 0, will both have Course 0 as their Course object) which leads to : a)the size of the 
        //two Arraylists to be the same (assignmentPCourseList.size()= studentPCourseList.size()) and b) (assignmentPCourseList.get(j).getCourse to be tha same as 
        //studentPCourseList.get(j).getCourse for every (j).
        for (int i = 0; i < assignmentPStudentList.size(); i++) {
            for (int j = 0; j < assignmentPCourseList.size(); j++) {
                if (studentPCourseList.get(j).getStudents().contains(assignmentPStudentList.get(i).getStudent())) {
                    for (int k = 0; k < assignmentPCourseList.get(j).getAssignments().size(); k++) {
                        assignmentPStudentList.get(i).getAssignments().add(assignmentPCourseList.get(j).getAssignments().get(k));
                    }
                }
            }
        }
    }
    
    public static ArrayList<Student> multipleCoursesStudents(ArrayList<StudentPCourse> studentPCourseList) {//IT WILL ALSO SHOW STUDENTS THAT ARE REGISTERED TWICE IN A COURSE
        //creates two Student ArrayLists students and multipleCourseStudents. Checks every Student element in every Course element 
        //in the studentPCourseList and if it doesn't exist in the ArrayList<Student> students, it gets stored there. Otherwise the element gets stored in
        // multipleCourseStudents. Finally the method returns the multipleCourseStudents
        ArrayList<Student> students = new ArrayList();
        ArrayList<Student> multipleCourseStudentsList = new ArrayList();
        for (int i = 0; i < studentPCourseList.size(); i++) {
            for (int j = 0; j < studentPCourseList.get(i).getStudents().size(); j++) {
                if (!students.contains(studentPCourseList.get(i).getStudents().get(j))) {
                    students.add(studentPCourseList.get(i).getStudents().get(j));
                } else {
                    multipleCourseStudentsList.add(studentPCourseList.get(i).getStudents().get(j));
                }
            }
        }
        return multipleCourseStudentsList;//may contain duplicates
    }

    public static ArrayList<Student> studentsWithAssignmentsEnding(ArrayList<AssignmentPStudent> assignmentPStudentList) {
        //asks a date from the user and then first compares its year with the year of the getSubDateTime of every Assignment of 
        //every AssignmentPStudent of the assignmentPStudentList. In case of an equality it proceeds to a second comparison of
        // the number of the week of the given date with the number of the week of every getSubDateTime of every Assignment of every
        //AssignmentPStudent object that passed the first comparison. The AssignmentPStudent objects that pass both comparisons have 
        //their Student object stored in the ArrayList <Student> happyList
        LocalDate reply;
        System.out.println("Give a date (yyyy-MM-dd)");        
        reply = LocalDate.parse(Checks.dateCheck(sc.nextLine()));
        ArrayList<Student> happyList = new ArrayList<>();
        for (int i = 0; i < assignmentPStudentList.size(); i++) {
            for (int j = 0; j < assignmentPStudentList.get(i).getAssignments().size(); j++) {
                 LocalDate a = (assignmentPStudentList.get(i).getAssignments().get(j).getSubDateTime());
                 LocalDate b = (reply);
                   int weekOfA = a.get(WeekFields.ISO.weekOfYear());
                   int weekOfB = b.get(WeekFields.ISO.weekOfYear());                   
                 if (b.getYear()==(a.getYear())){
                     if(weekOfB==weekOfA){                 
                    happyList.add(assignmentPStudentList.get(i).getStudent());
                 }
                }
            }
        }
        return happyList;//may contain duplicates
    }

}
