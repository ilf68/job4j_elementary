package ru.job4j.array;

public class ArrayChar {
    @SuppressWarnings({"checkstyle:WhitespaceAfter", "checkstyle:ParenPad"})
    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        if (prefix.length <= word.length & prefix.length > 0) {
            for (int i = 0; i < prefix.length; i++) {
                if (prefix[i] != word[i]) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}

