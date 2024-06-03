package POMHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMHomeScr {

	//Added comment
	//Changed comments - 06-03
	public WebDriver driver = null;
	public String First = "fname";
	public String Last = "lname";

	public POMHomeScr(WebDriver driver) {
		this.driver = driver;
	}

	
	public WebElement getFirstName() {
		WebElement FN = null;
		try {
			FN = driver.findElement(By.id(First));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return FN;
	}

	public void enterFirstName(String FName) {
		getFirstName().sendKeys(FName);

	}
	
	public WebElement getLastName() {
		WebElement FN = null;
		try {
			FN = driver.findElement(By.id(Last));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return FN;
	}

	public void enterLastName(String LName) {
		getLastName().sendKeys(LName);

	}

}
