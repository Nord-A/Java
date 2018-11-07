package com.osorio;

public class Main {

    public static void main(String[] args) {
        System.out.println("10.000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10.000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10.000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10.000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        System.out.println("**************");

        // For(initialize; termination; increment){
        // }

        for (int i = 0; i < 5; i++) {
            System.out.println(" Loop " + i + " Hello!");
        }

        System.out.println("***********");

        // Using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the result to the console window

        for (int i = 2; i < 9; i++) {
            System.out.println("10.000 at " + i + " 2% interest = " + calculateInterest(10000.0, i));
        }

        System.out.println("****************");

        // Notice the String.format("%.2f" input in the next code. This will sort the decimal points out at print 7.

        for (int i = 8; i >= 2; i--) {
            System.out.println("10.000 at " + i + " 2% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        int count = 0;

        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 3){
                    System.out.println("Exiting for loop");
                    break;
                }
            }

        }

    }

    // Create a for statement using any range of numbers
    // Determine if the number is a prime number using the isPrime method
    // If it is a prime number, print it out AND increment and a count of the
    // number of prime numbers found
    // if that number is a 3 exit the loop
    // hint: use the break; statement to exit the loop

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
