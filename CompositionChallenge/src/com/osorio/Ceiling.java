package com.osorio;

public class Ceiling {

    private int height;
    private int paintedCeiling;

    public Ceiling(int height, int paintedCeiling) {
        this.height = height;
        this.paintedCeiling = paintedCeiling;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedCeiling() {
        return paintedCeiling;
    }
}
