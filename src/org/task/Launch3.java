package org.task;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
	public class Launch3 {

			public static void main(String[] args) {
				
			System.setProperty("webdriver.ie.driver","C:\\Users\\Raji\\eclipse-workspace\\Selenium1\\drivers\\IEDriverServer.exe");
			WebDriver driver= new InternetExplorerDriver();
         driver.get("http://www.greenstechnologys.com/");
			String url= driver.getCurrentUrl();
			System.out.println(url);
			String tit= driver.getTitle();
			System.out.println(tit);
			}
			}

	

