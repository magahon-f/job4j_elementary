package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class EndsWithTest {
    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isFalse();
    }

    @Test
    public void whenEndWithPartOfPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = {'k', 'o'};
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isFalse();
    }

    @Test
    public void whenEndWithPartOfPrefixWithThreeSymbolsThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = {'1', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isFalse();
    }

    @Test
    public void whenEndWithPrefixWithThreeSymbolsThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = {'l', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isTrue();
    }

    @Test
    public void whenPostfixSizeIsEqualWordSizeAndEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = {'H', 'e', 'l', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isTrue();
    }

    @Test
    public void whenPostfixSizeIsEqualWordSizeAndNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] postfix = {'!', 'e', 'l', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, postfix);
        assertThat(result).isFalse();
    }
}