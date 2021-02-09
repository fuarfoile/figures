package com.boast.impl;

import com.boast.Figure;

public class Circle implements Figure {

    private float radius;
    private String color;

    public Circle(float radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public void draw(){
        System.out.println(" **\n****\n****\n **");
    }

    public float getArea(){
        return (float) Math.PI * radius*radius;
    }

    public String getColor(){
        return color;
    }

    public float getRadius(){
        return radius;
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + String.format("%.3f", getArea()) + " square units, color: " + color + ", radius: " + String.format("%.3f", radius);
    }
}
