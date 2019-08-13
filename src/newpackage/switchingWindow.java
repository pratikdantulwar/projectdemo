package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchingWindow {
	public static void main(String[] args) {
		//deceleration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://demo.guru99.com/selenium/deprecated.html";

		//opening the web
		driver.get(baseURL);
		
		//switching between the window
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();
				
		//closing of the browser
		//driver.close();
	}

}
