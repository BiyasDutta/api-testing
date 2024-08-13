package runner.requests;

import com.aventstack.extentreports.ExtentTest;
import common.Config;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import reporting.ExtentReportManager;

public class BaseRunner {

    private String userID;
    ExtentTest test;

    @BeforeSuite(alwaysRun = true)
    @Parameters({"userID"})
    public void setUserID(String userID) {
        Config.setID(userID);
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        int status = result.getStatus();
        switch (status) {
            case ITestResult.SUCCESS:
                test.pass("Test passed.");
                break;
            case ITestResult.FAILURE:
                test.fail("Test failed.");
                break;
            case ITestResult.SKIP:
                test.skip("Test skipped.");
                break;
        }
    }


    @AfterSuite
    public void tearDownClass() {
        ExtentReportManager.getReporter().flush();
    }
}

