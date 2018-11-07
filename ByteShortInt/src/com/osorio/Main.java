package com.osorio;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //  // int has a width of 32
        //int myMinValue = -2_147_483_648;
        //int myMaxValue = 2_147_483_647;
        //int myTotal = (myMinValue / 2);
        //System.out.println("myTotal: " + myTotal);
        //
        //// byte has a width of 8
        //byte myByteValue = -128;
        //byte myNewByteValue = (byte) (myByteValue / 2);
        //System.out.println("myNewByteTotal: " + myNewByteValue);
        //
        //// short has a width of 16
        //short myShortValue = 32767;
        //short myNewShortValue = (short) (myShortValue / 2);
        //
        //// has a width of 64
        //long myLongValue = 100L;

        byte justAByteValue = 10;
        short justAShortValue = 20;
        int justAIntValue = 50;
        long justALongValue = 50000L + 10L * (justAByteValue + justAIntValue + justAShortValue) ;
        short shortTotal = (short) (10000 + 10 * (justAByteValue + justAIntValue + justAShortValue));
        System.out.println("The total of long is: " + justALongValue);
        System.out.println("The total of short is: " + shortTotal);
    }
}
