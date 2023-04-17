package Task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindWebElements {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver.get("https://www.leafground.com/list.xhtml");
	       Thread.sleep(2000);
	       List<WebElement> ele = driver.findElements(By.xpath("//div[text()='From']"));
	       for (WebElement webEle : ele) {
	    	   System.out.println(webEle.getText()); 
	       }
          
	}
}
	
