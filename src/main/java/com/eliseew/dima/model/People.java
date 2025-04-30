package com.eliseew.dima.model;

public class People {
    private int id;
    private String name;

    public People() {}

    public People(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public int getId(int i) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
