package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {
	public static void main(String[] args) {
        
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.get("https://www.leafground.com/select.html");
       WebElement multiSelect = driver.findElement(By.xpath("//select[@multiple='']"));
       Select select = new Select(multiSelect);
        select.selectByValue("2");
        select.selectByVisibleText("Appium");
        select.selectByIndex(4);
        driver.quit();

}}
