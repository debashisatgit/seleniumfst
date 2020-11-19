package seleniumfstseason;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THI1901459\\chromedriver.exe"); // for lunching chrome 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),' Amritsar (ATQ)')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']/following::div[@class='search_options_menucontent']/div/div/ul/li/a[contains(text(),' Aurangabad (IXU)')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']//following::div[7]/ul/li/a[text()=' Ahmedabad (AMD)']")).click();
		Thread.sleep(2000);		
		System.out.println("Second DD is clickable");
		driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']/a/following::table[1]/tbody/tr/td[@class=' ui-datepicker-unselectable ui-state-disabled ']/span[contains(text(),'3')]")).click();
		Thread.sleep(2000);	
		System.out.println("from date is selected");
		driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']/a/following::table[1]/tbody/tr/td[@class=' ui-datepicker-unselectable ui-state-disabled ']/span[contains(text(),'5')]")).click();
		Thread.sleep(2000);	
		System.out.println("to date is selected");	
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']/option[contains(text(),'3')]")).click();
		Thread.sleep(2000);
		System.out.println("Number of passenger selected");
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']/option[contains(text(),'INR')]")).click();
		System.out.println("currency selected");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		Thread.sleep(5000);	
		System.out.println("submit button is clickable");
		
		
		
		
		
		
		
		

	}

}
