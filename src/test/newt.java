package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class newt {				
		  public static void main(String[] args) throws InterruptedException {									
		    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://demoqa.com/browser-windows");

		    // Opening all the child window
		    driver.findElement(By.id("windowButton")).click();
		    driver.findElement(By.id("messageWindowButton")).click();
}
	}