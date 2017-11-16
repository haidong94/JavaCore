package com.example.hhdong.myapplication;

/**
 * Created by hhdong on 11/15/2017.
 */

public enum Light {
    L1(true,"trai tren"), L2(true,"trai duoi"), L3(true,"phai tren"), L4(true,"phai duoi");

    private Boolean state;
    private String location;


    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    Light(Boolean state, String location) {
        this.state = state;
        this.location = location;
    }
}
