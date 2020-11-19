package SeleniumSeissionFstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondSeissonDd {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THI1901459\\cromeDriverEx\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  
		
		driver.manage().window().maximize();
		
		driver.get("http://uitestpractice.com/Students/Select#");
		
		System.out.println(driver.getTitle());
		Thread.sleep(5000);	
		Select select = new Select(driver.findElement(By.xpath("//select[@id='countriesSingle']")));
		Thread.sleep(5000);	
		//select.selectByVisibleText("England");
		select.selectByIndex(2);		
		Thread.sleep(5000);	
		System.out.println("select option is working");
		Thread.sleep(5000);	
		driver.close();

	}

}
