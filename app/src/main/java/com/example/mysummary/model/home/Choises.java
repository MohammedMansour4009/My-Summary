package com.example.mysummary.model.home;

import android.net.Uri;

public class Choises {
private Uri uri;
private String name;

    public Choises(Uri uri, String name) {
        this.uri = uri;
        this.name = name;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
