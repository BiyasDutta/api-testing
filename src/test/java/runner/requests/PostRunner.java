package runner.requests;

import HTTPRequests.GetRequest;
import HTTPRequests.PostRequest;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.Test;
import reporting.ExtentManager;
import runner.BaseRunner;

public class PostRunner extends BaseRunner {
    @Test
    public void getResult() {
        PostRequest postRequest = new PostRequest();
        ExtentTest test = ExtentManager.startTest("Post API", "Post API Testing");
        try {
            test.info(postRequest.createNewUser().body().asString());
            test.info("Created user");
            test.pass("Passed");
        } catch (Exception e) {
            test.fail("Failed: " + e.getMessage());
        }
    }
}
