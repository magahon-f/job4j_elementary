package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        int sizeWord = word.length - 1;
        int sizePostfix = postfix.length - 1;
        for (int i = sizePostfix; i >= 0; i--) {
            if (word[sizeWord] != postfix[i]) {
                result = false;
                break;
            } else {
                sizeWord--;
            }
        }
        return result;
    }
}
