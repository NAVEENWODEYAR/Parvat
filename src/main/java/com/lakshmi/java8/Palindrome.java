package com.lakshmi.java8;

import java.util.stream.IntStream;

public class Palindrome {
    static boolean ispalindrome(String str){

        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, cleanedStr.length() / 2)
                .noneMatch(i -> cleanedStr.charAt(i) != cleanedStr.charAt(cleanedStr.length() - i - 1));
    }
    public static void main(String[] args) {
        System.out.println("Palindrome using Java8 library");
        boolean b = ispalindrome("lev\nel");
        if(ispalindrome("level"))
            System.out.println("Given string is palindrome");
        else
            System.out.println("Not an palindrome");
    }
}
