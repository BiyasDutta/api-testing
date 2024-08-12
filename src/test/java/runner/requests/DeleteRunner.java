package runner.requests;

import HTTPRequests.DeleteRequest;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import reporting.ExtentManager;
import runner.BaseRunner;

public class DeleteRunner extends BaseRunner {
    ExtentTest test;

    @Test
    public void getResult() {
        DeleteRequest deleteRequest = new DeleteRequest();
        test = ExtentManager.startTest("Delete API", "Delete API Testing");
        deleteRequest.deleteUser();
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        int status = result.getStatus();
        switch (status) {
            case ITestResult.SUCCESS:
                test.info("Deleted the user");
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
