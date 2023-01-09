package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSingIn {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.facebook.com/r.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 
	WebElement fname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
   fname.sendKeys("sandip");
  WebElement lname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
lname.sendKeys("kadam");
driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("8605196867");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1233444");
WebElement x = driver.findElement(By.xpath("//select[@title='Day']"));
Select a=new Select(x);
//a.selectByIndex(20);//he take value in length formate21== he took 22
//a.selectByValue("21");//he take exact value which we diclear
a.selectByVisibleText("21");//he take exact value which we diclear
 
WebElement month = driver.findElement(By.xpath("//select[contains(@id,'month')]"));
 Select y=new Select(month);
 y.selectByValue("May");
 
 WebElement year = driver.findElement(By.xpath("//select[contains(@id,'year')]"));
Select z=new Select(year);
z.selectByVisibleText("1997");

driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
driver.findElement(By.xpath("//input[@name='custom_gender']")).sendKeys("male");
WebElement list = driver.findElement(By.xpath("//select[@id='js_w5']"));
Select r=new Select(list);
r.getFirstSelectedOption();
}
}
