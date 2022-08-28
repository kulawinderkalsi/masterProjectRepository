package practicetest1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PTest {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/index.php?route=account/account");

	}
	@Test
	public void titleTest() {
		String Title = driver.getTitle();
		System.out.println("Page Title is "+ Title);
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
		
	}


