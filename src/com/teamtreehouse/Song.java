package com.teamtreehouse;

public class Song {
    String mytitle;
    String musician;
    String plist;
    String yturl;

    public Song(String mt, String m, String pl, String yu) {
        mytitle = mt;
        musician = m;
        plist = pl;
        yturl = yu;
    }

    public void show() {
        System.out.println("This is the title, artist, playlist, and Youtube link.");
        System.out.println(mytitle + ":" +
                musician + ":" +
                plist + ":" +
                yturl);
    }
}