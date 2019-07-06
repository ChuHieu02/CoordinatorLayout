package com.example.chuhieu.coordinatorlayout.recyclerview;

public class Model {
    String name;
    int phone;

    public Model(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public Model() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
