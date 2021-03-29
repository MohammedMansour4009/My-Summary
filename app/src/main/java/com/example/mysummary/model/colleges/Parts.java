package com.example.mysummary.model.colleges;

public class Parts {
    private String nameCourse;
    private int id;

    public Parts(String nameCourse, int id) {
        this.id=id;
        this.nameCourse = nameCourse;
    }
    public Parts(){};

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
