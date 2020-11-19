package SeleniumSeissionFstClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FstTestClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THI1901459\\cromeDriverEx\\chromedriver.exe");  //set the system property
		//System.setProperty("webdriver.gecko.driver", "//C:\\Users\\THI1901459\\Downloads/geckodriver.exe");
		WebDriver driver = new ChromeDriver(); //inisiate the corome driver  
		driver.manage().window().maximize(); //it is used to maximized the browser
		driver.get("https://www.google.com/"); // get the url of the webapp		
		System.out.println(driver.getTitle()); //geet the title of the following page 
		Thread.sleep(9000);	
		
		System.out.println("pass");
		
		
		
		
		
		
		
		
	}

}
