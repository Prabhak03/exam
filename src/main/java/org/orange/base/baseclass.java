package org.orange.base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	
	String URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	public RemoteWebDriver driver=null;
	
	
	
	@BeforeMethod
	public void startup() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get(URL);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	}
	


