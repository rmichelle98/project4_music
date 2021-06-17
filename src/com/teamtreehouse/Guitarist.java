package com.teamtreehouse;

public class Guitarist extends Vocalist {
    int numOfStrings;

    public Guitarist(String n, String c, String s, String tp, int nos) {
        super(n,c,s,tp);
        numOfStrings = nos;
    }
    public void show() {
        System.out.println("This is your Guitarist");
        System.out.println(name + ":" +
                country + ":" +
                style + ":" +
                timePeriod + ":" +
                numOfStrings);
    }
}
