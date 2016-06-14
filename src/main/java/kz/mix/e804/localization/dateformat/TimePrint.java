//CHECKSTYLE:OFF
package kz.mix.e804.localization.dateformat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TimePrint {
    public static void main(String[] args) {
        Date today = new Date();

        Locale[] locales = { Locale.CANADA, Locale.FRANCE, Locale.GERMANY, Locale.ITALY };

        System.out.println(today);
        System.out.printf("%5s \t %10s \t %10s \t %20s \t %20s \t %20s %n",
                "Locale", "Short", "Medium", "Long", "Full", "Default");

        for (Locale locale : locales) {
            DateFormat timeFormatShort = DateFormat.getTimeInstance(DateFormat.SHORT, locale);
            DateFormat timeFormatMedium = DateFormat.getTimeInstance(DateFormat.MEDIUM, locale);
            DateFormat timeFormatLong = DateFormat.getTimeInstance(DateFormat.LONG, locale);
            DateFormat timeFormatFull = DateFormat.getTimeInstance(DateFormat.FULL, locale);
            DateFormat timeFormatDefault = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);

            System.out.printf("%5s \t %10s \t %10s \t %20s \t %20s \t %20s %n",
                    locale, timeFormatShort.format(today), timeFormatMedium.format(today),
                    timeFormatLong.format(today), timeFormatFull.format(today), timeFormatDefault.format(today));
        }
    }
}
