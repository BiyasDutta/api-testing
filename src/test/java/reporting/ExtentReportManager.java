package reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.util.Random;

public class ExtentReportManager {
    private static Random random = new Random();
    private static String DEFAULT_REPORT_LOCATION = "/Users/biyas/Documents/Code/Java/RestAssuredDemo/reports/html/apiTesting_"
            +random.nextInt(10000)+".html";
    protected static ExtentReports extentReports;

    public synchronized static ExtentReports getReporter(){
        if (extentReports == null) {
            ExtentSparkReporter reporter = new ExtentSparkReporter(DEFAULT_REPORT_LOCATION);
            reporter.config().setDocumentTitle("APITesting");
            reporter.config().setTheme(Theme.DARK);
            reporter.config().setTimeStampFormat("DD/MM/YYYY hh:mm:ss");
            reporter.config().setReportName("RestAPITesting");
            extentReports = new ExtentReports();
            extentReports.attachReporter(reporter);
        }
        return extentReports;
    }
}
