package tests;

import java.util.Scanner;

import common.AlgorithmType;
import common.TestRunner;

public class CheckLeapYear implements TestRunner
{
    @Override
    public void run() {
        /*
        A leap year is exactly divisible by 4 except for century years (years ending with 00).
        The century year is a leap year only if it is perfectly divisible by 400.
         */

        final Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Year to check..");
        int year = sc.nextInt();
        boolean isLeapYear = false;
        if((year%4==0 && year%100 !=0) || (year%100 == 0 && year%400 == 0)) {
            isLeapYear = true;
        }
        System.out.println("Year: " + year +" is a leapYear " + String.valueOf(isLeapYear));
        sc.close();
    }

    @Override
    public AlgorithmType getId() {
        return AlgorithmType.FIND_LEAP_YEAR;
    }

    @Override
    public void printDetails() {
        System.out.println("name:: "+ getId().getName());
        System.out.println("Link:: " + getId().getURL());
    }
}
