package com.myandroidapps.goneil.chores;

/**
 * Created by goneil on 9/29/15.
 */
public class Chore {
    public String name;
    public String details;

    public Chore(String name, String details) {
        this.name = name;
        this.details = details;
    }

    @Override
    public String toString() {
        return name + ": " + details;
    }
}
