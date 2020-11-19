package seleniumfstseason;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEndSJet {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\THI1901459\\\\cromeDriverEx\\\\chromedriver.exe"); // for lunching chrome 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),' Amritsar (ATQ)')]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']//following::div[7]/ul/li/a[text()=' Ahmedabad (AMD)']")).click();
		Thread.sleep(2000);		
		System.out.println("Second DD is clickable");
		driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']/a/following::table[1]/tbody/tr/td[@class=' ui-datepicker-unselectable ui-state-disabled ']/span[contains(text(),'3')]")).click();
		Thread.sleep(2000);	
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		System.out.println("One way is clickable");
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']/option[text()='3']")).click();
		Thread.sleep(4000);
		System.out.println("Number of passenger selected");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']/option[text()='INR']")).click();
		Thread.sleep(1000);
		System.out.println("currency is selected");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();  //to click date button 
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active' and contains(text(),'8')]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(1000);
		System.out.println("Dep date is selected");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@class='ui-datepicker-month' and text()='June']/following::table[@class='ui-datepicker-calendar']/tbody/tr/td[7]/span/following::td[7]/a[contains(text(),'13')]")).click();
		//System.out.println("Return date is selected");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		System.out.println("Senior citizen check box is selected");
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		Thread.sleep(8000);
		System.out.println("Search button is clickable");
		
        driver.close();
	}

}
