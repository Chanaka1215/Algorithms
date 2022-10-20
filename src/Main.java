import tests.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        registerTest();
        //Replace the Algorithm id here to run a specific algorithm
        runTestWithId(AlgorithmTypeId.LEAST_COMMON_MULTIPLE);
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
    }

    private static void runTestWithId(final AlgorithmTypeId algoId) {
        final List<TestRunner> registeredTests = TestRegistry.getTestRegistry();
        registeredTests.stream().filter(test -> test.getId() == algoId).findFirst().ifPresent(test -> {
            test.printDetails();
            test.run();
        });
    }
}