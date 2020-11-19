package seleniumfstseason;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THI1901459\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[text()='Click to open a new browser window!']")).click();
		System.out.println(driver.getTitle());
		
		Set<String> id = driver.getWindowHandles();
		Iterator<String> it = id.iterator();
		String parent = it.next();
		String chileId = it.next();
		driver.switchTo().window(chileId);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
		
		

	}

}
