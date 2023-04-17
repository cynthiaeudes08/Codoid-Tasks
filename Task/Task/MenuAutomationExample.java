package Task;
    import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class MenuAutomationExample {
	    public static void main(String[] args) {
	            ChromeDriver driver = new ChromeDriver();
	 	        driver.manage().window().maximize();
	 	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 	        driver.get("https://www.leafground.com/menu.xhtml");
                WebElement menu = driver.findElement(By.id("btnClick"));
	            menu.click();
	            WebElement subMenu = driver.findElement(By.xpath("//a[text()='Go to Home Page']"));
	            subMenu.click();
                WebElement link = driver.findElement(By.xpath("//h5[text()='TestLeaf Tutorials']"));
	            link.click();
                WebElement element = driver.findElement(By.xpath("//a[text()='Selenium']"));
	            element.click();
                driver.quit();
	    }
	}



