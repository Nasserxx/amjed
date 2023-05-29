package com.application.HochschuleUlm.ModelClasses;

public class RoomModel {

    String name,location;

    public RoomModel(String name, String lcoation) {
        this.name = name;
        this.location = lcoation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String lcoation) {
        this.location = lcoation;
    }
}
