package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstproject {
	 
	public static void main(String[] args) {
		
		 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://demoqa.com/alerts"); // to open url
		
		
	WebElement button	= driver.findElement(By.id("promtButton"));
		button.click();
	Alert alert =	driver.switchTo().alert();
	
String text =	alert.getText();

System.out.println(text);
	
	alert.sendKeys("Test alert");
	
	alert.accept();
		
	}
	}
//"C:\selenium-drivers\chromedriver-win64\chromedriver.exe"