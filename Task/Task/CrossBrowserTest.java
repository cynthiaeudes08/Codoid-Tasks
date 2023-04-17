package Task;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowserTest {
    public static void main(String[] args) {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver chromeDriver = new ChromeDriver(chromeOptions);
        testBrowser(chromeDriver);
        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriver edgeDriver = new EdgeDriver(edgeOptions);
        testBrowser(edgeDriver);
    }

    public static void testBrowser(WebDriver driver) {
        driver.get("https://www.leafground.com/");
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("email")).sendKeys("test@example.com");
        driver.quit();
    }
}


	


