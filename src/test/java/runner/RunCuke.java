package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//This Runner could be modified to test a particular feature or to run all the features.
//Kindly note that the tags = {""} are left blank, so as to run all the feature files, having all the Test Cases
@CucumberOptions(features = { "src/test/resources/features/" },
		glue = { "steps" },
		tags = {""}, monochrome = true,
		plugin = {"html:target/RunCuke/cucumber-html-report", "json:target/RunCuke/cucumber.json",
		"junit:target/RunCuke/cucumber.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
		)

// AbstractTestNGCucumberTests is used to run each Cucumber scenario as a separate Test.
public class RunCuke extends AbstractTestNGCucumberTests{
	
	//Here we've tried to generate a separate Extent-Report. However the Extent reporting has failed due
	//to some issues. This is a 'Work in Progress'. So kindly omit the same.
	@BeforeClass
    public static void setup() {
        // Initiates the extent report and generates the output in the output/Run_<unique timestamp>/report.html file by default.
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		String fileName = System.getProperty("user.dir")+"\\target\\Extent_Reports\\" + strDate+".html";
		File newFile = new File(fileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);
		//static report name
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File("F:\\cucumber-testing-master\\ExtenReports\\extentreports.html"),false);
        // Loads the extent config xml to customize on the report.
        ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));

        // User can add the system information as follows
        ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
        ExtentCucumberFormatter.addSystemInfo("Browser version", "v85.0.4183.121");
        ExtentCucumberFormatter.addSystemInfo("Selenium version", "v3.8.1");

        // Also you can add system information using a hash map
        Map systemInfo = new HashMap();
        systemInfo.put("Cucumber version", "v1.2.3");
        systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
        ExtentCucumberFormatter.addSystemInfo(systemInfo);
	
	

}


}
