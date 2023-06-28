package com.example.utils;



public class StringUtils {

    /**
     * Reverses the input string.
     *
     * @param str the string to be reversed
     * @return the reversed string
     */
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    /**
     * Counts the number of occurrences of a target string within the input string.
     *
     * @param str    the input string
     * @param target the target string to count occurrences of
     * @return the number of occurrences of the target string
     */
    public static int countOccurrences(String str, String target) {
        int count = 0;
        int index = 0;
        while (index != -1) {
            index = str.indexOf(target, index);
            if (index != -1) {
                count++;
                index += target.length();
            }
        }
        return count;
    }

    /**
     * Checks if the input string is a palindrome.
     *
     * @param str the input string
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equals(reversed);
    }
}



