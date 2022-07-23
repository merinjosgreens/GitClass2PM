package org.info;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Company {

	static WebDriver driver;

	@BeforeClass // before execution all test methods it will get execute only one time
	public static void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}

	@AfterClass // after execution all test methods it will get execute only one time
	public static void quitBrowser() {
		driver.quit();
	}

	@Before // before execution of each and every test methods it will get execute
	public void startTime() {

		Date d = new Date();
		System.out.println(d);

	}

	@After // after execution of each and every test methods it will get execute
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void tc1() {
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("123456789");

		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Hello@123");

		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();

	}

}
