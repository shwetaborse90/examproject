package search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailAccCreation{
	
	public static void main(String args[])
	{
		  WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://accounts.google.com/signup");

		
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/input")).sendKeys("shweta");
			driver.findElement(By.id("lastName")).sendKeys("borse");
			driver.findElement(By.name("Passwd")).sendKeys("shweta@123");
			driver.findElement(By.id("username")).sendKeys("shweta.1borse");
			
			driver.findElement(By.name("ConfirmPasswd")).sendKeys("shweta@123");
			driver.findElement(By.id("accountDetailsNext")).click();
      		
			driver.findElement(By.id("phoneNumberId")).sendKeys("9284096269");
		
			driver.findElement(By.className("FliLIb DL0QTb")).click();

	}

}
