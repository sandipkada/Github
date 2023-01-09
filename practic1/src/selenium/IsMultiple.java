package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		                 
		Select els= new Select(year);
		boolean result = els.isMultiple();
		System.out.println(result);
		
		if(result==true) {
			System.out.println("list box is multiselecteble");
		}
		else {
			System.out.println("listbox is not multiselecteble");
		}
		
		
		
		
		
	
	}
}