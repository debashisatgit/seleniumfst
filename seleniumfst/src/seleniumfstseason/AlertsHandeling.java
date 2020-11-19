package seleniumfstseason;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandeling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THI1901459\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//button[@class='btn btn-default' and text()='Click me!']")).click();
		System.out.println("button is clickable");
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();             //method for dismissing the allert
		
		
		
		
		
		
		
		Thread.sleep(5000);	
		driver.close();
		
		
	}

}
