package com.stepdefination;

import java.io.FileNotFoundException;

import java.io.IOException;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * 
 * @author ELCOT
 * @see Used to run after every scenario
 * @date 26-01-2023
 *
 */

public class HooksClass extends BaseClass{
	
	
	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @see Used to run before every scenario
	 */
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		
		getDriver(getPropertyFileValue("browser"));
		enterUrl(getPropertyFileValue("url"));
		maximizeWindow();
		implicityWait(30);


		
	}
	
	/**
	 * 
	 * @param scenario
	 * @see Used to run after every scenario
	 */
	@After
	public void AafterScenario(Scenario scenario) {
		
		scenario.attach(screenShot(), "image/png", "Every Scenario");
		
		/*boolean b = scenario.isFailed();
		
		if (b) {
			
			scenario.attach(screenShot(), "image/png", "Every Scenario");
		}*/
		
		quitWindow();
	}

}
