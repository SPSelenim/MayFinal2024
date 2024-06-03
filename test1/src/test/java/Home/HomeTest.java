package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import POMHome.POMHomeScr;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeTest {

	public WebDriver driver = null;

	@BeforeSuite
	public void testSetup() {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void f() {

		System.out.println(" F R - START");
		try {
			POMHomeScr scr = new POMHomeScr(driver);
			scr.enterFirstName("xyz");
			Thread.sleep(1000);
			scr.enterLastName("pqr");
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
