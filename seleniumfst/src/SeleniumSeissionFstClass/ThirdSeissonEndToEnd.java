package SeleniumSeissionFstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ThirdSeissonEndToEnd {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\THI1901459\\cromeDriverEx\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(9000);	
		
		//Select select = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']")));
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//a[text()=' Ahmedabad (AMD)']")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']//following::div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//table//li[2]//a[contains(text(),' Amritsar (ATQ)')]")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']//option[2]")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']//option[2]")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		Thread.sleep(5000);	
		
		//a[@class='ui-state-default ui-state-highlight ui-state-active']
		//div[@id='divpaxinfo']
		//select[@id='ctl00_mainContent_ddl_Adult']
		//select[@id='ctl00_mainContent_ddl_Adult']//option[2]
		//select[@id='ctl00_mainContent_DropDownListCurrency']
		//select[@id='ctl00_mainContent_DropDownListCurrency']//option[2]
		//input[@id='ctl00_mainContent_btn_FindFlights']
		
		
		
		

	}

}
