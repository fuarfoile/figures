package com.boast;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Color {
    private static final List<String> colorList = Arrays.asList("Red", "Green", "Blue", "Yellow", "Magenta", "Cyan", "White", "Black", "Gray", "Light_gray", "Dark_gray", "Pink", "Orange", "Deep_blue", "Jet_black", "Gray_onyx", "White_marble");

    private int color;

    public Color(int colorId){
        if(colorList.size() > colorId && colorId >= 0) {
            color = colorId;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public static Color getRandomColor(){
        return new Color(new Random().nextInt(colorList.size()));
    }

    @Override
    public String toString() {
        return colorList.get(color);
    }
}
