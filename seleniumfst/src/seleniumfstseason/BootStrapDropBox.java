package seleniumfstseason;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THI1901459\\chromedriver.exe"); // for lunching chrome 
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://uitestpractice.com/Students/Select");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);				
	    driver.findElement(By.xpath("//button[@id='dropdownMenu1']")).click();
		System.out.println("Button is clickable");
		List<WebElement> list = driver.findElements(By.xpath("//button[@id='dropdownMenu1']/following::ul[@class='dropdown-menu']/li"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i).getText());
			Thread.sleep(5000);
			if(list.get(i).getText().contains("India")) {
				Thread.sleep(5000);
				list.get(i).click();
				break;
			}
		}
		
		
		
		
		Thread.sleep(5000);
		driver.close();

	}

}
