

package TP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alstede_Recipe_Review {

	public static String url= "https://alstede.dctinc.net/farmstore/cider-gallon/";
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String exePath = "D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		Thread.sleep(5000);
		driver.findElement(By.id("tab-title-reviews")).click();
		driver.findElement(By.id("star-3")).click();
		//driver.findElement(By.className("cke_wysiwyg_frame cke_reset")).sendKeys("Nice Product");
		driver.findElement(By.id("author")).sendKeys("Jitendra");
		driver.findElement(By.id("email")).sendKeys("testinguser1432@gmail.com");
		driver.findElement(By.id("submit")).click();
		
		//for(int i=0; i<=100; i++) {

			//driver.close();
		//}
	
		
		
	}
}
