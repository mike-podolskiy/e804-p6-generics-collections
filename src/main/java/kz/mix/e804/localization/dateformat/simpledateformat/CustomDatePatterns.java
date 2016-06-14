//CHECKSTYLE:OFF
package kz.mix.e804.localization.dateformat.simpledateformat;

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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// Using an example, illustrates the use of "pattern strings" for printing dates
public class CustomDatePatterns {
    public static void main(String []args) {
// patterns from simple to complex ones
        String [] dateFormats = {
                "dd-MM-yyyy", /* d is day (in month), M is month, y is year */
                "d '('E')' MMM, YYYY", /*E is name of the day (in week), Y is year*/
                "w'th week of' YYYY", /* w is the week of the year */
                "EEEE, dd'th' MMMM, YYYY" /*E is day name in the week */
        };
        Date today = new Date();
        System.out.println("Default format for the date is " +
                DateFormat.getDateInstance().format(today));
        for(String dateFormat : dateFormats) {
            System.out.printf("Date in pattern \"%s\" is %s %n", dateFormat,
                    new SimpleDateFormat(dateFormat).format(today));
        }
    }
}
