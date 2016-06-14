//CHECKSTYLE:OFF
package kz.mix.e804.localization.resourcebundles;

import java.util.*;

//run with following VM options: -Duser.language=it -Duser.region=IT
public class LocalizedHello {
    public static void main(String args[]) {
        Locale currentLocale = Locale.getDefault();
        ResourceBundle resBundle =
                ResourceBundle.getBundle("ResourceBundle", currentLocale);
        System.out.printf(resBundle.getString("Greeting"));
    }
}
