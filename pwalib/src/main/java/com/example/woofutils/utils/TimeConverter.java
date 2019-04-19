package com.example.woofutils.utils;

public class TimeConverter {
    public static String convertToColonFormat(long milliseconds) {
        String result = "";
        long seconds = milliseconds / 1000;
        if (seconds < 60) {
            if (seconds < 10)
                result = "0" + seconds;
            else
                result = Long.toString(seconds);
        } else if (seconds > 60 & seconds < 3600) {
            int min = (int) (seconds / 60);
            if (min < 10)
                result += "0" + min;
            else
                result += min;
            result += ":" + ((seconds%60 < 10)?("0"+seconds % 60):(Long.toString(seconds % 60))) ;
        } else {
            int hours = (int)(seconds / 3600);
            result = (hours < 10)? ("0" + hours):Integer.toString(hours);
            long leftSec = seconds - hours * 3600;
            result += ":" + (((leftSec / 60) < 10)?("0"+(int)leftSec/60):(int)leftSec/60 + ":" + (((leftSec % 60) < 10)?"0"+leftSec%60:leftSec%60));
        }
        return result;
    }
}
