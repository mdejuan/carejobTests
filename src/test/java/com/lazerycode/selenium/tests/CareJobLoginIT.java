package com.lazerycode.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.page_objects.CareJobHomePage;
import com.lazerycode.selenium.page_objects.CareJobLoginPage;

public class CareJobLoginIT extends DriverBase {
	
	@Test
	public void careJobLogin() throws Exception {

		WebDriver driver = getDriver();

		driver.get("https://www.thecarejob.com");
		Thread.sleep(7000);
		CareJobHomePage homePage = new CareJobHomePage();

		// Check the title of the page
		System.out.println("Page title is: " + driver.getTitle());

		homePage.goLoginPage();

		CareJobLoginPage loginPage = new CareJobLoginPage();
		
		loginPage.enterLogin("jmarcosjm@gmail.com","777777");
		
		loginPage.login();
		Thread.sleep(5000);
		System.out.println("Page title is: " + driver.getTitle());
	}

}
