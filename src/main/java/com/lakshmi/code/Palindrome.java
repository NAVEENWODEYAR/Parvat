package com.lakshmi.code;

public class Palindrome {

    static boolean isPalindrome(String st){
        String str = st.toLowerCase();
        int left = 0;
        int right = st.length()-1;
        while (left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        if (isPalindrome("Malayalam"))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
