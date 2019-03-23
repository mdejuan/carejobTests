package com.lazerycode.selenium.page_objects;

import org.openqa.selenium.By;
import static com.lazerycode.selenium.util.AssignDriver.initQueryObjects;
import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.util.Query;

public class CareJobHomePage {
	
	private Query loginButton = new Query().defaultLocator(By.partialLinkText("Log In"));
	
	public CareJobHomePage() throws Exception {
        initQueryObjects(this, DriverBase.getDriver());
    }
	
	public void goLoginPage() {
		loginButton.findWebElement().click();
    }
}
