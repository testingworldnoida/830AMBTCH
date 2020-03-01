package org.web.hcl.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature", dryRun=false, 
                 glue="org.web.hcl.steps" ,
                 monochrome=true, 
                 tags="@Regression",
                		 plugin= {"html:target/cucumber-report/",
                					"json:target/cucumber.json",
                					"pretty:target/cucumber-pretty.txt",
                					"junit:target/cucumber-results.xml",
                			"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"}
                 )
public class TestRunner {
	
	@BeforeClass
	public static void setup() {
		ExtentProperties   extentproperties    =    ExtentProperties.INSTANCE;
		extentproperties.setReportPath("./Reports/Regression.html");
	}


}
