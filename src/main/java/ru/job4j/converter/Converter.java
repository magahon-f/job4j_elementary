package ru.job4j.converter;

public class Converter {
    private static final float EURO_CONVERSION_RATE = 70;
    private static final float DOLLAR_CONVERSION_RATE = 60;

    public static float rubleToEuro(float value) {
        float result = value / EURO_CONVERSION_RATE;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / DOLLAR_CONVERSION_RATE;
        return result;
    }

    public static void main(String[] args) {
        float input = 140;
        float expected = 2;
        float output = rubleToEuro(input);
        boolean passed = Math.abs(expected - output) < 0.0001;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        input = 240;
        expected = 4;
        output = rubleToDollar(input);
        passed = Math.abs(expected - output) < 0.0001;
        System.out.println("240 rubles are 4 dollars. Test result : " + passed);
    }
}
