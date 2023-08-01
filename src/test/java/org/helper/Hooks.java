package org.helper;

import java.io.IOException;
import java.time.Duration;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void beforeScenar() {
		openChromeBrowser();
		maxWindow();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

	}

	@After
	public void toTakeScreenshot(Scenario s) throws IOException {

		String as = s.getName();
		String replaceName = as.replace(" ", "_");
		toTakeScreenshot(replaceName);

	}

}
