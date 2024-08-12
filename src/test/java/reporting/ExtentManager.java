package reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class ExtentManager {
    private static ExtentReports extentReports = ExtentReportManager.getReporter();
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    public static synchronized ExtentTest startTest(String name, String description) {
        ExtentTest testcases = extentReports.createTest(name, description);
        extentTest.set(testcases);
        return extentTest.get();
    }

    public static ExtentTest getTest() {
        return extentTest.get();
    }
}
