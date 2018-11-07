package com.osorio;


public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");
        porsche.setColour("Black");
        porsche.setDoors(4);
        porsche.setWheels(4);
        porsche.setEngine("V8");

        System.out.println("The car model is " + porsche.getModel() + ", the colour is " + porsche.getColour()
                + " with " + porsche.getDoors() + " doors. " + porsche.getWheels() + " wheels and a " + porsche.getEngine() );


        holden.setModel("Commodore");
        holden.setColour("White");
        holden.setDoors(4);
        holden.setWheels(4);
        holden.setEngine("V12");

        System.out.println("The car model is " + holden.getModel() + ", the colour is " + holden.getColour()
                + " with " + holden.getDoors() + " doors. " + holden.getWheels() + " wheels and a " + holden.getEngine() );

    }
}
