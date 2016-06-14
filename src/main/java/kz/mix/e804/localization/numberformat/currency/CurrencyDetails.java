//CHECKSTYLE:OFF
package kz.mix.e804.localization.numberformat.currency;

import java.util.*;

// Get the currency details of the default locale (en_US locale)
class CurrencyDetails {
    public static void main(String[] args) {
//        Locale locale = Locale.getDefault();
        Locale[] locales = { new Locale("ru", "RU"), Locale.US, Locale.JAPAN, Locale.UK };

        for (Locale locale : locales) {
            Currency currencyInstance = Currency.getInstance(locale);
            System.out.println(" The currency code for locale " + locale + " is: " + currencyInstance.getCurrencyCode() + " \n The currency symbol is "
                    + currencyInstance.getSymbol() + " \n The currency name is " + currencyInstance.getDisplayName());
        }
    }
}
