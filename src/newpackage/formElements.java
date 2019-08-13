package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class formElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//deceleration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseURL = "https://mail.rediff.com/cgi-bin/login.cgi";

		//opening the web
		driver.navigate().to(baseURL);;
				
		//finding the web element corresponding to email
		WebElement email = driver.findElement(By.id("login1"));
		
		//finding the web element corresponding to password
		WebElement pwd = driver.findElement(By.id("password"));
		
		//email.click();
		
		//sending the values
		email.sendKeys("pratik@123");
		
		//pwd.click();
		pwd.sendKeys("123");
		
		System.out.println("sucess");
		
		WebElement submit = driver.findElement(By.name("proceed"));
		
		//Submitting the form
		submit.click();
		
		//SubmitLogin
		
		//closing the driver
		//driver.close();
	}

}
