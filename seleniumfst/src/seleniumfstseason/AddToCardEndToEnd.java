package seleniumfstseason;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCardEndToEnd {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\THI1901459\\chromedriver.exe"); // for lunching chrome 
		WebDriver driver = new ChromeDriver(); 
		
		String[] ItemsNeeded = {"Cucumber - 1 Kg","Beetroot - 1 Kg","Beetroot - 1 Kg"};    //declaring array to select multiple products from cart
		 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		//get all the elements with css selector of product name 
		//to click the particular item from the list of items with changing the item name and can click the value
		
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i = 0; i<product.size(); i++)
		{
			String name = product.get(i).getText();
			//once get the name have to format it
			//convert array into array list for search
		   //check whether names you extended is present in the array list or not
			// so basically the names will check the eitems present in the list then it will click
			
			List itemsneededlist = Arrays.asList(ItemsNeeded);
			
			if(itemsneededlist.contains("name"))   // these name will in itemsneededlist in up in array string
			
			//if(name.contains("Cucumber"))
			{
				//click on ADD TO CARD BUTTON
				
				driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click();    //FINFELEMENTS BCZ 30 ELEMENTS ARE PRESENT IN THAT XPATH
				//break;       .............we can not use break value if we are iterating maltiple value in a list , if single can use "break statement"
				
			}
			System.out.println("add button click");
		}
		
		
		Thread.sleep(3000);
		driver.close();
		
	}

	//private static WebElement get(int i) {
		// TODO Auto-generated method stub
		//return null;
	}

//}
