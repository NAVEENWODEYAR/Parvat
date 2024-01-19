package com.lakshmi.str;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePattern {

    static void dateFormat(){
        String date = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(date);
        String da = sdf.format(new Date());
        System.out.println(da);
    }
    public static void main(String[] args) {

    }
}
