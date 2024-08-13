package runner.requests;

import HTTPRequests.PostRequest;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.Test;
import reporting.ExtentManager;

public class PostRunner extends BaseRunner {

    @Test
    public void getResult() {
        PostRequest postRequest = new PostRequest();
        test = ExtentManager.startTest("Post API", "Post API Testing");
        test.info(postRequest.createNewUser().body().asString());
        test.info("Created user");
    }

}
