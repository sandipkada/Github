package selenium;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElement {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//driver.get("https://www.facebook.com/r.php");
	driver.navigate().to("https://www.facebook.com/r.php");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 org.openqa.selenium.WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	
	 Select a =new Select(year);
	 List<org.openqa.selenium.WebElement> option = a.getOptions();
	 
	System.out.println(option);
	int size = option.size();
	System.out.println(size);
	String b = year.getText();
	System.out.println(b);
	
	String title = driver.getTitle();
	System.out.println(title);
	 String exptitle = "Sign up for Facebook | FaceBOOK";
	if(title.equalsIgnoreCase(exptitle)) {
		System.out.println("navigate to correct page");
	}
	else {
		System.out.println("navigate to wrong page");
	}
	
	
	
}

}
