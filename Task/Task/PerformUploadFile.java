package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformUploadFile {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver.get("https://www.leafground.com/file.xhtml");
	       Thread.sleep(2000);
	       WebElement fileInput = driver.findElement(By.xpath("//span[text()='Choose']"));
	        fileInput.sendKeys("path/to/file");
	        Thread.sleep(2000);
	        WebElement submit = driver.findElement(By.xpath("//input[@value='Upload']"));
	        submit.click();
	        driver.quit();
	}

}
