package com.company;

public class EqualSumChecker {
//    Write a method hasEqualSum with 3 parameters of type int.
//    The method should return boolean and it needs to return true if the sum of
//    the first and second parameter is equal to the third parameter. Otherwise, return false.

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1)); // false
        System.out.println(hasEqualSum(1, 1, 2)); // true
        System.out.println(hasEqualSum(1, -1, 0)); // true
    }

    public static boolean hasEqualSum(int value1, int value2, int value3) {
        return value1 + value2 == value3;
    }
}
