package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greensoveral {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raji\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement text= driver.findElement(By.xpath("//h2[contains(text(), 'Greens Technologys Overall Reviews')]"));
		
String t=text.getText();
System.out.println(t);


		
}
}