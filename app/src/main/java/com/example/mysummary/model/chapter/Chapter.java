package com.example.mysummary.model.chapter;

public class Chapter {
    private String nameCourse;
    private int id;

    public Chapter(String nameCourse,int id) {
        this.id=id;
        this.nameCourse = nameCourse;
    }
    public Chapter(){};

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
