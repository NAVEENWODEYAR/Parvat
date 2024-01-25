package com.lakshmi.threads;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHM {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> chm = new ConcurrentHashMap<>();
                                          chm.put("foo",3);
                                          chm.put("foo",1);
                                          chm.put("foo",2);
        System.out.println(chm);
    }
}
