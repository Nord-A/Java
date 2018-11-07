package com.osorio;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {

        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }


}

public class Main {

    public static void main(String[] args) {

        // Regular array

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        // ArrayList and adding string : Luis

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Luis");


    //   It is not possible to make an arrayList of data type int like so:
        // ArrayList<int> intArrayList = new ArrayList<int>(); - This doesn't work.
        // But it is possible to make an ArrayList using integer values, by implementing a class
        // where integers are defined. See class IntClass above, and that it is used below,
        // taking the object made, from the constructor, and using it in the making of the
        // ArrayList intClassArrayList. But this is a bit messy. There is a better way See Integer below

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0;i <= 10; i++){
            intArrayList.add(Integer.valueOf(i));

        }
        for (int i =0; i<=10; i++){
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // java actually makes this for you Integer.value(56);
        int myInt = myIntValue; // java actually makes this for you myIntValue.intValue();


        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(Double dbl=0.0; dbl<=10.0; dbl +=0.5){
            myDoubleValues.add((dbl));
        }
        for (int i=0; i<myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i);
            System.out.println(i + " -- > " + value);
        }

    }


}
