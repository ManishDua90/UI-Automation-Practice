package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(plugin = { "pretty",
        "html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json",
        "rerun:target/cucumber-reports/rerun.txt", "testng:target/cucumber-results.xml" },
features = "src/test/resources/features/", glue = "stepdefinitions")
 
public class Runner extends AbstractTestNGCucumberTests {
//	 ExtentHtmlReporter htmlReporter;
//	    
//	    ExtentReports extent;
//	    //helps to generate the logs in test report.
//	    ExtentTest test;
////	@AfterClass
////	public static void writeExtentReport() {
////		ExtentReports.   .loadXMLConfig(new File(Constants.REPORT_CONFIG_PATH));
////		Reporter.setSystemInfo("User Name", "AJ");
////		Reporter.setSystemInfo("Application Name", "Test App ");
////		Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
////		Reporter.setSystemInfo("Environment", "Production");
////		Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
////	}
//		
//		
//	    @BeforeTest
//	    public void startReport() {
//	    	// initialize the HtmlReporter
//	        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
//	        
//	        //initialize ExtentReports and attach the HtmlReporter
//	        extent = new ExtentReports();
//	        extent.attachReporter(htmlReporter);
//	         
//	        //To add system or environment info by using the setSystemInfo method.
//	
//	        
//	        //configuration items to change the look and feel
//	        //add content, manage tests etc
//	        htmlReporter.config().setChartVisibilityOnOpen(true);
//	        htmlReporter.config().setDocumentTitle("Extent Report Demo");
//	        htmlReporter.config().setReportName("Test Report");
//	        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
//	        htmlReporter.config().setTheme(Theme.STANDARD);
//	        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
//	    }
//	    
//	    @Test(enabled=false)
//		public void testCase6(){
//				test = extent.createTest("Test Case 6", "I'm Not Ready, please don't execute me");
//			}
//	    
//	    
//		@AfterClass
//	    public void getResult(ITestResult result) {
//	        if(result.getStatus() == ITestResult.FAILURE) {
//	            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
//	            test.fail(result.getThrowable());
//	        }
//	        else if(result.getStatus() == ITestResult.SUCCESS) {
//	            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
//	        }
//	        else {
//	            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
//	            test.skip(result.getThrowable());
//	        }
//	    }

}