package com.lakshmi.clone;

public class CloneEx implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneEx ce = new CloneEx();
        CloneEx ce1 = (CloneEx) ce.clone();
        System.out.println(ce+" "+ce1);
    }
}
