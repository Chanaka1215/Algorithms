package tests;

import java.util.Scanner;

public final class FindASCIIValue implements TestRunner {

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a character...");
        String character = scanner.nextLine();
        System.out.println("ASCII value of " + character.charAt(0) + " is " + (int) character.charAt(0));
    }

    @Override
    public AlgorithmTypeId getId() {
        return AlgorithmTypeId.FIND_ASCII_VALUE_OF_A_CHARACTER;
    }

    @Override
    public void printDetails() {
        System.out.println("name:: "+ AlgorithmTypeId.FIND_ASCII_VALUE_OF_A_CHARACTER.getName());
        System.out.println("Link:: " + AlgorithmTypeId.FIND_ASCII_VALUE_OF_A_CHARACTER.getURL());
    }
}
