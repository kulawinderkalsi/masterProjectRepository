package practicetest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class BrowserSetup {
	WebDriver driver;
	@Parameters({"browser"})
		@BeforeTest
		public void launchBrowserTest(String browser) {
			System.out.println("Running browser is " +browser);
			if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
				 driver= new ChromeDriver();
				}
				else if(browser.equalsIgnoreCase("firefox")) {
		         driver= new FirefoxDriver();
				}
				else {
					System.out.println("Plesae pass the corrrect browser"  +browser);
				
			}
			
		
		driver.get("https://www.google.com");
	}
	
	@Test
	public void currentUrl() {
		String URL = driver.getCurrentUrl();
		System.out.println("Current URL"+URL);
				
		}
	@Test
	public void pageTitle() {
		String Title = driver.getTitle();
		System.out.println("Pagr title"+Title);
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
