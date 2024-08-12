package runner.requests;

import HTTPRequests.PostRequest;
import org.testng.annotations.Test;
import runner.BaseRunner;

public class PostRunner extends BaseRunner {
    @Test
    public void postRequest() {
        PostRequest postRequest = new PostRequest();
        postRequest.createNewUser();
    }
}
