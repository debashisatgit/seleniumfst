package SeleniumSeissionFstClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondSeissonBdd {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\THI1901459\\cromeDriverEx\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  
		
		driver.manage().window().maximize();
		
		driver.get("http://uitestpractice.com/Students/Select#");
		
		System.out.println(driver.getTitle());
		Thread.sleep(6000);	
		
		driver.findElement(By.id("dropdownMenu1")).click();
		Thread.sleep(6000);	
		System.out.println("able to click the dd");
		
		List<WebElement> list = driver.findElements(By.xpath("//button[@id='dropdownMenu1']//following::ul//li"));
		System.out.println(list.size());
		
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		
		if(list.get(i).getText().contains("India")){
			
			list.get(i).click();
			break;
		}
		
		}
	}

	}
