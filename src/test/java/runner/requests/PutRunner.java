package runner.requests;

import HTTPRequests.PutRequest;
import org.testng.annotations.Test;
import runner.BaseRunner;

public class PutRunner extends BaseRunner {
    @Test
    public void postRequest() {
        PutRequest putRequest = new PutRequest();
        putRequest.updateUser();
    }
}
