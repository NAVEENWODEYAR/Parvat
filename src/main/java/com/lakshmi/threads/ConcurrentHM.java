package com.lakshmi.threads;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHM extends Thread{
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> chm = new ConcurrentHashMap<>();
                                          chm.put("foo",3);
                                          chm.put("foo",1);
                                          chm.put("foo",2);
        new ConcurrentHM().start();
        System.out.println(Thread.currentThread());
    }
}
