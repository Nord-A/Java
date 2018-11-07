package com.osorio;

public class Main {

    public static void main(String[] args) {
        // The difference of using the if statements and using switch
        // Example of if statement below
        int value = 1;
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        // Example of switch below

        int switchValue = 6;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;

            case 2:
                System.out.println("Value is 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println(" was a 3, or a 4, or a 5");
                System.out.println(" Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        // Challenge: Create a new switch statement using Char instead of int
        // Create a new char variable
        // Create a switch statement testing for
        // A, B, C, D, or E
        // Display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char switchChar = 'D';

        switch (switchChar) {
            case 'A':
                System.out.println("Char is A");
                break;

            case 'B':
                System.out.println("Char is B");
                break;

            case 'C':
                System.out.println("Char is C");
                break;

            case 'D':
            case 'E':
                System.out.println(switchChar + " was found");
                break;


            default:
                System.out.println("Char was not found");
                break;
        }


        // notice that if you use "toLowerCase" method then every letter in the string variable will be
        // set to lower case. Therefore be sure to use lowercase in the case tests.
        // You can also use "toupperCase"

        String month = "JaNuary";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("not sure");
                break;

        }

    }
}
