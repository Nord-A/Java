package com.osorio;

public class Main {

    public static void main(String[] args) {
	    // width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        // Task from video. Find the register symbol from unicode-table.com/en/#control-character

        char registerSymbol ='\u00AE';
        System.out.println("The register symbol is: " + registerSymbol);
    }
}
