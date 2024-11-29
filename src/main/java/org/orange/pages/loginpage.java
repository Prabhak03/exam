package org.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.orange.base.baseclass;

public class loginpage extends baseclass {
    
    public loginpage(RemoteWebDriver driver) {
        this.driver = driver;
    }
    
    // Updated methods with parameters
    public loginpage userName(String username) {
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
        return this;
    }
    
    public loginpage Password(String password) {
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
        return this;
    }
    
    public Requirement submit() {
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        
        return new Requirement(driver);
    }
    
    
   
    
}
