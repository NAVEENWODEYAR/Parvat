package com.lakshmi.str;

public class StringReverse {

    // using charAt();
    static String reverseString(String st){
        String rev = "";
        for(int i=st.length()-1; i>=0; i--){
            rev +=st.charAt(i);
        }
        return rev;
    }

    /** using StringBuilder(),
    static String stringReverse(String st){
        StringBuilder sb = new StringBuilder(st);
        return sb.reverse().toString();
    }**/

    public static void main(String[] args) {
        var st = reverseString("level");
        System.out.println("Reversed string: "+st);
    }
}
