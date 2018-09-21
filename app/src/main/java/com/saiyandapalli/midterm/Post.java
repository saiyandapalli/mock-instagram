package com.saiyandapalli.midterm;

import java.io.Serializable;


public class Post implements Serializable{
    String firebaseImageUrl;
    String name;

    public Post(){}

    public Post(String firebaseImageUrl, String name) {
        this.name = name;
        this.firebaseImageUrl = firebaseImageUrl;
    }

    public String getFirebaseImageUrl() {
        return firebaseImageUrl;
    }

    public void setFirebaseImageUrl(String firebaseImageUrl) {
        this.firebaseImageUrl = firebaseImageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
