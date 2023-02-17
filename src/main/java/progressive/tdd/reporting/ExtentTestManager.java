package progressive.tdd.reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentTestManager {

	public static ExtentReports extentReports;
	

	public static synchronized ExtentReports initialExtentReport() {
		try {
			if (extentReports == null)  {
			extentReports = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReporting.html");
			spark.config().setReportName("Progressive QA Automation");
			spark.config().setTheme(Theme.DARK);
			extentReports.attachReporter(spark);
			extentReports.setSystemInfo("Testing", "Regression");
			extentReports.setSystemInfo("Team", "QA - Marvel");
			extentReports.setSystemInfo("0S", System.getProperty("0S.name"));
			extentReports.setSystemInfo("0S Version", System.getProperty("0S.version"));
			extentReports.setSystemInfo("Host", System.getProperty("user.name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return extentReports;

	}
}