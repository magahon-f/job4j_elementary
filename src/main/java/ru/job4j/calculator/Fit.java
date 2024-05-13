package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        if (height <= 0 || height > 250) {
            throw new IllegalArgumentException("Height must be greater than 0 and less than or equal to 250 cm.");
        }
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        if (height <= 0 || height > 250) {
            throw new IllegalArgumentException("Height must be greater than 0 and less than or equal to 250 cm.");
        }
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        try {
            short manHeight = 187;
            short womanHeight = 170;
            double man = manWeight(manHeight);
            double woman = womanWeight(womanHeight);
            System.out.println("Man 187 is " + man);
            System.out.println("Woman 170 is " + woman);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
