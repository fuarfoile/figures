package com.boast.impl;

import com.boast.Figure;

import java.util.Arrays;

public class Trapezoid implements Figure {

    private float[] sideLength = new float[4];
    private String color;

    public Trapezoid(float sideLengthTop, float sideLengthBottom, float sideLengthLeft, float sideLengthRight, String color){
        this.sideLength[0] = sideLengthTop;
        this.sideLength[1] = sideLengthBottom;
        this.sideLength[2] = sideLengthLeft;
        this.sideLength[3] = sideLengthRight;
        this.color = color;
    }

    public void draw(){
        System.out.println(" **\n **\n****\n****");
    }

    public float getArea(){
        return 0.5f * (sideLength[0] + sideLength[1]) *
                (float) Math.pow(
                            Math.pow(sideLength[2], 2) -
                                    Math.pow(
                                            (Math.pow(sideLength[1] - sideLength[0], 2) + Math.pow(sideLength[2], 2) - Math.pow(sideLength[3], 2)) /
                                                    (2 * (sideLength[1] - sideLength[0])),
                                            2),
                            0.5);
    }

    public String getColor(){
        return color;
    }

    public float getSideLength(int side){
        if(side >= 0 && side < 4) {
            return sideLength[side];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public float getHeight(){
        return getArea() * 2 / (sideLength[0] + sideLength[1]);
    }

    @Override
    public String toString() {
        return "Figure: trapezoid, area: " + String.format("%.3f", getArea()) + " square units, color: " + color + ", height: " + String.format("%.3f", getHeight()) + ", sides length: " + Arrays.toString(sideLength);
    }
}
