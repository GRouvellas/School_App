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
public class TrainerPCourse {

    //fields
    private Course course;
    ArrayList<Trainer> trainers = new ArrayList<>();

    //getter
    public Course getCourse() {
        return course;
    }

    //setter
    public void setCourse(Course course) {
        this.course = course;
    }

    //getter 
    public ArrayList<Trainer> getTrainers() {
        return trainers;
    }

    //setter
    public void setTrainers(ArrayList<Trainer> trainers) {
        this.trainers = trainers;
    }

    @Override
    public String toString() {
        return "TrainerPCourse{" + "course=" + course + ", trainers=" + trainers + '}';
    }

    //constructor course
    public TrainerPCourse(Course course) {
        this.course = course;
    }
    
    //constructor simple
    public TrainerPCourse() {
    }

}
