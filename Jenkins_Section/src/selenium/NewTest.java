package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pradeep.s\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://gmail.com/");
		
		String title = driver.getTitle();
		
		System.out.println("The title of the page is: "+title);
		
		System.out.println(driver.getTitle());
		
		System.out.println("The current page title is: "+driver.getTitle());
		
		String current_url = driver.getCurrentUrl();
		System.out.println("The current page url is "+current_url);
		/*
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		*/
		
		WebElement text = driver.findElement(By.xpath("(//div[@class='PrDSKc'])[3]"));
		
		String get_text = text.getText();
		
		System.out.println("The text is: "+get_text);
		
		WebElement userid = driver.findElement(By.id("identifierId"));
		userid.sendKeys("Testing Automation");
		
		String input_value = userid.getAttribute("value");
		System.out.println("The given input value is: "+input_value);
  }
}
