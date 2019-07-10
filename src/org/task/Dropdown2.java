package org.task;


	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Dropdown2 {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raji\\eclipse-workspace\\Selenium1\\drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://toolsqa.com/automation-practice-form/");
			driver.manage().window().maximize();
			WebElement dropDown=driver.findElement(By.id("selenium_commands"));
			Select s= new Select(dropDown);
			boolean di= s.isMultiple();
			System.out.println(di);
			s.selectByVisibleText("Browser Commands");
	List<WebElement>siz= s.getOptions();
int so= siz.size();
System.out.println(so);

List<WebElement>e= s.getOptions();
for(int i=0;i<e.size();i++)
{
	WebElement select=e.get(i);
	String f= select.getText();
	if(i%2==0)
	s.selectByVisibleText(f);
	System.out.println(f);
	
}

}}
