package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.udemy.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String exptitle = "Online Courses - Learn Anything, On Your Schedule | Udemy";
	
	if(title.equalsIgnoreCase(exptitle)) {
		System.out.println("navigate to correct page");
	}
	else {
		System.out.println("navigate to wrong page");
	}
}


}
