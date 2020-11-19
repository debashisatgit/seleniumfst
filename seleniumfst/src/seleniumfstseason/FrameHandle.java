package seleniumfstseason;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
	
		//frames are component which are hosted in the web page , independ from the html code 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THI1901459\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);	
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.xpath("//div[@id='draggable']")).click();
		System.out.println("Contain frame working");
		
		
		
		
		
		

	}

}
