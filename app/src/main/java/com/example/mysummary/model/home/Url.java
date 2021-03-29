package com.example.mysummary.model.home;

public class Url {
    private  String name;
    private String Url;
    private int id;

    public Url(String name, String url) {
        this.name = name;
        Url = url;
    }
    public Url(String name, int id) {
        this.name = name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
