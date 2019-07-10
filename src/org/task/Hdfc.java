package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raji\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	WebElement r= driver.findElement(By.name("fldLoginUserId"));
	js.executeScript("arguments[0].setAttribute('value','123454')",r);
	String name= (String) js.executeScript("return arguments[0].getAttribute('value')", r);

	System.out.println(name);
			
		
			WebElement ar= driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
			js.executeScript("arguments[0].click()",ar);
	}
	
}
