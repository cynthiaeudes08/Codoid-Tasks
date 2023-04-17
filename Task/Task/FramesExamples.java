package Task;
    import java.time.Duration;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class FramesExamples {
	    public static void main(String[] args) {
	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node01xv24del7fh8z3drkjvgrgvpn211003.node0");
            driver.switchTo().frame("frame1");
            WebElement button = driver.findElement(By.id("Click"));
	        button.click();
            driver.switchTo().defaultContent();
            driver.switchTo().frame("frame2");
            driver.switchTo().frame("frame3");
            WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
	        textbox.sendKeys("testuser");
            driver.switchTo().parentFrame();
            driver.switchTo().defaultContent();
            driver.quit();
	    }
	    }
	



