/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecta;

import models.Student;
import models.Trainer;
import models.Course;
import models.Assignment;
import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author Geo
 */
public class SyntheticData {

    private static Course synthCourse;
    private static Trainer synthTrainer;
    private static Student synthStudent;
    private static Assignment synthAssignment;

    public static Course getRandomSynthCourse() {
        //creates an array of Course objects with 4 preset elements, then picks one at random and returns it as the value
        //of the method
        Course[] arrayOfCourses = new Course[10];
        arrayOfCourses[0] = new Course("CB12", "Java", "part time", (LocalDate.parse("2020-10-05")), (LocalDate.parse("2021-03-10")));
        arrayOfCourses[1] = new Course("CB13", "C#", "full time", (LocalDate.parse("2020-10-20")), (LocalDate.parse("2021-01-10")));
        arrayOfCourses[2] = new Course("CB15", "JavaScript", "part time", (LocalDate.parse("2020-10-25")), (LocalDate.parse("2021-03-20")));
        arrayOfCourses[3] = new Course("CB16", "Python", "full time", (LocalDate.parse("2020-09-20")), (LocalDate.parse("2021-01-10")));
        arrayOfCourses[4] = new Course("CB01", "C", "full time", (LocalDate.parse("2020-09-15")), (LocalDate.parse("2020-11-16")));
        arrayOfCourses[5] = new Course("CB30", "Lua", "part time", (LocalDate.parse("2020-10-27")), (LocalDate.parse("2021-05-27")));
        arrayOfCourses[6] = new Course("CB23", "Ruby", "part time", (LocalDate.parse("2020-04-21")), (LocalDate.parse("2020-09-11")));
        arrayOfCourses[7] = new Course("CB28", "C++", "full time", (LocalDate.parse("2020-01-27")), (LocalDate.parse("2020-04-17")));
        arrayOfCourses[8] = new Course("CB07", "Pascal", "part time", (LocalDate.parse("2020-03-07")), (LocalDate.parse("2020-09-12")));
        arrayOfCourses[9] = new Course("CB04", "Basic", "full time", (LocalDate.parse("2020-06-08")), (LocalDate.parse("2020-09-23")));
        Random rand = new Random();
        int num = rand.nextInt(10);
        switch (num) {
            case 0:
                synthCourse = arrayOfCourses[0];
                break;
            case 1:
                synthCourse = arrayOfCourses[1];
                break;
            case 2:
                synthCourse = arrayOfCourses[2];
                break;
            case 3:
                synthCourse = arrayOfCourses[3];
                break;
            case 4:
                synthCourse = arrayOfCourses[4];
                break;
            case 5:
                synthCourse = arrayOfCourses[5];
                break;
            case 6:
                synthCourse = arrayOfCourses[6];
                break;
            case 7:
                synthCourse = arrayOfCourses[7];
                break;
            case 8:
                synthCourse = arrayOfCourses[8];
                break;
            case 9:
                synthCourse = arrayOfCourses[9];
                break;

        }
        return synthCourse;
    }

    public static Trainer getRandomSynthTrainer() {
        //creates an array of Trainer objects with 4 preset elements, then picks one at random and returns it as the value
        //of the method
        Trainer[] arrayOfTrainers = new Trainer[10];
        arrayOfTrainers[0] = new Trainer("Spyros", "Spyrou", "Java");
        arrayOfTrainers[1] = new Trainer("Giorgos", "Georgiou", "C#");
        arrayOfTrainers[2] = new Trainer("Markos", "Markou", "JavaScript");
        arrayOfTrainers[3] = new Trainer("Ioanna", "Ioannou", "Python");
        arrayOfTrainers[4] = new Trainer("Vasilis", "Mitsou", "Lua");
        arrayOfTrainers[5] = new Trainer("Isaac", "Newton", "C");
        arrayOfTrainers[6] = new Trainer("Albert", "Einstein", "Ruby");
        arrayOfTrainers[7] = new Trainer("Benjamin", "Franklin", "C++");
        arrayOfTrainers[8] = new Trainer("John", "Adams", "Pascal");
        arrayOfTrainers[9] = new Trainer("James", "Madison", "Basic");
        Random rand = new Random();
        int num = rand.nextInt(10);
        switch (num) {
            case 0:
                synthTrainer = arrayOfTrainers[0];
                break;
            case 1:
                synthTrainer = arrayOfTrainers[1];
                break;
            case 2:
                synthTrainer = arrayOfTrainers[2];
                break;
            case 3:
                synthTrainer = arrayOfTrainers[3];
                break;
            case 4:
                synthTrainer = arrayOfTrainers[4];
                break;
            case 5:
                synthTrainer = arrayOfTrainers[5];
                break;
            case 6:
                synthTrainer = arrayOfTrainers[6];
                break;
            case 7:
                synthTrainer = arrayOfTrainers[7];
                break;
            case 8:
                synthTrainer = arrayOfTrainers[8];
                break;
            case 9:
                synthTrainer = arrayOfTrainers[9];
                break;

        }
        return synthTrainer;
    }

