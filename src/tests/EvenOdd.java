package tests;

import java.util.Scanner;

import common.AlgorithmType;
import common.BaseTestRunner;
import common.TestRunner;

public class EvenOdd extends BaseTestRunner
{
    @Override
    public void run() {
        printDetails();

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
}
