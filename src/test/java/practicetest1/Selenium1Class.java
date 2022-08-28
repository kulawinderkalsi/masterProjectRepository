package practicetest1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium1Class {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cno.org/en/maintain-your-membership1/");
		driver.findElement(By.xpath("//a[@title='Login to my account']")).click();
		Set <String> window =  driver.getWindowHandles();
		Iterator <String> it = window.iterator();
		String parentwindowID= it.next();
		System.out.println("parentwindowID"+parentwindowID);
		String childwindowID = it.next();
		System.out.println("childwindowID"+childwindowID);
		driver.switchTo().window(childwindowID);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("testnursecodechallenge@cnomail.org");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("KKC0d3ch@llenge");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.quit();
		
		

			
		
		
		
		
		
		
		
		
		
	}

}
