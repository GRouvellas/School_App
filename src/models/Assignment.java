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
public class Assignment {

    //fields
    private String title;
    private String description;
    private LocalDate subDateTime;
    private int oralMark;
    private int totalMark;

    //getter
    public String getTitle() {
        return title;
    }

    //setter
    public void setTitle(String title) {
        this.title = title;
    }

    //getter
    public String getDescription() {
        return description;
    }

    //setter
    public void setDescription(String description) {
        this.description = description;
    }

    //getter
    public LocalDate getSubDateTime() {
        return subDateTime;
    }

    //setter
    public void setSubDateTime(LocalDate subDateTime) {
        this.subDateTime = subDateTime;
    }

    //getter
    public int getOralMark() {
        return oralMark;
    }

    //setter
    public void setOralMark(int oralMark) {
        this.oralMark = oralMark;
    }

    //getter
    public int getTotalMark() {
        return totalMark;
    }

    //setter
    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "Assignment{" + "title=" + title + ", description=" + description + 
        ", subDateTime=" + subDateTime + ", oralMark=" + oralMark + ", totalMark=" + 
                totalMark + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.title);
        hash = 13 * hash + Objects.hashCode(this.description);
        hash = 13 * hash + Objects.hashCode(this.subDateTime);
        hash = 13 * hash + this.oralMark;
        hash = 13 * hash + this.totalMark;
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
        final Assignment other = (Assignment) obj;
        if (this.oralMark != other.oralMark) {
            return false;
        }
        if (this.totalMark != other.totalMark) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.subDateTime, other.subDateTime)) {
            return false;
        }
        return true;
    }
    

    //constructor
    public Assignment(String title, String description, LocalDate subDateTime, int oralMark, int totalMark) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    //constructor simple
    public Assignment() {
    }

}
