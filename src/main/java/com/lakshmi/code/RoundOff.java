package com.lakshmi.code;

public class RoundOff {
    static void calci(float a,int b){
        System.out.println("Math.round()");
        if(a<=b)
            System.out.println(Math.floor(a+b));
        else if(a>=b)
            System.out.println(Math.round(a-b));
        else
            System.out.println(Math.ceil(a*b));
    }
    public static void main(String[] args) {
        calci(1.5f,8);
    }
}
