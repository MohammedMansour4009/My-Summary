package com.example.mysummary.model.category;

public class Category {
    private int id;
    private  String  name;
    private int image;
    private String URL;

    public Category() {
    }

    public Category(int id, String name, int image, String URL) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.URL = URL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category(int id , String name, int image) {
        this.id=id;
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}