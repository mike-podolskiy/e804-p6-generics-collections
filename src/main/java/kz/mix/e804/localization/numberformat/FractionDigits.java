//CHECKSTYLE:OFF
package kz.mix.e804.localization.numberformat;

import java.text.*;
import java.util.Locale;

public class FractionDigits {
    public static void main(String[] args) throws ParseException {
        String[] numbers = { "1.222", "0.12345F" };
        double[] doubles = { 1.222, 0.12545F };

        NumberFormat numberFormat = NumberFormat.getInstance(Locale.GERMANY);
//        NumberFormat numberFormat = NumberFormat.getInstance(new Locale("ru", "RU"));
        numberFormat.setMaximumFractionDigits(2);

        System.out.println("Using format method: ");
        for (double val : doubles) {
            System.out.println(numberFormat.format(val));
        }

        System.out.println("Using parse method: ");
        for (String number : numbers) {
            System.out.println(numberFormat.parse(number));
        }
    }
}
