package org.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Base {
		static WebDriver driver;

		public static WebDriver getDriver() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Raji\\eclipse-workspace\\Tasks\\driver\\chromedriver.exe");
			driver= new ChromeDriver();
			return driver;
			
		}
		public static void loadUrl(String Url) {
			driver.get(Url);
			
			
		}
public static void type(WebElement element, String name) {
	element.sendKeys(name);
	
		
	}
}

