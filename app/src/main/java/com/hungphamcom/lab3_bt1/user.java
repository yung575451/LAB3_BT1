package com.hungphamcom.lab3_bt1;

public class user {
    public String name;
    public String homeTown;

    public user(String name, String homeTown) {
        this.name = name;
        this.homeTown = homeTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }
}
