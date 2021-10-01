package com.company;

public class DecimalComparator {
//    Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//    The method should return boolean and it needs to return true if two double numbers
//    are the same up to three decimal places. Otherwise, return false.

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); // false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); // true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123)); // false
    }

    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2) {
        double newValue1 = value1 * 1000;
        int newValue1Int = (int) newValue1;

        double newValue2 = value2 * 1000;
        int newValue2Int = (int) newValue2;

        return newValue1Int == newValue2Int;
    }
}
