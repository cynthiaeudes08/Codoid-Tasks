package Task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

		public class Alerts {
		    public static void main(String[] args) {
		        ChromeDriver driver = new ChromeDriver();
		        driver.get("https://www.leafground.com/pages/Alert.html");
		        driver.manage().window().maximize();
                driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
                Alert alert = driver.switchTo().alert();
		        System.out.println(alert.getText());
		        alert.accept();
                driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
                Alert confirmBox = driver.switchTo().alert();
		        System.out.println(confirmBox.getText());
		        confirmBox.accept();
		        System.out.println(driver.findElement(By.id("result")).getText());
                driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
                Alert confirmBoxNegative = driver.switchTo().alert();
		        System.out.println(confirmBoxNegative.getText());
		        confirmBoxNegative.dismiss();
		        System.out.println(driver.findElement(By.id("result")).getText());
		        driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();

		        
		        Alert promptBox = driver.switchTo().alert();
		        System.out.println(promptBox.getText());
		        promptBox.sendKeys("Selenium");
		        promptBox.accept();
		        System.out.println(driver.findElement(By.id("result1")).getText());

		        
		        driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();

		  
		        Alert promptBoxNegative = driver.switchTo().alert();
		        System.out.println(promptBoxNegative.getText());
		        promptBoxNegative.dismiss();
		        System.out.println(driver.findElement(By.id("result1")).getText());

		        
		        driver.quit();
		    }
		}
		

	


