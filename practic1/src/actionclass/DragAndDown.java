package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDown {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
//	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/drag_drop.html ");
	Thread.sleep(3000);

   WebElement amt = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));

   WebElement place = driver.findElement(By.xpath("(//ol[@align='center'])[2]"));

   Actions a=new Actions(driver);//object

   a.dragAndDrop(amt, place).perform();

   WebElement acc = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));

   WebElement place1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

     Actions b= new Actions(driver);
       b.dragAndDrop(acc, place1).perform();

       WebElement amm = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));

       WebElement place2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

Actions c=new Actions(driver);
c.dragAndDrop(amm, place2).perform();

     WebElement loan = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));

      WebElement place3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

Actions d=new Actions(driver);
d.dragAndDrop(loan, place3).perform();
}
}
