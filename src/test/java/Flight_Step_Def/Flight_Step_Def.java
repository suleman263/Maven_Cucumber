package Flight_Step_Def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flight_Step_Def {
	WebDriver driver_1;
	@Given("^Open the url$")
	public void open_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		this.driver_1=driver;
		
	}

	@When("^I will click on  signon$")
	public void i_will_click_on_signon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  driver_1.findElement(By.name("login")).click();
		   driver_1.findElement(By.xpath("//a[@href='mercuryregister.php']")).click();
	    
	}

	@When("^fill the form and submit$")
	public void fill_the_form_and_submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver_1.findElement(By.name("firstName")).sendKeys("shaik");
	     driver_1.findElement(By.name("lastName")).sendKeys("shaik");
	     driver_1.findElement(By.name("phone")).sendKeys("859865125");
	     driver_1.findElement(By.name("userName")).sendKeys("shaik@gmail.com");
	     driver_1.findElement(By.name("address1")).sendKeys("test");
	     driver_1.findElement(By.name("address2")).sendKeys("test");
	     driver_1.findElement(By.name("city")).sendKeys("Hyderabad");
	     driver_1.findElement(By.name("state")).sendKeys("AP");
	     driver_1.findElement(By.name("postalCode")).sendKeys("500033");
	    Select s=new Select(driver_1.findElement(By.name("country")));
	    s.selectByValue("42");
	    driver_1.findElement(By.name("email")).sendKeys("suleman.shaik121@gmail.com");
	    driver_1.findElement(By.name("password")).sendKeys("Hyderabad");
	    driver_1.findElement(By.name("confirmPassword")).sendKeys("Hyderabad");
	    driver_1.findElement(By.name("register")).click();
	}

	@Then("^new user is created$")
	public void new_user_is_created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver_1.quit();
	}
	
}
