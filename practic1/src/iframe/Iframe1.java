package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		Thread.sleep(3000);
      
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	 driver.switchTo().frame(iframe);
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@type='button']")).click();
	
	//driver.switchTo().defaultContent();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	}
}
