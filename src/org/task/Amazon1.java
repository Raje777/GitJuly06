package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raji\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement mouse= driver.findElement(By.xpath("//a[@href='/gp/site-directory?ref_=nav_shopall_btn']"));
	Actions a= new Actions(driver);	
	a.moveToElement(mouse).perform();
	WebElement mouse1= driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
	a.moveToElement(mouse1).perform();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement button= driver.findElement(By.xpath("//span[text()='All Mobile Phones']"));

button.click();
WebElement oneplus= driver.findElement(By.xpath("//img[@src='https://images-eu.ssl-images-amazon.com/images/G/31/img19/Wireless/OnePlus/OnePlus7/ICICI_Citi/7Pro/V124670824_IN_WLM_OnePlus7Series_LastDayofOffers_cg_670x700._CB443516003_.jpg']"));
oneplus.click();
WebElement cart =driver.findElement(By.id("buy-now-button"));
cart.click();
}
}
