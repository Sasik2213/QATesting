package org.prac.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.prac.pages.Login;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public WebDriver driver;
	public Login login = new Login(Login.driver);
	
	@BeforeTest
	public void startingPoint() {
		login.launchBrowser();
	}
	@AfterTest
	public void endingPoint() {
		login.driver.close();
	}

	@Test
	public void LoginFunction() throws Exception {
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://qamoviesapp.ccbp.tech/login");
		Assert.assertTrue(login.driver.findElement(By.xpath("//div[@class='login-website-logo-container']")).isDisplayed(),"Website Logo is Not Displayed!!");
		Assert.assertTrue(login.driver.findElement(By.xpath("//h1[normalize-space()='Login']")).isDisplayed());
		Assert.assertTrue(login.driver.findElement(By.xpath("//label[normalize-space()='USERNAME']")).isDisplayed());
		Assert.assertTrue(login.driver.findElement(By.xpath("//label[normalize-space()='PASSWORD']")).isDisplayed());
		login.driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();


	}
	@Test
	public void LoginCredntialsInvalidAndValidCases() throws Exception {
		
		
		login.driver.findElement(By.xpath("//input[@id='usernameInput']")).sendKeys("rahul");
		
		/*
		 * If Password enters Mismatched It will show invalid
		 * login.driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys(
		 * "One");
		 */
		/* For Valid Credentials 
		 * login.driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("rahul@2021");
		 * */
		login.driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("rahul@2021");
		login.driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
	}
}
