package runner.requests;

import HTTPRequests.PutRequest;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import reporting.ExtentManager;
import runner.BaseRunner;

public class PutRunner extends BaseRunner {
    ExtentTest test;

    @Test
    public void getResult() {
        PutRequest putRequest = new PutRequest();
        test = ExtentManager.startTest("Update API", "Update API Testing");
        test.info(putRequest.updateUser().body().asString());
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        int status = result.getStatus();
        switch (status) {
            case ITestResult.SUCCESS:
                test.info("Updated the user");
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
