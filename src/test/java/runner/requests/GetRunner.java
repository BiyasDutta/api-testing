package runner.requests;

import HTTPRequests.GetRequest;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.Test;
import reporting.ExtentManager;
import runner.BaseRunner;

public class GetRunner extends BaseRunner {
    @Test
    public void getResult() {
        GetRequest getRequest = new GetRequest();
        ExtentTest test = ExtentManager.startTest("Get API with ID", "Get API with ID Testing");
        try {
            test.info(getRequest.getSpecificUser().body().asString());
            test.info("Found user with ID");
            test.pass("Passed");
        } catch (Exception e) {
            test.fail("Failed: " + e.getMessage());
        }
    }
}
