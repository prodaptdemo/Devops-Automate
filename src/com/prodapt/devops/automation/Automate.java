package com.prodapt.devops.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Automate {

	private static String url;
	private static String browser;
	private static String driverPath;

	public static String getUrl() {
		return url;
	}

	public static WebDriver getBrowser() {
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			driver = new FirefoxDriver();
		}
		driver.get(url);
		return driver;
	}

	public static void main(String[] args) {
		try {
			url = args[0];
			browser = args[1];
			driverPath = args[2];
			// url = "http://192.168.54.186:8081/";
			// browser = "IE";
			AddContacts addContacts = new AddContacts();
			addContacts.addContactInformation();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
