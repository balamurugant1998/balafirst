import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testng1 {

	@Test
	public void amazonmethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.close();
	}
	
	
	
	
	
}
