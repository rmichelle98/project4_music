package com.teamtreehouse;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Vocalist miles = new TrumpetPlayer("Miles Davis", "USA", "jazz", "1950s", "brass");
        Vocalist gary = new Guitarist("Gary Clark Jr", "USA", "blues", "2010s", 6);
        Vocalist louis = new TrumpetPlayer("Louis Armstrong", "USA", "blues", "1920s", "brass");
        Vocalist jimi = new Guitarist("Jimi Hendrix", "USA", "rock", "1960s", 5);
        Vocalist giveon = new Vocalist("Giveon", "USA", "R&B", "2010s");
        Vocalist jhene = new Vocalist("Jhene Aiko", "USA", "R&B", "2010s");


        ArrayList<Song> library = new ArrayList<>();   // Create our library
        library.add(new Song("World We Created", "Giveon", "Shower", "https://www.youtube.com/watch?v=n30BHPW0w3Y"));
        library.add(new Song("Moments", "Jhene Aiko", "Car", "https://www.youtube.com/watch?v=4XlxoQoiYYg"));
        library.add(new Song("So What", "Miles Davis", "Jazz", "https://www.youtube.com/watch?v=zqNTltOGh5c"));
        library.add(new Song("Come Together", "Gary Clark Jr", "Blues", "https://www.youtube.com/watch?v=9riFu5CQnBw"));
        library.add(new Song("When The Saints Go Marching In", "Louis Armstrong", "Blues", "https://www.youtube.com/watch?v=wyLjbMBpGDA"));
        library.add(new Song("Purple Haze", "Jimi Hendrix", "Rock", "https://www.youtube.com/watch?v=WGoDaYjdfSg"));

        for (int i = 0; i < library.size(); i++) {
            library.get(i).show();
            //System.out.println(i);
        }

    }
}

