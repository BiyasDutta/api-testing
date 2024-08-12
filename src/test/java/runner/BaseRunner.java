package runner;

import common.Config;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseRunner {
    private String userID;

    @BeforeTest(alwaysRun = true)
    @Parameters({"userID"})
    public void setUserID(String userID) {
        Config.setID(userID);
    }
}

