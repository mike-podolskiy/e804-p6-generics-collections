//CHECKSTYLE:OFF
package kz.mix.e804.localization.resourcebundles.control;

import java.util.*;

// Extend ResourceBundle.Control and override getCandidateLocales method
// to get the list of candidate locales that Java searches for
public class TalkativeResourceBundleControl extends ResourceBundle.Control {
    // override the default getCandidateLocales method to print
    // the candidate locales first
    public List<Locale> getCandidateLocales(String baseName, Locale locale) {
        List<Locale> candidateLocales = super.getCandidateLocales(baseName, locale);

        System.out.printf("Candidate locales for base bundle name %s and locale %s %n", baseName, locale.getDisplayName());

        for (Locale candidateLocale : candidateLocales) {
            System.out.println(candidateLocale);
        }

        return candidateLocales;
    }
}
