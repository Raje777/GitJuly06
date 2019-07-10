package org.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redif {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Raji\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
driver.get("https://www.lvbank.com/search.aspx?zoom_query=");

driver.manage().window().maximize();
WebElement r= driver.findElement(By.xpath("//input[@class='zoom_button']"));
r.click();
Alert a=driver.switchTo().alert();
String b=a.getText();
System.out.println(b);
a.accept();

}
}
	

