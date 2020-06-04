package com.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        String testString = "Branch 'master' set up to track remote branch 'master' from 'origin'";
        checkIfAllMatches(testString);
        generateRegexToMatchAllChars("abc");

    }

    private static void generateRegexToMatchAllChars(String a) {
        String allMatcherRegex = a.replaceAll(".", "(?=.*$0)");
        System.out.println(allMatcherRegex);
    }

    public static void checkIfAllMatches(String testString) {
            String regex = "(?=.*a)(?=.*B).*";
            boolean matches = Pattern.matches(regex, testString);
            System.out.println(matches);
        }

    }
}
