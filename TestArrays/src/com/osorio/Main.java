package com.osorio;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int arrInt [] = new int[5];

        arrInt[0] = 1;

        int i = 1;
        while (i <=4){
            arrInt[i ]= i+1;
                    i++;
        }

        System.out.println(arrInt[0]+ " " +arrInt[1]+ " " +arrInt[2]+ " " +arrInt[3]+ " " +arrInt[4] + "\n " +
                "------------------------");


        Scanner theScanner = new Scanner(System.in);
        ArrayList<Integer> theArray = new ArrayList<Integer>();

        System.out.println("please enter an array number and type in 0 when finished :)");
        int in = theScanner.nextInt();

        while (in != 0){
            theArray.add(in);
            in = theScanner.nextInt();
        }
            System.out.println("----------------------------");
            for(int j : theArray){
                System.out.println(j);
            }
    }
}

