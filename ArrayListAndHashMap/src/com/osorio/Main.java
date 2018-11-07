package com.osorio;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {




        ArrayList<String> sports = new ArrayList<String>();

        sports.add("Football");
        sports.add("Boxing");


        for(String sport : sports) {
            System.out.println(sport);
        }

        // HashMap: Major cities and the year they were founded
        // Her you initialize a HashMap with a String and Integer called majorCities
        // Then you put the String value and the integer value in the hashmap as follows
        // put into majorCities the String, which is the name of the city, and the Integers
        // which is the postal code. See below.

        HashMap<String, Integer> majorCities = new HashMap<String, Integer>();

        majorCities.put("New York", 1624);
        majorCities.put("London", 43);
        majorCities.put("Mexico City", 1521);
        majorCities.put("Sao Paulo", 1554);


        // Then you do a for each loop

        for (String city : majorCities.keySet()) {

            System.out.println(city + " was founded in " + majorCities.get(city));

        }
    }
}
