package runner.requests;

import HTTPRequests.DeleteRequest;
import org.testng.annotations.Test;
import runner.BaseRunner;

public class DeleteRunner extends BaseRunner {
    @Test
    public void deleteRequest() {
        DeleteRequest deleteRequest = new DeleteRequest();
        deleteRequest.deleteUser();
    }
}
