package runner.requests;

import HTTPRequests.DeleteRequest;
import HTTPRequests.GetRequest;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.Test;
import reporting.ExtentManager;
import runner.BaseRunner;

public class DeleteRunner extends BaseRunner {
    @Test
    public void getResult() {
        DeleteRequest deleteRequest = new DeleteRequest();
        ExtentTest test = ExtentManager.startTest("Delete API", "Delete API Testing");
        try {
            deleteRequest.deleteUser();
            test.info("Deleted the user");
            test.pass("Passed");
        } catch (Exception e) {
            test.fail("Failed: " + e.getMessage());
        }
    }
}
