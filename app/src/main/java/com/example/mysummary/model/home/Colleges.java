package com.example.mysummary.model.home;

import android.net.Uri;

public class Colleges {
    private Uri img;
    private String nameCollege;

    public Colleges(Uri img, String nameCollege) {
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

    public Uri getImg() {
        return img;
    }

    public void setImg(Uri img) {
        this.img = img;
    }
}
