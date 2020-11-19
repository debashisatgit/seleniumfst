package seleniumfstseason;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HndleDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THI1901459\\chromedriver.exe"); // for lunching chrome 
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://uitestpractice.com/Students/Select");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Select select = new Select(driver.findElement(By.id("countriesSingle")));
		//select.selectByVisibleText("United states of America");
		//select.selectByIndex(2);
		select.selectByVisibleText("England");
		
		
		


	}

}
