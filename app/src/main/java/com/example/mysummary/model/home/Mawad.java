package com.example.mysummary.model.home;

public class Mawad {
    private String nameCourse;
    private int id;

    public Mawad(String nameCourse, int id) {
        this.id=id;
        this.nameCourse = nameCourse;
    }
    public Mawad(){};



    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
