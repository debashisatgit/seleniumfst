package seleniumfstseason;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCardSpletingValueWithoutC {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THI1901459\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		
		int j = 0;
		String[] ItemsNeeded = {"Cucumber","Brocolli","Beetroot"};    //declaring array to select multiple products from cart    //changed now
				 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i = 0; i<product.size(); i++)
		{
			//Cucumber - 1 Kg
			String[] name = product.get(i).getText().split("-");   //split method to split the web element into 2 parts
		    String formatedname = name[0].trim();                 //method to trim the space in the web element
		    
			List itemsneededlist = Arrays.asList(ItemsNeeded);
			
			
			if(itemsneededlist.contains("formatedname"))         // these name will in itemsneededlist in up in array string
			
			//if(name.contains("Cucumber"))
			{
				j++;
				
				driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click();    //FINFELEMENTS BCZ 30 ELEMENTS ARE PRESENT IN THAT XPATH
			if(j==3)
			{				
			    break;
			}
			System.out.println("add button click");
		}
		
		
		Thread.sleep(3000);
		driver.close();
		
	}

		

	}

}
