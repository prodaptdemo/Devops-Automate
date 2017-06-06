package com.prodapt.devops.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddContacts {

	public void addContactInformation() throws InterruptedException {
		WebDriver driver = Automate.getBrowser();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.id("txtUserName")).sendKeys("demo");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("demo");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("txtname")).sendKeys("Prodapt");
		Thread.sleep(2000);
		driver.findElement(By.name("txtlocation")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.name("txtphone")).sendKeys("04449033000");
		Thread.sleep(2000);
		driver.findElement(By.id("btnAddContact")).click();
		Thread.sleep(4000);
		System.out.println("--- Test Passed --- ");
		driver.close();
		driver.quit();
	}
	
}
