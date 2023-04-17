package Task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot {


	public static void main(String[] args) {
        
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver.get("https://www.nykaa.com/");
	       File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	       try {
	            // Save the screenshot to a file
	            FileUtils.copyFile(screenshot, new File("path/to/screenshot.png"));
	            System.out.println("Screenshot saved successfully.");
	        } catch (IOException e) {
	            System.out.println("Failed to save screenshot: " + e.getMessage());
	        }
	       driver.quit();
	}
}
	       


