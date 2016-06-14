//CHECKSTYLE:OFF
package kz.mix.e804.localization.resourcebundles;

import java.util.ListResourceBundle;

// default US English version
public class ResBundle_en_US extends ListResourceBundle {
    public Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents = {
            { "MovieName", "Avatar" },
            { "GrossRevenue", 2782275172L}, // in US dollars
            { "Year", 2009}
    };
}
