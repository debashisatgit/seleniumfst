package seleniumfstseason;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		// Handle AutoSuggestion Drop Down
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THI1901459\\chromedriver.exe"); // for lunching chrome 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//driver.findElement(By.id("fromCity")).clear();
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("MUMBAI");
		Thread.sleep(3000);	
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);   can also use key bord keys
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']/div/div/p[contains(text(),'Mumbai, India')]")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin']/div/input[@class='react-autosuggest__input react-autosuggest__input--open' and @placeholder='To']")).sendKeys("Delhi");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']/div/div/p[contains(text(),'Delhi, India')]")).click();
		
	}

}
