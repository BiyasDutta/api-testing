package runner;

import common.Config;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import reporting.ExtentReportManager;

public class BaseRunner {

    private String userID;

    @BeforeSuite(alwaysRun = true)
    @Parameters({"userID"})
    public void setUserID(String userID) {
        Config.setID(userID);
    }


    @AfterSuite
    public void tearDownClass() {
        ExtentReportManager.getReporter().flush();
    }
}

