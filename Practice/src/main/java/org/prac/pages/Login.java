package org.prac.pages;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static WebDriver driver;
	
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://qamoviesapp.ccbp.tech/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}

}
