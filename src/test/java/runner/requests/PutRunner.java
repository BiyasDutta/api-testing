package runner.requests;

import HTTPRequests.DeleteRequest;
import HTTPRequests.PutRequest;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.Test;
import reporting.ExtentManager;
import runner.BaseRunner;

public class PutRunner extends BaseRunner {
    @Test
    public void getResult() {
        PutRequest putRequest = new PutRequest();
        ExtentTest test = ExtentManager.startTest("Update API", "Update API Testing");
        try {
            test.info(putRequest.updateUser().body().asString());
            test.info("Updated the user");
            test.pass("Passed");
        } catch (Exception e) {
            test.fail("Failed: " + e.getMessage());
        }
    }
}
