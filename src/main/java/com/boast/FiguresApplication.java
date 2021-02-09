package com.boast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FiguresApplication {
    public static void main(String[] args) {
        Random random = new Random();

        List<Figure> figures = new ArrayList<Figure>();
        int arrayLen = random.nextInt(10) + 1;

        for(int i = 0; i < arrayLen; i++){
            figures.add(RandomFigure.getRandomFigure());
        }

        System.out.println("Array length: " + arrayLen);
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
