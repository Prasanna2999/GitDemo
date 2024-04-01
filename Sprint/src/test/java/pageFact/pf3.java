package pageFact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pf3 {
	WebDriver driver;
	public pf3(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="loginPopup")
	WebElement login;
	@FindBy(xpath="//*[@id=\"fixedHeaderCT\"]/div/div/div[3]/div[2]/div/div[2]/div[2]/ul/li[1]/a/span/img")
	WebElement Members;
	@FindBy(xpath="//button[@title='Add New Profile']")
	WebElement add;
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement firstName;
	@FindBy(xpath="//input[@placeholder='Last name']")
	WebElement lastName;
	@FindBy(xpath="//input[@placeholder='dd/mm/yyyy']")
	WebElement DOB;
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/div[1]/div/div[2]/div[4]/div/div[2]/button")
	WebElement relation;
    @FindBy(xpath="//div[@aria-haspopup='listbox']")
    WebElement a1;
@FindBy(xpath="//*[@id=\\\"menu-\\\"]/div[3]/ul/li[3]")
WebElement a2;
@FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/div[2]/button[2]")
WebElement button; 
@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div/div[2]/button[2]")
WebElement button2;
@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div[3]/button")
WebElement ok;
public void login()
{
	login.click();
}
public void members() {
	Members.click();
}
public void Add() {
	add.click();
}
public void FirstName(String string) {
	firstName.sendKeys(string);
	
}
public void LastName(String string) {
	lastName.sendKeys(string);
}
public void dob(String string) {
	DOB.sendKeys(string);
}

public void Click1() {
relation.click();	
}
public void Click2() {
	a1.click();
}
public void Click3() {
	a2.click();
	
}
public void Click4() {
	button.click();
	
}
public void Click5() {
	button2.click();
	
}
public void OK() {
	ok.click();
}



}
