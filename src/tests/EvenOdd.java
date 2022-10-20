package tests;

import java.util.Scanner;

public class EvenOdd implements TestRunner {
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
    public AlgorithmTypeId getId() {
        return AlgorithmTypeId.EVEN_ODD;
    }

    @Override
    public void printDetails() {
        System.out.println("Name:: " + AlgorithmTypeId.EVEN_ODD.getName());
        System.out.println("Name:: " + AlgorithmTypeId.EVEN_ODD.getURL());
    }
}
