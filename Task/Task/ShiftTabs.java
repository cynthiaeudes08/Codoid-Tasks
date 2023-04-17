package Task;
    import java.time.Duration;
import java.util.Set;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class ShiftTabs {
	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.leafground.com/window.xhtml");
	Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Open']")).click();
    Set<String> windowHandles = driver.getWindowHandles();
    for(String handle: windowHandles) {
	driver.switchTo().window(handle);
	}
    System.out.println(driver.getTitle());
    for(String handle: windowHandles) {
	    driver.switchTo().window(handle);
	    if(driver.getTitle().equals("Dashboard")) {
	        break;
	    }
    }
    driver.close();
	}
	}
	    
	



