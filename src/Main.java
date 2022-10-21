import java.util.List;

import common.AlgorithmType;
import common.BaseTestRunner;
import common.TestRegistry;
import tests.CheckLeapYear;
import tests.CheckPrimeNumber;
import tests.CountDigitsInAInteger;
import tests.DisplayFibonacciSeries;
import tests.EvenOdd;
import tests.FactorialOfANumber;
import tests.FindASCIIValue;
import tests.GCDOfTwoNumbers;
import tests.LCMOfTwoNumber;
import tests.Palindrome;
import tests.QuotientAndRemainder;
import tests.ReverseANumber;
import tests.VowelOrConstant;

public class Main {
    public static void main(String[] args) {
        registerTest();
        //Replace the Algorithm id here to run a specific algorithm
        runTestWithId(AlgorithmType.FIND_FACTORIAL);
    }

    private static void registerTest() {
        TestRegistry.register(new FindASCIIValue());
        TestRegistry.register(new QuotientAndRemainder());
        TestRegistry.register(new EvenOdd());
        TestRegistry.register(new VowelOrConstant());
        TestRegistry.register(new CheckLeapYear());
        TestRegistry.register(new FactorialOfANumber());
        TestRegistry.register(new DisplayFibonacciSeries());
        TestRegistry.register(new GCDOfTwoNumbers());
        TestRegistry.register(new LCMOfTwoNumber());
        TestRegistry.register(new CountDigitsInAInteger());
        TestRegistry.register(new ReverseANumber());
        TestRegistry.register(new Palindrome());
        TestRegistry.register(new CheckPrimeNumber());
        TestRegistry.register(new Palindrome());
    }

    private static void runTestWithId(final AlgorithmType algoId) {
        final List<BaseTestRunner> registeredTests = TestRegistry.getTestRegistry();
        registeredTests.stream().filter(test -> test.getId() == algoId).findFirst().ifPresent(BaseTestRunner::run);
    }
}