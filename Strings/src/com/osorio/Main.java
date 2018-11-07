package com.osorio;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // and the "ninth primitive data" is not a primitive data type, but a class

        String myString = "This is a string";
        System.out.println(" This is equal to a String: " + myString);
        myString = myString + ", and this is more.";
        System.out.println(" This is equal to a String: " + myString);
        myString = myString + " \u00A9 2017";
        System.out.println(" This is equal to a String: " + myString);

        String numberString = "250,55";
        numberString = numberString + "49,95";
        System.out.println("The result is: " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to: " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("lastString Value is: " + lastString);


    }
}
