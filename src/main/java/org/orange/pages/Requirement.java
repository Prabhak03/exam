package org.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.orange.base.baseclass;



public class Requirement extends baseclass{
	public Requirement(RemoteWebDriver driver) {
		this.driver= driver;
	} 

	
	public RequirementEditPage correctLogin() {
    	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
    	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
    	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    	
    	return new RequirementEditPage(driver);
    	
    }

}
