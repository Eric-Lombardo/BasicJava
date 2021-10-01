package com.company;

public class MethodOverloading {
    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters.
    // feet is the first parameter, inches is the 2nd parameter
    //
    // You should validate that the first parameter feet is >= 0
    // You should validate that the 2nd parameter inches is >=0 and <=12
    // return -1 from the method if either of the above is not true
    //
    // If the parameters are valid, then calculate how many centimetres
    // comprise the feet and inches passed to this method and return
    // that value.
    //
    // Create a 2nd method of the same name but with only one parameter
    // inches is the parameter
    // validate that its >=0
    // return -1 if it is not true
    // But if its valid, then calculate how many feet are in the inches
    // and then here is the tricky part
    // call the other overloaded method passing the correct feet and inches
    // calculated so that it can calculate correctly.
    // hints: Use double for your number datatypes is probably a good idea
    // 1 inch = 2.54cm  and one foot = 12 inches
    // use the link I give you to confirm your code is calculating correctly.
    // Calling another overloaded method just requires you to use the
    // right number of parameters.

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(17));
        System.out.println(calcFeetAndInchesToCentimeters(100));
        System.out.println(calcFeetAndInchesToCentimeters(171));
        System.out.println(calcFeetAndInchesToCentimeters(17, 11));
        System.out.println(calcFeetAndInchesToCentimeters(0, 2));
        System.out.println(calcFeetAndInchesToCentimeters(0, 25));
        System.out.println(calcFeetAndInchesToCentimeters(-4, 2));
        System.out.println(calcFeetAndInchesToCentimeters(0, -2));
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        } else {
            return (feet * 30.48) + (inches * 2.54);
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) {
            return -1;
        } else {
            int feetAmount = inches / 12;
            int remainingInches = inches % 12;
            return calcFeetAndInchesToCentimeters(feetAmount, remainingInches);
        }
    }
}