    public static Student getRandomSynthStudent() {
        //creates an array of Student objects with 4 preset elements, then picks one at random and returns it as the value
        //of the method
        Student[] arrayOfStudents = new Student[10];
        arrayOfStudents[0] = new Student("Apostolos", "Apostolou", (LocalDate.parse("2000-09-18")), 2500);
        arrayOfStudents[1] = new Student("Michalis", "Michail", (LocalDate.parse("2010-03-20")), 2500);
        arrayOfStudents[2] = new Student("Maria", "Mariou", (LocalDate.parse("1995-02-01")), 2500);
        arrayOfStudents[3] = new Student("Athina", "Papadopoulou", (LocalDate.parse("1998-07-12")), 2500);
        arrayOfStudents[4] = new Student("Arthur", "Miller", (LocalDate.parse("1955-01-12")), 2500);
        arrayOfStudents[5] = new Student("Thomas", "Jefferson", (LocalDate.parse("1926-04-08")), 2500);
        arrayOfStudents[6] = new Student("Abraham", "Lincoln", (LocalDate.parse("1982-10-11")), 2500);
        arrayOfStudents[7] = new Student("Chistopher", "Nolan", (LocalDate.parse("1944-11-19")), 2500);
        arrayOfStudents[8] = new Student("Akira", "Kurosawa", (LocalDate.parse("1965-08-13")), 2500);
        arrayOfStudents[9] = new Student("Peter", "Jackson", (LocalDate.parse("1979-05-04")), 2500);
        Random rand = new Random();
        int num = rand.nextInt(10);
        switch (num) {
            case 0:
                synthStudent = arrayOfStudents[0];
                break;
            case 1:
                synthStudent = arrayOfStudents[1];
                break;
            case 2:
                synthStudent = arrayOfStudents[2];
                break;
            case 3:
                synthStudent = arrayOfStudents[3];
                break;
            case 4:
                synthStudent = arrayOfStudents[4];
                break;
            case 5:
                synthStudent = arrayOfStudents[5];
                break;
            case 6:
                synthStudent = arrayOfStudents[6];
                break;
            case 7:
                synthStudent = arrayOfStudents[7];
                break;
            case 8:
                synthStudent = arrayOfStudents[8];
                break;
            case 9:
                synthStudent = arrayOfStudents[9];
                break;

        }
        return synthStudent;
    }

    public static Assignment getRandomSynthAssignment() {
        //creates an array of Assignment objects with 4 preset elements, then picks one at random and returns it as the value
        //of the method
        Assignment[] arrayOfAssignments = new Assignment[10];
        arrayOfAssignments[0] = new Assignment("Assignment 1", "Design a Robot", LocalDate.parse("2020-11-18"), 30, 100);
        arrayOfAssignments[1] = new Assignment("Assignment 2", "Design a Spaceship", LocalDate.parse("2020-12-04"), 30, 100);
        arrayOfAssignments[2] = new Assignment("Assignment 3", "Design a Cypress", LocalDate.parse("2021-01-20"), 30, 100);
        arrayOfAssignments[3] = new Assignment("Assignment 4", "Design a School", LocalDate.parse("2021-02-14"), 30, 100);
        arrayOfAssignments[4] = new Assignment("Assignment 5", "Design a Car", LocalDate.parse("2021-05-02"), 30, 100);
        arrayOfAssignments[5] = new Assignment("Assignment 6", "Design a Hamburger", LocalDate.parse("2021-09-26"), 30, 100);
        arrayOfAssignments[6] = new Assignment("Assignment 7", "Design a Pizza", LocalDate.parse("2020-08-11"), 30, 100);
        arrayOfAssignments[7] = new Assignment("Assignment 8", "Design a Telescope", LocalDate.parse("2020-06-08"), 30, 100);
        arrayOfAssignments[8] = new Assignment("Assignment 9", "Design a Solar Panel", LocalDate.parse("2021-08-13"), 30, 100);
        arrayOfAssignments[9] = new Assignment("Assignment 10", "Design a Flower", LocalDate.parse("2021-09-30"), 30, 100);
        Random rand = new Random();
        int num = rand.nextInt(10);
        switch (num) {
            case 0:
                synthAssignment = arrayOfAssignments[0];
                break;
            case 1:
                synthAssignment = arrayOfAssignments[1];
                break;
            case 2:
                synthAssignment = arrayOfAssignments[2];
                break;
            case 3:
                synthAssignment = arrayOfAssignments[3];
                break;
            case 4:
                synthAssignment = arrayOfAssignments[4];
                break;
            case 5:
                synthAssignment = arrayOfAssignments[5];
                break;
            case 6:
                synthAssignment = arrayOfAssignments[6];
                break;
            case 7:
                synthAssignment = arrayOfAssignments[7];
                break;
            case 8:
                synthAssignment = arrayOfAssignments[8];
                break;
            case 9:
                synthAssignment = arrayOfAssignments[9];
                break;
        }
        return synthAssignment;
    }

    public SyntheticData() {
    }
    
}
