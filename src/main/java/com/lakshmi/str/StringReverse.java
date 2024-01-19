package com.lakshmi.str;

public class StringReverse {

    // using charAt();
    static String reverseString(String st){
        System.out.println("String given "+st);
        String rev = "";
        for(int i=st.length(); i>0; i--){
            rev = rev+ rev.charAt(i);
        }
        return rev;
    }

    // using StringBuilder(),
    static String stringReverse(String st){
        StringBuilder sb = new StringBuilder(st);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        var st = reverseString("level");
        System.out.println("Reversed string "+st);
    }
}
