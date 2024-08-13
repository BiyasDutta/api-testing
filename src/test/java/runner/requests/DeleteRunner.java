package runner.requests;

import HTTPRequests.DeleteRequest;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import reporting.ExtentManager;

public class DeleteRunner extends BaseRunner {

    @Test
    public void getResult() {
        DeleteRequest deleteRequest = new DeleteRequest();
        test = ExtentManager.startTest("Delete API", "Delete API Testing");
        deleteRequest.deleteUser();
        test.info("Deleted the user");
    }
}
