package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformDownload {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver.get("https://www.leafground.com/file.xhtml");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//span[text()='Download']")).click();
	       driver.close();
	}

}
