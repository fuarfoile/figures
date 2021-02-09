package com.boast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Main class
public class FiguresApplication {
    public static void main(String[] args) {
        Random random = new Random();

        List<Figure> figures = new ArrayList<Figure>();
        int arrayLen = random.nextInt(10) + 1;

        //adding random number (arrayLen) of random figures to the array
        for(int i = 0; i < arrayLen; i++){
            figures.add(RandomFigure.getRandomFigure());
        }

        //Printing all figures from the array
        System.out.println("Array length: " + arrayLen);
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
