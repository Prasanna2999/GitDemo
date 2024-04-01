package StepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFact.pf1;
import pageFact.pf2;
import pageFact.pf3;

public class login {
	
	WebDriver driver;
	Scanner sc= new Scanner(System.in);
	
	@Test
	
	@Given("I want to login the website")
	public void i_want_to_login_the_website() {
	    // Write code here that turns the phrase above into concrete actions
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("enable-geolocation");
	    driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.apollo247.com");
		//driver.manage().window().maximize();
		

	}

	@When("I enter number as {string}")
	public void i_enter_number_as(String string) {
		pf1 s1=new pf1(driver);
		s1.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		s1.Phone(string);
		
	    
		
	   
	}

	@When("click continue")
	public void click_continue() {
	    // Write code here that turns the phrase above into concrete actions
		pf1 s2=new pf1(driver);
		s2.con();
	}

	@When("enter otp")
	public void enter_otp() {
		pf1 s3=new pf1(driver);
		System.out.println("eto:");
		String otp=sc.next();
		s3.enterOtp(otp);
	}

	@When("click verify")
	public void click_verify() {
		pf1 s4=new pf1(driver);
	   
		s4.verify();
	}

	@Then("enter into the website")
	public void enter_into_the_website() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));}
//	@Given("click on the profile")
//	public void click_on_the_profile() {
//	    
//		pf2 t1=new pf2(driver);
//		t1.clickLogin();
//	}
//
//	@When("i click on logout")
//	public void i_click_on_logout() {
//	 pf2 t2=new pf2(driver);
//	 t2.clickLogout();
//	}
//
//	@Then("logging out")
//	public void logging_out() {
//	    
//	    System.out.println("logged out");
//	   // driver.close();
//	    
//	}   
	

	@Given("When i click on profile")
	public void when_i_click_on_profile() {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.xpath("//span[@class='icon-ic_account']")).click();
		pf3 q=new pf3(driver);
		q.login();
	}



	@When("i click on manage family members")
	public void i_click_on_manage_family_members() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div/div[3]/div[2]/div/div[2]/div[2]/ul/li[1]/a/span/img")).click();
		pf3 r=new pf3(driver);
		r.members();
	    
	}

	@When("i click add member")
	public void i_click_add_member() {
	    // Write code here that turns the phrase above into concrete actions
//driver.findElement(By.xpath("//button[@title='Add New Profile']")).click();
		pf3 r1=new pf3(driver);
		r1.Add();
		
	}

	@When("enter details")
	public void enter_details() {
	    // Write code here that turns the phrase above into concrete actions
//	    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Prasanna");
//	    driver.findElement(By.xpath("//input[@placeholder='Last name']")).sendKeys("Revadi");
//	    driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']")).sendKeys("29/07/2001");
//	    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div/div[2]/div[4]/div/div[2]/button")).click();
//	    
		pf3 r2=new pf3(driver);
		r2.FirstName("Prasanna");
		r2.LastName("Revadi");
		r2.dob("29/04/2001");
		r2.Click1();
		r2.Click2();
		r2.Click3();
	    //driver.findElement(By.xpath("//div[@aria-haspopup='listbox']")).click();
	    //
	    //driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]")).click();
	    ////*[@id=\"menu-\"]/div[3]/ul/li[1]
//	    
	}

	@Then("save the details")
	public void save_the_details() {
		pf3 r3=new pf3(driver);
		r3.Click4();
		r3.Click5();
		r3.OK();
	    
//	    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[2]/button[2]")).click();
//	    driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div/div[2]/button[2]")).click();
//	   // driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[3]/button/span")).click();
//	   driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[3]/button")).click();
	}

//	@Given("i click on profile")
//	public void i_click_on_profile() {
//	    // Write code here that turns the phrase above into concrete actions
//		
//		driver.findElement(By.xpath("//div[@id='loginPopup']/span")).click();
//	    
//	}
//
//	@When("i click on add aress")
//	public void i_click_on_add_aress() {
//	    // Write code here that turns the phrase above into concrete actions
//	    driver.findElement(By.xpath("//a[@href='/address-book']")).click();
//	}
//
//	@When("Enter the details")
//	public void enter_the_details() throws AWTException {
//	    // Write code here that turns the phrase above into concrete actions
//	   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div/div/div[2]/button/span[1]")).click();
//	   //ChromeOptions opt = new ChromeOptions();
//		//opt.addArguments("enable-geolocation");
//		//driver= new ChromeDriver(opt);
////	   Robot robo=new Robot();
////	   
////       robo.keyPress(KeyEvent.VK_ESCAPE);
////		        robo.keyRelease(KeyEvent.VK_ESCAPE);
//	   driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[2]/div[2]/div/button/span[2]")).click();
//	   driver.findElement(By.tagName("input")).sendKeys("Hyderabad");
//	   driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
//	   driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
//	   
//	   
//	}
//
//
//	@Then("save the address")
//	public void save_the_address() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//
//
//
//
//	
////	@Given("clicking on the profile")
////	public void clicking_on_the_profile() {
////	    // Write code here that turns the phrase above into concrete actions
////	    //throw new io.cucumber.java.PendingException();
////		 driver.findElement(By.xpath("//div[@title='Login/SignUp']")).click();
////		
////	}
////	@When("i clicked on logout")
////	public void i_clicked_on_logout() {
////	    
////		driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div/div[3]/div[2]/div/div[2]/div[2]/ul/li[9]/a")).click();
////	}
////
////	@When("logging out of the website")
////	public void logging_out_of_the_website() {
////		System.out.println();
////	    
////	}
////
////	@When("I enter phonenumber as {string}")
////	public void i_enter_phonenumber_as(String string) {
////	    // Write code here that turns the phrase above into concrete actions
////	    //throw new io.cucumber.java.PendingException();
////		
////		//Thread.sleep(3000);
////		driver.findElement(By.xpath("//div[@title='Login/SignUp']")).click();
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
////		WebElement a=driver.findElement(By.xpath("//input[@name='mobileNumber']"));
////	    
////		a.sendKeys(string);
////	}
////
////	@When("click continue button")
////	public void click_continue_button() {
////	    // Write code here that turns the phrase above into concrete actions
////	    //throw new io.cucumber.java.PendingException();
////		driver.findElement(By.xpath("//button[@color='primary']")).click();
////	}
////
////	@When("enter  wrong otp")
////	public void enter_wrong_otp() {
////	    // Write code here that turns the phrase above into concrete actions
////	    //throw new io.cucumber.java.PendingException();
////		Scanner sc= new Scanner(System.in);
////		System.out.println("eto:");
////		String otp=sc.next();
////		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(otp);
////	}
////
////	@When("click verify button")
////	public void click_verify_button() {
////	    // Write code here that turns the phrase above into concrete actions
////	    //throw new io.cucumber.java.PendingException();
////		driver.findElement(By.xpath("//button[@color='primary']")).click();
////	}
////
////	@Then("print the message")
////	public void print_the_message() {
////	    // Write code here that turns the phrase above into concrete actions
////	    //throw new io.cucumber.java.PendingException();
////		System.out.println();
////	}
////
//
//
//	
}
