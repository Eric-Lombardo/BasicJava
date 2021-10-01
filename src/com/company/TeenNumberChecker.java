package com.company;

public class TeenNumberChecker {
//    We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
//    Write a method named hasTeen with 3 parameters of type int.
//    The method should return boolean and it needs to return true if one of the
//    parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19)); // true
        System.out.println(hasTeen(23, 15, 42)); // true
        System.out.println(hasTeen(22, 23, 34)); // false
    }

    public static boolean hasTeen(int value1, int value2, int value3) {
        return isTeen(value1) || isTeen(value2) || isTeen(value3);
    }

    public static boolean isTeen(int value) {
        return value >= 13 && value <= 19;
    }
}
