package io.github.fabisev;

/**
 * Simple utility for testing Maven Central publishing.
 */
public class StringUtils {

    /**
     * Reverses a string.
     *
     * @param input the string to reverse
     * @return the reversed string, or null if input is null
     */
    public static String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }
}
