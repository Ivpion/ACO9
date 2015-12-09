package Classwork.week5.day1;

/**
 * Created by ivan on 05.12.15.
 */
public class TestResult {
    private String testName;
    private boolean passed;
    private String expected;
    private String actual;

    public TestResult(String testName, boolean passed, String expected, String actual) {
        this.testName = testName;
        this.passed = passed;
        this.expected = expected;
        this.actual = actual;

    }


}
