package com.osorio;

public class Main {

    // notice that there are 2 different variations of the same while loop!
    // And right after that a matching for loop
    // secondly there is a do while loop

    public static void main(String[] args) {

        // in this example we are asking while if count is not 6 then print the message
        int count = 1;
        while (count != 6) {
            System.out.println("Count1 value is " + count);
            count++;
        }

        // in this example we are asking that while, this is true, if count is equal to 6 then break the loop
        count = 1;

        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count2 value is " + count);
            count++;

        }
       /* for (int i = 1; i < 6; i++) {                  // The matching for loop, for the above
           System.out.println("Count value is " + i);
        }*/


       // do while example and a challenge

        count = 1;

        do {
            System.out.println("Count3 value was " + count);
            count++;
        } while (count != 6);


        int number = 5;
        int finishNumber = 20;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            number++;
        }

        // Challenge: modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        number = 5;
        finishNumber = 20;
        int evenNumbersFound = 0;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }


            System.out.println("Even number " + number);
            number++;

            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }
        }
        System.out.println("Total even numbers found " + evenNumbersFound);

    }


    // Challenge: Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not
    // return true if an even number, otherwise false;


    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}




