/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Geo
 */
public class Student {

    //fields
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private float tuitionFees;

    //getter
    public String getFirstName() {
        return firstName;
    }

    //setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //getter
    public String getLastName() {
        return lastName;
    }

    //setter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //getter
    public LocalDate getDateOfBirst() {
        return dateOfBirth;
    }

    //setter
    public void setDateOfBirst(LocalDate dateOfBirst) {
        this.dateOfBirth = dateOfBirst;
    }

    //getter
    public float getTuitionFees() {
        return tuitionFees;
    }

    //setter
    public void setTuitionFees(float tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + 
                ", dateOfBirth=" + dateOfBirth + ", tuitionFees=" + tuitionFees + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.firstName);
        hash = 47 * hash + Objects.hashCode(this.lastName);
        hash = 47 * hash + Objects.hashCode(this.dateOfBirth);
        hash = 47 * hash + Float.floatToIntBits(this.tuitionFees);
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
        final Student other = (Student) obj;
        if (Float.floatToIntBits(this.tuitionFees) != Float.floatToIntBits(other.tuitionFees)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.dateOfBirth, other.dateOfBirth)) {
            return false;
        }
        return true;
    }
    
    //constructor
    public Student(String firstName, String lastName, LocalDate dateOfBirst, float tuitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirst;
        this.tuitionFees = tuitionFees;
    }

    //constructor simple
    public Student() {
    }

}
