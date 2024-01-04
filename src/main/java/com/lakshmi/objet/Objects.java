package com.lakshmi.objet;


public class Objects {
    public static void main(String[] args) {
        var objects = new Objects();
        var objects1 = objects;

        var a = 9;
        var b = a;

        System.out.println(objects+""+objects1);
        System.out.println(a+""+b);
    }
}
