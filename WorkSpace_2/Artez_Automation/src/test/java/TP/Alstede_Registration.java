package TP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alstede_Registration {

public static String url= "https://alstede.dctinc.net/user-registration/";
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String exePath = "D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
			driver.get(url);
			Thread.sleep(5000);
			driver.findElement(By.name("fname")).sendKeys("First");
			driver.findElement(By.name("lname")).sendKeys("First");
			
			driver.findElement(By.name("your-email")).sendKeys("sandeep.vadarale@dctinc.com");
			driver.findElement(By.name("your-phone")).sendKeys("9119119911");
			driver.findElement(By.name("your-subject")).sendKeys("Test Subject");
			driver.findElement(By.name("your-message")).sendKeys("Description");
			driver.findElement(By.xpath("//*[@id=\"wpcf7-f2096-p407-o1\"]/form/div[7]/input")).click();
			//driver.close();
		
	
		
		
	}

}
