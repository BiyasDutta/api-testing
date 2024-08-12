package runner;

import com.aventstack.extentreports.ExtentTest;
import common.Config;
import org.testng.annotations.*;
import reporting.ExtentManager;
import reporting.ExtentReportManager;

public class BaseRunner {

    private String userID;

    @BeforeSuite(alwaysRun = true)
    @Parameters({"userID"})
    public void setUserID(String userID) {
        Config.setID(userID);
    }


    @AfterClass
    public void tearDownClass() {
        ExtentReportManager.getReporter().flush();
    }
}

