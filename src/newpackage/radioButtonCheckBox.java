package newpackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class radioButtonCheckBox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//deceleration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String baseURL = "http://demo.guru99.com/test/radio.html";

		//opening the web
		driver.get(baseURL);

		
		
		//finding the web element corresponding to email
		WebElement radioButton1 = driver.findElement(By.id("vfb-7-1"));

		//finding the web element corresponding to email
		WebElement radioButton2 = driver.findElement(By.id("vfb-7-2"));

		radioButton1.click();
		
		radioButton2.click();

		System.out.println("sucess");

		//closing the driver
		//driver.close();
	}
}
