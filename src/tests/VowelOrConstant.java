package tests;

import java.util.Arrays;
import java.util.Scanner;

public class VowelOrConstant implements TestRunner{
    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter ...");
        String letter = scanner.nextLine().toUpperCase();
        String result = Arrays.asList('a','e','i','o','u').contains(letter.charAt(0))?" vowel" : "consonant";
        System.out.println(letter.charAt(0) + " is a " + result);
    }

    @Override
    public AlgorithmTypeId getId() {
        return AlgorithmTypeId.VOWEL_OR_CONSTANT;
    }

    @Override
    public void printDetails() {
        System.out.println("name:: "+ getId().getName());
        System.out.println("Link:: " + getId().getURL());
    }
}
