package test;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
	@Test
	
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://testnmms2023.azurewebsites.net/");
		driver.findElement(By.linkText("NMMS (2022-23)")).click();
		String parent = driver.getWindowHandle();
		driver.findElement(By.partialLinkText("शाळा लॉग इन")).click();
		driver.getWindowHandles();
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList arr = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) arr.get(1));
		
		driver.findElement(By.name("txtUDISE")).sendKeys("27230100515");
		driver.findElement(By.name("txtPassword")).sendKeys("7Vf6oo53");
		driver.findElement(By.name("btnSubmit")).click();
		
	}

}
