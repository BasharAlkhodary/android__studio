package com.example.bankofpalestine.activities.models;

public class Notifications {
    private int id;
    private String pay;
    private String date;
    private String post;

    public Notifications(int id, String pay, String date, String post) {
        this.id = id;
        this.pay = pay;
        this.date = date;
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
