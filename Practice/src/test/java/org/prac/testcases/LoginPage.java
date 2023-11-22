package org.prac.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.prac.pages.Login;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public WebDriver driver;
	public Login login = new Login(Login.driver);

	@Test
	public void LoginFunction() throws Exception {
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://qamoviesapp.ccbp.tech/login");
		login.launchBrowser();
		Assert.assertTrue(login.driver.findElement(By.xpath("//div[@class='login-website-logo-container']")).isDisplayed(),"Website Logo is Not Displayed!!");
		Assert.assertTrue(login.driver.findElement(By.xpath("//h1[normalize-space()='Login']")).isDisplayed());
		Assert.assertTrue(login.driver.findElement(By.xpath("//label[normalize-space()='USERNAME']")).isDisplayed());
		Assert.assertTrue(login.driver.findElement(By.xpath("//label[normalize-space()='PASSWORD']")).isDisplayed());
		login.driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//		login.driver.quit();

	}
}
