package org.task;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raji\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Syed@gmail.com");

		String a = user.getAttribute("value");
		System.out.println(a);

		String a1 = user.getAttribute("type");
		System.out.println(a1);



		List<WebElement> f = driver.findElements(By.xpath("//input[@type='radio']"));
		         int size = f.size();
		System.out.println(size);
		}
		}