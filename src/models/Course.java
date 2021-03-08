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
public class Course {

    //fields
    private String title;
    private String stream;
    private String type;
    private LocalDate start_date;
    private LocalDate end_date;

    //getter
    public String getTitle() {
        return title;
    }

    //setter
    public void setTitle(String title) {
        this.title = title;
    }

    //getter
    public String getStream() {
        return stream;
    }

    //setter
    public void setStream(String stream) {
        this.stream = stream;
    }

    //getter
    public String getType() {
        return type;
    }

    //setter
    public void setType(String type) {
        this.type = type;
    }

    //getter
    public LocalDate getStart_date() {
        return start_date;
    }

    //setter
    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    //getter
    public LocalDate getEnd_date() {
        return end_date;
    }

    //setter
    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    @Override
    public String toString() {
        return "Course{" + "title=" + title + ", stream=" + stream + ", type=" + type
                + ", start_date=" + start_date + ", end_date=" + end_date + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.title);
        hash = 59 * hash + Objects.hashCode(this.stream);
        hash = 59 * hash + Objects.hashCode(this.type);
        hash = 59 * hash + Objects.hashCode(this.start_date);
        hash = 59 * hash + Objects.hashCode(this.end_date);
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
        final Course other = (Course) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.stream, other.stream)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.start_date, other.start_date)) {
            return false;
        }
        if (!Objects.equals(this.end_date, other.end_date)) {
            return false;
        }
        return true;
    }
    
    //constructor
    public Course(String title, String stream, String type,
            LocalDate start_date, LocalDate end_date) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    //constructor simple
    public Course() {
    }

}
