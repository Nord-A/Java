package com.osorio;

public class Main {

    public static void main(String[] args) {
        // width of int is = 32 (4 bytes)
	    int myIntValue = 5 / 2;
	    // width of float is = 32 (4 bytes)
	    float myFloatValue = 5f / 3;
	    // width of double is = 64 (8 bytes)
	    double myDoubleValue = 5d / 3;
        System.out.println("myIntValur = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println(" myDoubleValue = " + myDoubleValue);

        double numPounds = 200d;

        double convertedKilograms = numPounds * 0.45359237d;

        System.out.println("In kilos: " + convertedKilograms);

    }
}
