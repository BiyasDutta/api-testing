package runner.requests;

import HTTPRequests.GetRequest;
import org.testng.annotations.Test;
import runner.BaseRunner;

public class GetAllRunner extends BaseRunner {
    @Test
    public void getAllRequest() {
        GetRequest getRequest = new GetRequest();
        getRequest.getAllUsers();
    }
}
