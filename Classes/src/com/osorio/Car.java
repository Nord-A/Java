package com.osorio;

/**
 * Created by luisosoriolutzen on 12.08.17.
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;


    public void setDoors(int doors){

        int validDoorNumber = doors;
        if((validDoorNumber <=4) && (validDoorNumber >0)) {
            this.doors = doors;
        } else{
            this.doors = 0000;
        }
    }

    public int getDoors(){
        return this.doors;
    }


    public void setWheels(int wheels){
        int validWheelNumber = wheels;
        if((validWheelNumber) <= 4 && (validWheelNumber >0)) {
            this.wheels = wheels;
        }else {
            this.wheels = 0;
        }
    }

    public int getWheels(){
        return this.wheels;
    }


    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }else {
            this.model = "Unknown";
        }

    }

    public String getModel(){
        return this.model;
    }


    public void setEngine(String engine){
        String validEngine = engine.toLowerCase();
        if(validEngine.equals("v8") || (validEngine.equals("v12"))){
            this.engine = engine;
        }else {
            this.engine = "Unknown";
        }
    }

    public String getEngine(){
        return this.engine;
    }


    public void setColour(String colour){
        String validColour = colour.toLowerCase();
        if(validColour.equals("black") || validColour.equals("white")){
            this.colour = colour;
        }else {
            this.colour = "Unknown";
        }
    }

    public String getColour(){
        return this.colour;
    }






}
