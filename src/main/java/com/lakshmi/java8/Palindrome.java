package com.lakshmi.java8;

import java.util.stream.IntStream;

public class Palindrome {
    static boolean isPalindrome(String str){
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, cleanedStr.length() / 2)
                .noneMatch(i -> cleanedStr.charAt(i) != cleanedStr.charAt(cleanedStr.length() - i - 1));
    }
    public static void main(String[] args) {
        if(isPalindrome("level") || isPalindrome("racecar"))
            System.out.println("Given strings,are palindrome");
        else
            System.out.println("Not palindrome strings");
    }
}
