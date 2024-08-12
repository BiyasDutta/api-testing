package runner.requests;

import HTTPRequests.GetRequest;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import reporting.ExtentManager;
import runner.BaseRunner;

public class GetAllRunner extends BaseRunner {
    ExtentTest test;

    @Test
    public void getResult() {
        GetRequest getRequest = new GetRequest();
        test = ExtentManager.startTest("Get ALl API", "Get API Testing");
        test.info(getRequest.getAllUsers().body().asString());
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        int status = result.getStatus();
        switch (status) {
            case ITestResult.SUCCESS:
                test.info("All user found");
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
}
