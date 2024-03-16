package common;

public class TestContext {
    private static int initialCount;

    public static int getInitialCount() {
        return initialCount;
    }

    public static void setInitialCount(int initialCount) {

        TestContext.initialCount = initialCount;
    }
}
