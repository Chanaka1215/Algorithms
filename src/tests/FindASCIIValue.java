package tests;

import java.util.Scanner;
import common.AlgorithmType;
import common.BaseTestRunner;
import common.TestRunner;

public final class FindASCIIValue extends BaseTestRunner
{

    @Override
    public void run() {
        printDetails();
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a character...");
        String character = scanner.nextLine();
        System.out.println("ASCII value of " + character.charAt(0) + " is " + (int) character.charAt(0));
        scanner.close();
    }

    @Override
    public AlgorithmType getId() {
        return AlgorithmType.FIND_ASCII_VALUE_OF_A_CHARACTER;
    }
}
