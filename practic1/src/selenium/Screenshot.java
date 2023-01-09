package selenium;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
	
		driver.manage().window().maximize();
		 
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File destination = new File("C:\\Users\\Admin\\Desktop\\Screenshot\\facebook.jpeg");
	  FileHandler.copy(src, destination);
	  
	  driver.close();
	
	}



}
