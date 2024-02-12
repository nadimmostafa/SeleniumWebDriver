package org.nadim.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMSLoginLogout {
	static WebDriver driver;
	public static void openURL() {	
		driver =new ChromeDriver();
		driver.get("https://ultimateqa.com/dummy-automation-websites/");
		driver.manage().window().maximize();
		
	}
	
	public static void verifyLogin() {
		driver.findElement(By.linkText("SauceDemo.com")).click();
		driver.findElement(By.cssSelector("form_group.input_error.form_input")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button btn_action")).click();
	}
	
	public static void verifyLogout() {
		driver.findElement(By.linkText("Logout")).click();
	}
	
	public static void main(String[] args) {
		openURL();
		verifyLogin();
	}

}
