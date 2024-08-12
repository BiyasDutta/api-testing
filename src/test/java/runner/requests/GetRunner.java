package runner.requests;

import HTTPRequests.GetRequest;
import org.testng.annotations.Test;
import runner.BaseRunner;

public class GetRunner extends BaseRunner {
    @Test
    public void getRequest() {
        GetRequest getRequest = new GetRequest();
        getRequest.getSpecificUser();
    }
}
