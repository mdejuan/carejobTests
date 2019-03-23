package com.lazerycode.selenium.page_objects;

import static com.lazerycode.selenium.util.AssignDriver.initQueryObjects;

import org.openqa.selenium.By;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.util.Query;

public class CareJobCandidatePage {
	private Query button = new Query().defaultLocator(By.xpath("//*[@id=\"formMobile\"]/div[12]/button[2]"));
	
	public CareJobCandidatePage() throws Exception {
        initQueryObjects(this, DriverBase.getDriver());
    }


}
