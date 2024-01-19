package com.lakshmi.str;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePattern {

    static void dateFormat(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        System.out.println(sdf.format(new Date()));
    }
    public static void main(String[] args) {
        dateFormat();
    }
}
