package com.example.mysummary.model.home;

import android.net.Uri;

public class Colleges {
    private int img;
    private String nameCollege;

    public Colleges(int img, String nameCollege) {
        this.img = img;
        this.nameCollege = nameCollege;
    }

    public Colleges() {
    }

    public String getNameCollege() {
        return nameCollege;
    }

    public void setNameCollege(String nameCollege) {
        this.nameCollege = nameCollege;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
