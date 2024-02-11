package org.nadim.allbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowsers {

	public static void main(String[] args) {
           chromeBrowser();
           fireFox();
	}
	
	public static void chromeBrowser() {
		ChromeDriver chromeDriver = new ChromeDriver();
		/*
		 * this method get one parameter that is website url
		 * and open this side on provided browser
		 */
		chromeDriver.get("https://www.youtube.com");
	}
	
	public static void fireFox() {
		new FirefoxDriver().get("https://www.youtube.com");; 
	}

}
