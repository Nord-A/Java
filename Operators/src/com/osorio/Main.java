package com.osorio;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;

        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;

        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;

        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;

        System.out.println("result is now = " + result);
        result++;
        System.out.println("result is now = " + result);
        result--;
        System.out.println("result is now = " + result);

        result += 2;
        System.out.println("result is now = " + result);

        result *= 10;
        System.out.println("result is now = " + result);
        result -= 10;
        System.out.println("result is now = " + result);
        result /= 10;
        System.out.println("result is now = " + result);

        /*
        // A example of the boolean - if statement

        // This line will be executed because the boolean condition is true
        boolean isAlien = false;
        if (isAlien == false)
            */

        // This line wont execute becaues the boolean condition is not true
        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an Alien");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <=90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar)
            System.out.println("This is not supposed to happen");


        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");



        /* Assignment :
        1. create a double variable with the value of 20
        2. create a second variable of type double with the value of 80
        3. add both number up and multiply by 25
        4. use the remainder operator to figure out the remainder from the sum of 3# divided by 40
        5. write an "if" statement that displays a message "Total was over the limit"
            if the remaining total (4#) is equal to 20 or less
         */

        // my take on the task below

        double firstvar = 20;
        double secondvar = 80;

        double thirdvar = (firstvar + secondvar) * 25;

        double forthvar = thirdvar % 40;


        if (forthvar <=20)
            System.out.println("Total was over the limit");


        // teachers take on the task

        double myFirstValue = 20d;
        double mySecondValue = 80;
        double myTotal = (myFirstValue + mySecondValue) * 25;
        System.out.println("myTotal = " + myTotal);
        double theRemainder = myTotal % 40;

        if (theRemainder <= 20)
            System.out.println("Total was over the limit");



    }
}
