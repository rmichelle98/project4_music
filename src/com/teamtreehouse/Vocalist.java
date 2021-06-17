package com.teamtreehouse;

public class Vocalist {
    String name;
    String country;
    String style;
    String timePeriod;

    public Vocalist(String n, String c, String s, String tp) {
        name = n;
        country = c;
        style = s;
        timePeriod = tp;
    }

     void show() {
        System.out.println("This is your Vocalist");
        System.out.println(name + ":" +
                country + ":" +
                style + ":" +
                timePeriod + ":");
    }
}
