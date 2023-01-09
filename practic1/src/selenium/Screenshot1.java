package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot1 {

public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
     driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

for(int i=6;i>1;i--) {
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String random = RandomString.make(1);
File destination = new File("C:\\Users\\Admin\\Desktop\\Screenshot\\amazon3"+random+".jpeg");
   
FileHandler.copy(src, destination);


}


}

}
