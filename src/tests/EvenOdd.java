package tests;

import java.util.Scanner;

import common.AlgorithmType;
import common.TestRunner;

public class EvenOdd implements TestRunner
{
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");
        int num = scanner.nextInt();
        String v = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is : " + v);
        scanner.close();
    }

    @Override
    public AlgorithmType getId() {
        return AlgorithmType.EVEN_ODD;
    }

    @Override
    public void printDetails() {
        System.out.println("Name:: " + getId().getName());
        System.out.println("Name:: " + getId().getURL());
    }
}
