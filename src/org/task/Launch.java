package org.task;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Launch {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Raji\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	driver.get("http://www.greenstechnologys.com/");

	driver.get("https://mail.google.com/");
	driver.get("https://www.flipkart.com/");
	driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	String url= driver.getCurrentUrl();
	System.out.println(url);

	String ti= driver.getTitle();
	System.out.println(ti);
	}
	}


 
