package com.osorio;

public class Lamp {

    private String style;
    private boolean battary;
    private int globRating;

    public Lamp(String style, boolean battary, int globRating) {
        this.style = style;
        this.battary = battary;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }


    public String getStyle() {
        return style;
    }

    public boolean isBattary() {
        return battary;
    }

    public int getGlobRating() {
        return globRating;
    }
}
