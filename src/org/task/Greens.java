package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raji\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
WebElement search= driver.findElement(By.xpath("//input[@title='Search']"));
	search.sendKeys("greens velmurugan");
	
	WebElement sea= driver.findElement(By.xpath("(//input[@type='submit'])[3]"));
	sea.click();
	
	WebElement search1=driver.findElement(By.xpath("//cite[@class='iUh30']"));
	search1.click();


	
}
}


