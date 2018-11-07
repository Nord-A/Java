package com.osorio;

public class Main {

    public static void main(String[] args) {
          /* You can declare an int array in different ways

           you can :  int[] myIntArray;
                      myIntArray = new int[10];

           or you can put them together like this:

                      int[] myIntArray = new int[10];
          And the you can put the elements int the array slots/index
          like so:

           myIntArray[0] = 10;
           myIntArray[1] = 20;
           myIntArray[2] = 30;
           myIntArray[3] = 40;
           myIntArray[4] = 50;
           myIntArray[5] = 60;
           myIntArray[6] = 70;
           myIntArray[7] = 80;
           myIntArray[8] = 90;
           myIntArray[9] = 10;
           myIntArray[10] = 11;
           */

        int[] myIntArray = new int[25];
        // or int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};


        for (int i = 1; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }

        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }

        printArray(myIntArray);
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.println("printArray() " + i + ", value is " + array[i]);
        }

    }
}
