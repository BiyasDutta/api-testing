package runner.requests;

import HTTPRequests.GetRequest;
import org.testng.annotations.Test;
import reporting.ExtentManager;

public class GetRunner extends BaseRunner {

    @Test
    public void getResult() {
        GetRequest getRequest = new GetRequest();
        test = ExtentManager.startTest("Get API with ID", "Get API with ID Testing");
        test.info(getRequest.getSpecificUser().body().asString());
        test.info("Found user with ID");
    }
}

