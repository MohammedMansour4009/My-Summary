package com.example.mysummary.model.mawad;

public class Mawad {
    private String name;
    private int id;

    public Mawad(String name, int id) {
        this.id=id;
        this.name = name;
    }
    public Mawad(){};



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
