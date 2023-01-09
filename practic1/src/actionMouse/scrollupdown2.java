package actionMouse;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupdown2 {

public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
     
    driver.manage().window().maximize();
    driver.get("https://www.album.alexflueras.ro/index.php");
    Thread.sleep(2000);
    
    JavascriptExecutor js=(JavascriptExecutor)driver;

    js.executeScript("window.scrollBy(0,2000)");
    Thread.sleep(2000);
    
    js.executeScript("window.scrollBy(0,-2000)");//scroll up
    Thread.sleep(2000);
    
    js.executeScript("window.scrollBy(4000,0)");//scroll right
    Thread.sleep(2000);
    
    js.executeScript("window.scrollBy(-2000,0)");
}


}
