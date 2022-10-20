package tests;

import java.util.Scanner;

import common.AlgorithmType;
import common.TestRunner;

public class QuotientAndRemainder implements TestRunner
{
    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Please input dividend...");
        final int dividend = scanner.nextInt();
        System.out.println("Please input divisor...");
        final int divisor = scanner.nextInt();

        System.out.println("Quotient " + dividend/divisor);
        System.out.println("Remainder " + dividend % divisor);
    }

    @Override
    public AlgorithmType getId() {
        return AlgorithmType.FIND_QUITIENT_ANDREMAINDER;
    }

    @Override
    public void printDetails() {
        System.out.println("name:: " + AlgorithmType.FIND_QUITIENT_ANDREMAINDER.getName());
        System.out.println("Link:: " + AlgorithmType.FIND_QUITIENT_ANDREMAINDER.getURL());
    }
}
