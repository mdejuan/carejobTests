package com.lazerycode.selenium.page_objects;

import static com.lazerycode.selenium.util.AssignDriver.initQueryObjects;

import org.openqa.selenium.By;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.util.Query;

public class CareJobLoginPage {
	private Query emailInput = new Query().defaultLocator(By.xpath("//*[@id=\"tab1\"]/form/p[1]/label/input"));
	private Query passwordInput = new Query().defaultLocator(By.name("password"));
	private Query loginButton = new Query().defaultLocator(By.name("login"));

	public CareJobLoginPage() throws Exception {
		initQueryObjects(this, DriverBase.getDriver());
	}

	public CareJobLoginPage enterLogin(String email, String password) {
		emailInput.findWebElement().clear();
		emailInput.findWebElement().sendKeys(email);
		passwordInput.findWebElement().clear();
		passwordInput.findWebElement().sendKeys(password);

		return this;
	}

	public void login() {
		loginButton.findWebElement().click();
	}
}
