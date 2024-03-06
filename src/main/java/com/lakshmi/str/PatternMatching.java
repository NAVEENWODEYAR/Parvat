package com.lakshmi.str;

public class PatternMatching {
    static boolean  isVowelPreset(String st){
        return st.toLowerCase().matches(".*[aeiou].*");
    }
    public static void main(String[] args) {
        if(isVowelPreset("crypt") && isVowelPreset("cipher"))
            System.out.println("Vowel is present");
        else
            System.out.println("not present");
    }
}

