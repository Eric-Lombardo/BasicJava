package com.company;

import com.sun.jdi.Value;

public class EqualityPrinter {
//    Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
//    If one of the parameters is less than 0, print text "Invalid Value".
//    If all numbers are equal print text "All numbers are equal"
//    If all numbers are different print text "All numbers are different".
//    Otherwise, print "Neither all are equal or different".

    public static void main(String[] args) {
        printEqual(1, 1, 1); // All numbers are equal
        printEqual(1, 1, 2); // Neither all are equal or different
        printEqual(-1, -1, -1); // Invalid Value
        printEqual(1, 2, 3); // All numbers are different
    }

    public static void printEqual(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid Value");
        } else if (num1 == num2 && num1 == num3 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
