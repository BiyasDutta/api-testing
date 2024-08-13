package runner.requests;

import HTTPRequests.GetRequest;
import org.testng.annotations.Test;
import reporting.ExtentManager;

public class GetAllRunner extends BaseRunner {

    @Test
    public void getResult() {
        GetRequest getRequest = new GetRequest();
        test = ExtentManager.startTest("Get ALl API", "Get API Testing");
        test.info(getRequest.getAllUsers().body().asString());
        test.info("All users found");
    }
}
