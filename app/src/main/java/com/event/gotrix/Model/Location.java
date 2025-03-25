package com.event.gotrix.Model;

public class Location {
    private int Id;
    private String Name;

    public Location() {
    }

    public int getId() {
        return Id;
    }

    @Override
    public String toString() {
        return Name;

    }

    public void setId(int id){
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
