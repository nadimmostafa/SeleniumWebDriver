package org.nadim.driver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PopUpWindow {
	static WebDriver driver;

	public static void openUrl() {
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com");
		driver.manage().window().maximize();;
	}
	
	public static void verifyLogin() {
		driver.findElement(By.linkText("SauceDemo.com")).click();
		driver.findElement(By.cssSelector("form_group.input_error.form_input")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button btn_action")).click();
	}
	
	public static void verifyPopUp() {
		driver.findElement(By.linkText("FeedBack")).click();
		Set<String> windows = driver.getWindowHandles();
		Object[] array = windows.toArray();
		driver.switchTo().window(array[1].toString());
		driver.findElement(By.id("name")).sendKeys("Nadim");
		driver.findElement(By.id("email")).sendKeys("javapro426@gmail.com");
		// drop down
		new Select(driver.findElement(By.name("name"))).selectByVisibleText("nadim");
		driver.close();
		
		driver.switchTo().window(array[0].toString());
		driver.findElement(By.name("logout")).click();
		
	}
	public static void main(String[] args) {

	}

}
