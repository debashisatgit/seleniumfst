package seleniumfstseason;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THI1901459\\chromedriver.exe"); // for lunching chrome 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		Thread.sleep(5000);
		
		//is selected method is used to validate whether the checkbox is selected o not
		
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		System.out.println("check box is selected");
		
		//count of the total num of checkbox present in the page
		
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(list.size());{
			
			//Assert.assertEquals("//input[@type='checkbox']", "6");
			
			for(int i =0;i<list.size();i++)
				
				System.out.println(list.get(i).getText());
			
		}
		
	}

}
