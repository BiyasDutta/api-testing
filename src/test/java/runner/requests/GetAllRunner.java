package runner.requests;

import HTTPRequests.GetRequest;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.Test;
import reporting.ExtentManager;
import runner.BaseRunner;

public class GetAllRunner extends BaseRunner {
    @Test
    public void getResult() {
        GetRequest getRequest = new GetRequest();
        ExtentTest test = ExtentManager.startTest("Get ALl API", "Get API Testing");
        try {
            test.info(getRequest.getAllUsers().body().asString());
            test.info("All user found");
            test.pass("Passed");
        } catch (Exception e) {
            test.fail("Failed: " + e.getMessage());
        }
    }
}
