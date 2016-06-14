//CHECKSTYLE:OFF
package kz.mix.e804.localization.numberformat;

import java.util.*;
import java.text.*;

// Ilustrates how to use NumberFormat class to get Currency instance
public class LocalizedCurrency {
    public static void main(String[] args) {
        long tenMillion = 10000000L; // this is ten million
        Locale[] locales = { Locale.CANADA, Locale.FRANCE, Locale.GERMANY, Locale.TAIWAN };
        // for each of the four locales,
        // print the currency amount as it looks in that locale
        for (Locale locale : locales) {
            System.out.println("Ten million in " + locale.getDisplayName() + " is " + NumberFormat.getCurrencyInstance(locale).format(tenMillion));
        }
    }
}
