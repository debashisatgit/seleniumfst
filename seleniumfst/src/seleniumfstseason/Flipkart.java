package seleniumfstseason;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THI1901459\\cromedrivernew\\chromedriver.exe"); // for lunching chrome 
		WebDriver driver = new ChromeDriver();        // C:\\Users\\THI1901459\\cromeDriverEx\\chromedriver.exe
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA _1dBPDZ']")).sendKeys("8249492829");
		driver.findElement(By.xpath("//input[@type='password' and @class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Synergy@123");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']//span[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("google pixel 4a");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Google Pixel 4a (Just Black, 128 GB)')]")).click();
		String childwindow = null;
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("//button[contains(text(),'NOTIFY ME')]")).click();
        //driver.quit();
	
	}

}
