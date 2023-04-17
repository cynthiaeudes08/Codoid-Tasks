package Task;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserSwitch {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver.get("https://www.leafground.com/window.xhtml");
	       Thread.sleep(2000);
	       WebElement ele = driver.findElement(By.xpath("//span[text()='Open']"));
	       ele.click();
	       Set<String> windowHandles = driver.getWindowHandles();
	       for (String handle : windowHandles) {
	            driver.switchTo().window(handle);
	            if (!handle.equals(driver.getWindowHandle())) {
	                System.out.println("Switched to new window with title: " + driver.getTitle());
	                break;
	                
	            }
	        }
	       driver.close();
	       driver.switchTo().window(windowHandles.iterator().next());
           driver.quit();
           
           
           EdgeDriver driver1 = new EdgeDriver();
           driver1.manage().window().maximize();
	       driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver1.get("https://www.leafground.com/window.xhtml");
	       Thread.sleep(2000);
	       WebElement ele1 = driver1.findElement(By.xpath("//span[text()='Open']"));
	       ele1.click();
	       Set<String> windowHandles1 = driver1.getWindowHandles();
	       for (String handle1 : windowHandles1) {
	            driver1.switchTo().window(handle1);
	            if (!handle1.equals(driver1.getWindowHandle())) {
	                System.out.println("Switched to new window with title: " + driver1.getTitle());
	                break;
	                
	            }
	        }
	       driver1.close();
	       driver1.switchTo().window(windowHandles1.iterator().next());
           driver1.quit();
           
           
	       
	       
	       
		
	}

}
