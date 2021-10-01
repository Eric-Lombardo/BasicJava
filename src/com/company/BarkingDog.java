package com.company;

public class BarkingDog {
//    We have a dog that likes to bark.  We need to wake up if the dog is
//    barking at night!
//    Write a method shouldWakeUp that has 2 parameters.
//    1st parameter should be of type boolean and be named barking it
//    represents if our dog is currently barking.
//    2nd parameter represents the hour of the day and is of type int with
//    the name hourOfDay and has a valid range of 0-23.
//    We have to wake up if the dog is barking before 8 or after 22 hours
//    so in that case return true.
//    In all other cases return false.
//    If the hourOfDay parameter is less than 0 or greater than 23 return
//    false.

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1)); // true
        System.out.println(shouldWakeUp(false, 2)); // false
        System.out.println(shouldWakeUp(true, 8)); // false
        System.out.println(shouldWakeUp(true, -1)); // false
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking || hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking) {
            if (hourOfDay < 8 || hourOfDay > 22) {
                return true;
            }
        }
        return false;
    }
}
