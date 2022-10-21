package common;

import java.util.ArrayList;
import java.util.List;

public final class TestRegistry {
    private static final List<BaseTestRunner> testList = new ArrayList<>();

    private TestRegistry() {
    }

    public static List<BaseTestRunner> getTestRegistry() {
        return testList;
    }

    public static void register(final BaseTestRunner testRunner) {
        testList.add(testRunner);
    }
}
