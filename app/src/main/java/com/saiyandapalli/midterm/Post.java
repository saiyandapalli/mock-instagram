package com.saiyandapalli.midterm;

import java.io.Serializable;


public class Post implements Serializable{
    String firebaseImageUrl;
    String name;
    String email;

    public Post(){}

    public Post(String firebaseImageUrl, String email, String name) {
        this.name = name;
        this.email = email;
        this.firebaseImageUrl = firebaseImageUrl;
    }

    public String getFirebaseImageUrl() {
        return firebaseImageUrl;
    }

    public void setFirebaseImageUrl(String firebaseImageUrl) {
        this.firebaseImageUrl = firebaseImageUrl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
