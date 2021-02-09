package com.boast.impl;

import com.boast.Figure;

import java.util.Arrays;

public class Triangle implements Figure {

    private float[] sideLength = new float[3];
    private String color;

    //Arbitrary triangle constructor
    public Triangle(float sideLengthA, float sideLengthB, float sideLengthC, String color){
        this.sideLength[0] = sideLengthA;
        this.sideLength[1] = sideLengthB;
        this.sideLength[2] = sideLengthC;
        this.color = color;
    }

    //Right triangle constructor
    public Triangle(float legA, float legB, String color){
        this(legA, legB, (float) Math.pow(legA*legA + legB*legB, 0.5), color);
    }

    public void draw(){
        System.out.println("*\n**\n***\n****");
    }

    public float getArea(){
        float p = 0.5f * (sideLength[0] + sideLength[1] + sideLength[2]);
        return (float) Math.pow(p*(p-sideLength[0])*(p-sideLength[1])*(p-sideLength[2]), 0.5);
    }

    public String getColor(){
        return color;
    }

    public float getSideLength(int side){
        if(side >= 0 && side < 3) {
            return sideLength[side];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public float getHypotenuse(){
        float hypotenuse = 0;
        for (float side: sideLength){
            if (side > hypotenuse){
                hypotenuse = side;
            }
        }
        return hypotenuse;
    }

    @Override
    public String toString() {
        return "Figure: triangle, area: " + String.format("%.3f", getArea()) + " square units, color: " + color + ", hypotenuse: " + String.format("%.3f", getHypotenuse()) + ", sides length: " + Arrays.toString(sideLength);
    }
}
