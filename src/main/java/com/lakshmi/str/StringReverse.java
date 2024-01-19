package com.lakshmi.str;

public class StringReverse {
    static String reverseString(String st){
        System.out.println("String given "+st);
        String rev = "";
        for(int i=st.length(); i>0; i--){
            rev = rev+ rev.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        var st = reverseString("level");
        System.out.println("Reversed string "+st);
    }
}
