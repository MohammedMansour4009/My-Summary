package com.example.mysummary.model.choises;

import android.net.Uri;

public class Choises {
private int uri;
private String name;
    private int id;

    public Choises(int uri, String name,int id) {
        this.uri = uri;
        this.name = name;
        this.id=id;
    }

    public Choises(String name) {
        this.name = name;
    }

    public int getUri() {
        return uri;
    }

    public void setUri(int uri) {
        this.uri = uri;
    }

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
