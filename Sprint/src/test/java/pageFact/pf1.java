package pageFact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pf1 {
	WebDriver driver;
	public pf1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@title='Login/SignUp']")
	WebElement login;
	@FindBy(xpath="//input[@name='mobileNumber']")
	WebElement Num;
	@FindBy(xpath="//button[@color='primary']")
	WebElement cont;
	@FindBy(xpath="//input[@type='tel']")
	WebElement OTP;
	@FindBy(xpath="//button[@color='primary']")
	WebElement Verify;
	public void login()
	{
		login.click();
	}
	public void Phone(String string)
	{
		Num.sendKeys(string);
	}
	public void con()
	{
		cont.click();
	}
	public void enterOtp(String string) {
		OTP.sendKeys(string);
	}
	public void verify() {
		Verify.click();
	}
	
	
	

}
