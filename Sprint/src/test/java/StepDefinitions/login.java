package StepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import java.util.Scanner;

import org.openqa.selenium.By;
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

public class login {
	
	WebDriver driver;
	
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
	    // Write code here that turns the phrase above into concrete actions
		WebElement pro= driver.findElement(By.xpath("//div[@title='Login/SignUp']"));
		pro.click();
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement a=driver.findElement(By.xpath("//input[@name='mobileNumber']"));
	    
		a.sendKeys(string);
		
	   
	}

	@When("click continue")
	public void click_continue() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement con=driver.findElement(By.xpath("//button[@color='primary']"));
		con.click();
	}

	@When("enter otp")
	public void enter_otp() {
	    // Write code here that turns the phrase above into concrete actions
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("eto:");
		String otp=sc.next();
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(otp);
	}

	@When("click verify")
	public void click_verify() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@color='primary']")).click();
	}

	@Then("enter into the website")
	public void enter_into_the_website() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));}

	@Given("i click on profile")
	public void i_click_on_profile() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//div[@id='loginPopup']/span")).click();
	    
	}

	@When("i click on add aress")
	public void i_click_on_add_aress() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//a[@href='/address-book']")).click();
	}

	@When("Enter the details")
	public void enter_the_details() throws AWTException {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div/div/div[2]/button/span[1]")).click();
	   //ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("enable-geolocation");
		//driver= new ChromeDriver(opt);
//	   Robot robo=new Robot();
//	   
//       robo.keyPress(KeyEvent.VK_ESCAPE);
//		        robo.keyRelease(KeyEvent.VK_ESCAPE);
	   driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[2]/div[2]/div/button/span[2]")).click();
	   driver.findElement(By.tagName("input")).sendKeys("Hyderabad");
	   driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
	   driver.findElement(By.tagName("input")).sendKeys(Keys.ENTER);
	   
	   
	}


	@Then("save the address")
	public void save_the_address() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}}




	    
	

//	@Given("When i click on profile")
//	public void when_i_click_on_profile() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//span[@class='icon-ic_account']")).click();
//	}
//
//
//
//	@When("i click on manage family members")
//	public void i_click_on_manage_family_members() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//img[@alt='Right Arrow']")).click();
//	    
//	}
//
//	@When("i click add member")
//	public void i_click_add_member() {
//	    // Write code here that turns the phrase above into concrete actions
//driver.findElement(By.xpath("//button[@title='Add New Profile']")).click();
//	}
//
//	@When("enter details")
//	public void enter_details() {
//	    // Write code here that turns the phrase above into concrete actions
//	    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Prasanna");
//	    driver.findElement(By.xpath("//input[@placeholder='Last name']")).sendKeys("Revadi");
//	    driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']")).sendKeys("29/07/2001");
//	    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div/div[2]/div[4]/div/div[2]/button")).click();
////	    WebElement relation_Dropdown = driver.findElement(By.xpath("//div[@role='button']"));
////
////        Select skills_Dropdown_Select = new Select(relation_Dropdown);
////
////        WebElement selected_option = skills_Dropdown_Select.getFirstSelectedOption();
////        String select_option_as_string = selected_option.getText();
////
////        System.out.println("select_option_as_string pre selection:: " + select_option_as_string);
////
////        skills_Dropdown_Select.selectByVisibleText("Brother");
//	    driver.findElement(By.xpath("//div[@role='button']")).click();
//	    //
//	    driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click();
////	    
//	}
//
//	@Then("save the details")
//	public void save_the_details() {
//	    // Write code here that turns the phrase above into concrete actions
//	    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[2]/button[2]")).click();
//	    driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div/div[2]/button[2]")).click();
//	   // driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[3]/button/span")).click();
//	}
//
//
//
//
//}
