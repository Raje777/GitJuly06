package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raji\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement mouse= driver.findElement(By.xpath("//a[@href='/gp/site-directory?ref_=nav_shopall_btn']"));
		
		Actions a= new Actions(driver);
		a.moveToElement(mouse).perform();
		WebElement mouse1= driver.findElement(By.xpath("//span[@aria-label='Mobiles, Computers']"));
		a.moveToElement(mouse1).perform();
		WebElement button= driver.findElement(By.xpath("//span[text()='Power Banks']"));

	button.click();
		
		
		
	}

}
