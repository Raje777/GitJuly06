package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raji\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gettyimages.in/");
		driver.manage().window().maximize();
		WebElement dropDown=driver.findElement(By.xpath("//div[text()='Creative Images']"));
		Select s= new Select(dropDown);
		boolean di= s.isMultiple();
		System.out.println(di);
		s.selectByVisibleText("Video");
		
	}
}
