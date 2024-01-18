package com.lakshmi.str;

import java.util.HashMap;

public class StringFrequency {
static void stringFrequency(String st){
    char[] st1 = st.toLowerCase().toCharArray();
    HashMap<Character, Integer> hmap = new HashMap<>();

    for (char c : st1) {
        if (hmap.containsKey(c)) {
            hmap.get(c), hmap.get(c)+1)
        }
        else
            hmap.get(c),1);
    }
}
}
