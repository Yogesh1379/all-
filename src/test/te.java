package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class te {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        String baseUrl = "http://demo.guru99.com/test/upload/";
        WebDriver driver=new ChromeDriver();

        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        Thread.sleep(2000);
        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\\\Users\\\\User\\\\Downloads\\\\TET210002610Photofinal (2).jpg");
        Thread.sleep(2000);
        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();
        Thread.sleep(2000);
        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        }
}
