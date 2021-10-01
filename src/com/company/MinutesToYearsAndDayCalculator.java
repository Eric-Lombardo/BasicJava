package com.company;

public class MinutesToYearsAndDayCalculator {
//    Write a method printYearsAndDays with parameter of type long named minutes.
//    The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
//    If the parameter is less than 0, print text "Invalid Value".
//    Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
//    XX represents the original value minutes.
//    YY represents the calculated years.
//    ZZ represents the calculated days.

    public static void main(String[] args) {
        printYearsAndDays(525600); // "525600 min = 1 y and 0 d"
        printYearsAndDays(1051200); // "1051200 min = 2 y and 0 d"
        printYearsAndDays(561600); // "561600 min = 1 y and 25 d"
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = minutes / 60 / 24;
            long years = days / 365;
            long remainingDays = days % 365;

            String result = minutes + " min = " + years + " y and " + remainingDays + " d";

            System.out.println(result);
        }
    }
}
