package org.Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Requirement {

	@Test
public void req() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("prabha");
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("karan");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("k");
		driver.findElement(By.xpath("//input[@placeholder=\"Type here\"]")).sendKeys("prabhak0312@gmail.com");
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		
		
		
	}
}
