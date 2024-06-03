package Search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import POMHome.POMHomeScr;
import POMSearch.POMSearchScr;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SearchTest {

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
		System.out.println(" SEARCH - START");
		try {
			POMSearchScr scr1 = new POMSearchScr(driver);
	scr1.clickDevelopment();
	scr1.clickQA();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	
	}


	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
