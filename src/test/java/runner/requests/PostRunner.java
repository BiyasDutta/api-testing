package runner.requests;

import HTTPRequests.PostRequest;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import reporting.ExtentManager;
import runner.BaseRunner;

public class PostRunner extends BaseRunner {
    ExtentTest test;

    @Test
    public void getResult() {
        PostRequest postRequest = new PostRequest();
        test = ExtentManager.startTest("Post API", "Post API Testing");
        test.info(postRequest.createNewUser().body().asString());

    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        int status = result.getStatus();
        switch (status) {
            case ITestResult.SUCCESS:
                test.info("Created user");
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
