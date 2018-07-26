package Flight_Step_Def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_screen {
	WebDriver driver_1;
	@Given("^Open the login page$")	
	public void open_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		this.driver_1=driver;
		
	    
	}

	@When("^I enter the valid userid and password$")
	public void i_enter_the_valid_userid_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	    driver_1.findElement(By.name("userName")).sendKeys("suleman.shaik121@gmail.com");
	    driver_1.findElement(By.name("password")).sendKeys("Hyderabad");
	}

	@When("^submit$")
	public void submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver_1.findElement(By.name("login")).click();
	   
	}

	@Then("^user able to start the flight booking$")
	public void user_able_to_start_the_flight_booking() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}
