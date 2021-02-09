package com.boast;

import com.boast.impl.Circle;
import com.boast.impl.Square;
import com.boast.impl.Trapezoid;
import com.boast.impl.Triangle;

import java.util.Random;

//Random figure generator class
public class RandomFigure {
    public static Figure getRandomFigure(){
        Random random = new Random();
        switch (random.nextInt(4)){
            case 0:
                return new Square(random.nextFloat(), Color.getRandomColor().toString());
            case 1:
                return new Circle(random.nextFloat(), Color.getRandomColor().toString());
            case 2:
                float a = random.nextFloat();
                float b = random.nextFloat();
                float c = Math.abs(a - b) + random.nextFloat() * (a + b - Math.abs(a - b));
                return new Triangle(a, b, c, Color.getRandomColor().toString());
            case 3:
                a = random.nextFloat();
                b = random.nextFloat();
                c = random.nextFloat();
                float d1 = Math.abs(b+c-a);
                float d2 = Math.abs(b-c-a);
                float d = d1 + random.nextFloat() * (d2 - d1);
                return new Trapezoid(a, b, c, d, Color.getRandomColor().toString());
        }
        return null;
    }
}
