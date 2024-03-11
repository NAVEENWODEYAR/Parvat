package com.lakshmi.java8;


public class palindromeUsingLength {
    static boolean isPalindrome(String str){
        str.toLowerCase();
        int left=0;
        int right=str.length()-1;

        while (left<right){
            if(str.charAt(left) !=str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        if(isPalindrome("level") && isPalindrome("malayalam") )
            System.out.println("Given strings,are palindrome");
        else
            System.out.println("Not palindrome strings");
    }
}
