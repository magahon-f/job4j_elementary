package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        String tempRes = String.valueOf(symbol);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
                tempRes = String.valueOf(symbol) + counter;
            } else {
                result += tempRes;
                counter = 1;
                symbol = input.charAt(i);
                tempRes = String.valueOf(symbol);
            }
        }
        return result + tempRes;
    }
}
