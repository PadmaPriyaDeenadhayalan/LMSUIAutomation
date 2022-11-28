package com.LMS.stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.LMS.base.FeatureHelper;
import com.LMS.base.constants.BrowserTypes;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	 @Before
	    public static void setUp() {
	     FeatureHelper featureHelper = new FeatureHelper();
//	     featureHelper.setUp(BrowserTypes.CHROME);
	    }
	 
	    @After
	    public void takeScreenshotOnFailure(Scenario scenario){
			if (scenario.isFailed()) {
				TakesScreenshot ts = (TakesScreenshot) FeatureHelper.getDriver();
				byte[] src = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(src, "image/png", "screenshot");
			}
			FeatureHelper.tearDown();
		}
	}
