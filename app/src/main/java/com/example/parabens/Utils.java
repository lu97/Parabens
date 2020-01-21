package com.example.parabens;

import java.util.Date;

public class Utils {

    public static String date(Date date){
        String d = date.getDay() + "." + date.getMonth() + "." + date.getYear();
        String[] parts = d.split("\\.");
        if(parts[0].length()== 1){
            parts[0] = "0"+parts[0];
        }
        if(parts[1].length()== 1){
            parts[1] = "0"+parts[1];
        }
        return parts[0] + "."+ parts[1] +"."+ parts[2];
    }
}
