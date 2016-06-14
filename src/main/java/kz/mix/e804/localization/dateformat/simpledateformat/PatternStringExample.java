//CHECKSTYLE:OFF
package kz.mix.e804.localization.dateformat.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

        /*
        G Era (BC/AD)
        y Year
        Y Week year
        M Month (in year)
        w Week (in year)
        W Week (in month)
        D Day (in year)
        d Day (in month)
        F Day of week in month
        E Day name in week
        u Day number of week (value range 1-7)
        */

// Use SimpleDateFormat for creating custom date and time formats as a pattern string
public class PatternStringExample {
    public static void main(String[] args) {
        String pattern = "FFFF"; /* d for day, M for month, y for year */
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);

        // the default Date constructor initializes to current date/time
        System.out.println(formatter.format(new Date()));
    }
}
