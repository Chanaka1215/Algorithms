package tests;

import java.util.ArrayList;
import java.util.List;

public final class TestRegistry {
    private static final List<TestRunner> testList = new ArrayList<>();

    private TestRegistry() {
    }

    public static List<TestRunner> getTestRegistry() {
        return testList;
    }

    public static void register(final TestRunner testRunner) {
        testList.add(testRunner);
    }
}
