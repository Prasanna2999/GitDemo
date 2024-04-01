package pageFact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pf2 {
	WebDriver driver;
	public pf2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@title='Login/SignUp']")
WebElement login;
	@FindBy(xpath="//*[@class='Profile_logOut__GIvqv']")
	WebElement logout;
	public void clickLogin() {
		login.click();
	}
	public void clickLogout() {
		logout.click();
		
	}

}
