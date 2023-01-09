package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown {
  public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	

	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
     
	
  WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
 
  
  Actions a=new Actions(driver);
  a.moveToElement(login).perform();
  
  Thread.sleep(1000);
  WebElement order = driver.findElement(By.xpath("//div[text()='Orders']"));
  Actions b=new Actions(driver);
  b.click().perform();
  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
  
  driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]")).click();
  

// WebElement more = driver.findElement(By.xpath("(//div[@class='_28p97w'])[2]"));
 // Actions c=new Actions(driver);
// c.moveToElement(more).perform();
 
 driver.findElement(By.xpath("(//div[@class='CXW8mj'])[2]")).click();//mobile
  
  
  
  
  }
}