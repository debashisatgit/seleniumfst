package seleniumfstseason;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasic {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "//C:\\Users\\THI1901459\\Downloads/geckodriver.exe");// for firefox
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THI1901459\\cromeDriverEx\\chromedriver.exe"); // for lunching chrome 
		WebDriver driver = new ChromeDriver(); // Obj of chrome driver
		driver.manage().window().maximize();   // for maximize window
		driver.get("https://ui.cogmento.com/"); // for getting url
		System.out.println(driver.getTitle()); // for printing the tite of the window
		System.out.println(driver.getCurrentUrl()); // for getting the Current URL
		//System.out.println(driver.getPageSource()); // for getting the page source
		//driver.get("https://in.yahoo.com/?p=us");
		//System.out.println(driver.getTitle());
		//driver.navigate().back();     // for navigating back
		//System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("debashismohanty0025@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("synergy@123");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		System.out.println(driver.getTitle());
		//System.out.println(driver.findElement(By.xpath("//div[@class='content']/span[@class='header' and contains(text(),'Call Queue')]")).getText());
		//driver.findElement(By.id("//'identifierId']")).sendKeys("fhdsfhsfgsfgsiyfg");
		//driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		//C:\\Users\\THI1901459\\cromeDriverEx\\chromedriver.exe  // new value driver
		//C:\\Users\\THI1901459\\chromedriver.exe //old value driver
		
		
		
		
		
		//driver.quit();                        // for quiting the browser
		
	

	}

}
