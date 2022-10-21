package tests;

import java.util.Scanner;

import common.AlgorithmType;
import common.BaseTestRunner;
import common.TestRunner;

public class QuotientAndRemainder extends BaseTestRunner
{
    @Override
    public void run() {
        printDetails();

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

}
