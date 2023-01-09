package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
 
	driver.get("https://skpatro.github.io/demo/links/");
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	
	Set<String> ids = driver.getWindowHandles();//multiple window address save
    ArrayList<String> al=new  ArrayList<String>(ids);
    
    String cwid = al.get(1);//child window
  
    driver.switchTo().window(cwid);
  Thread.sleep(2000);
  driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();

  driver.switchTo().window(al.get(0));
  driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
}
}
