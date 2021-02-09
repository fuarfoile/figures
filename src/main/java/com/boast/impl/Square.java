package com.boast.impl;

import com.boast.Figure;

public class Square implements Figure {

    private float sideLength;
    private String color;

    public Square(float sideLength, String color){
        this.sideLength = sideLength;
        this.color = color;
    }

    public void draw(){
        System.out.println("****\n****\n****\n****");
    }

    public float getArea(){
        return sideLength*sideLength;
    }

    public String getColor(){
        return color;
    }

    public float getSideLength(){
        return sideLength;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + String.format("%.3f", getArea()) + " square units, color: " + color + ", side length: " + String.format("%.3f", sideLength);
    }
}
