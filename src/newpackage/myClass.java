package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myClass {
	public static void main(String[] args) {
		//deceleration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "http://demo.guru99.com/test/newtours/";
		
		String expectedTitle = "Welcome: Mercury Tours";
		
		String actualTitle = "";
		
		//launching of the browser and passing the url to it
		driver.get(baseURL);
		
		//get the actual value from the title
		actualTitle = driver.getTitle();
		
		//comparing the actual title
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		
		//closing of the browser
		driver.close();
	}

}
