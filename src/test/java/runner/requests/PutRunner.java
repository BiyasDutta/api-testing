package runner.requests;

import HTTPRequests.PutRequest;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import reporting.ExtentManager;

public class PutRunner extends BaseRunner {

    @Test
    public void getResult() {
        PutRequest putRequest = new PutRequest();
        test = ExtentManager.startTest("Update API", "Update API Testing");
        test.info(putRequest.updateUser().body().asString());
        test.info("Updated the user");
    }

}
