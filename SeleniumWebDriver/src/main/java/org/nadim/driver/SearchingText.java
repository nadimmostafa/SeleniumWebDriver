package org.nadim.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchingText {
	
	//create chorme browser object
	static WebDriver driver;
	
	public static void openChrome() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	
	public static void searchingAndOpeningUrl()throws Exception {
		driver.findElement(By.name("q")).sendKeys("Quran");
		Thread.sleep(100);
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.cssSelector("h3.LC20lb.MBeuO.DKV0Md")).click();
	}
	public static void main(String[] args) throws Exception{
		openChrome();
		searchingAndOpeningUrl();
	}

}
