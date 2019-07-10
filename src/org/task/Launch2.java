package org.task;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Launch2 {

		public static void main(String[] args) {
			
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Raji\\eclipse-workspace\\Selenium1\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();

		driver.get("http://www.greenstechnologys.com/");

		driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.com/");
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		String url= driver.getCurrentUrl();
		System.out.println(url);

		String ti= driver.getTitle();
		System.out.println(ti);
		}
		}

