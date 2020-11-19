package seleniumfstseason;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THI1901459\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);	
		driver.findElement(By.cssSelector(".a-button.a-spacing-top-base.a-button-base.glow-toaster-button.glow-toaster-button-dismiss")).click();
		Actions a = new Actions(driver);         //Actions class obj for mouce over and drag and drop
		//WebElement move =driver.findElement(By.cssSelector("//a[@id='nav-link-accountList']")); //pass it to a variable move XPath of the element
		//a.moveToElement(driver.findElement(By.xpath("move"))).build().perform();
		//a.moveToElement(move).contextClick().build().perform();  //for right click on the element
		Thread.sleep(1000);	
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		System.out.println("mouce is moving");
		Thread.sleep(4000);	
		//driver.close();
		
	}

}
