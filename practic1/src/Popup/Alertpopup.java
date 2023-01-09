package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

public static void main(String[] args) throws InterruptedException  {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.seleniumacademy.com/cookbook/Alerts.html");
	
	//driver.findElement(By.xpath("//input[@id='simple']")).click();
//	Thread.sleep(2000);
	//driver.switchTo().alert().accept();
	
	//driver.findElement(By.xpath("//button[@id='confirm']")).click();
//	Thread.sleep(2000);
	//String text = driver.switchTo().alert().getText();
	
//	System.out.println(text);

	
	
	driver.findElement(By.xpath("//button[@id='prompt']")).click();
	Thread.sleep(2000);
	Alert alt = driver.switchTo().alert();
     alt.sendKeys("sandip");
     alt.accept();
}


}
