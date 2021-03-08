package com.example.mysummary.model.home;

import android.net.Uri;

public class Colleges {
    private int id;
    private int img;
    private String nameCollege;

    public Colleges(int id, int img, String nameCollege) {
        this.id = id;
        this.img = img;
        this.nameCollege = nameCollege;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNameCollege() {
        return nameCollege;
    }

    public void setNameCollege(String nameCollege) {
        this.nameCollege = nameCollege;
    }
}
