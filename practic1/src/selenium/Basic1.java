package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic1 {


public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/r.php");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

String url = driver.getCurrentUrl();//for get current URL
System.out.println(url);

String title = driver.getTitle();//for get current page title
System.out.println(title);
String exptitle = "Sign up for Facebook | Facebook";
if(title.equalsIgnoreCase(exptitle)) {
	System.out.println("navigate correct page");
}
else {
	System.out.println("navigate wrong page");
}

WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
 male.click();
boolean result = male.isSelected();//element is selected or not
if(result==true) {
	System.out.println("element is selected");
}
else {
	System.out.println("element is not selected");
}
WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

Select x=new Select(year);//object creat of select class
 List<WebElement> option = x.getOptions();
int size = option.size();//to take size 
System.out.println(size);

String reasult = year.getText();//to print present text on page
System.out.println(reasult);

WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
String att = fname.getAttribute("name");//get attribute name which webelement take path
System.out.println(att);

WebElement sub = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
boolean s = sub.isDisplayed();
System.out.println(s);
if(s==true) {
	System.out.println("element is displayed");
}
else {
	System.out.println("element is not displayed");
}
boolean t = sub.isEnabled();
System.out.println(t);
if(t==true) {
	System.out.println("element is enable");
}
else {
	System.out.println("element is not disable or enable");
}


}

}
