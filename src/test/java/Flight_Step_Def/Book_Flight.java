package Flight_Step_Def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Book_Flight {
	WebDriver driver_1;
	@Given("^Login into the application with valid credentials$")
	public void login_into_the_application_with_valid_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("suleman.shaik121@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Hyderabad");
		driver.findElement(By.name("login")).click();
		this.driver_1=driver;
	}

	@When("^I fill the form with valid details-From,To,Payment$")
	public void i_fill_the_form_with_valid_details_From_To_Payment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String pass="//select[@name='passCount']";
		Select Passenger = new Select(driver_1.findElement(By.xpath(pass)));
		Passenger.selectByVisibleText("1");
		Select From = new Select(driver_1.findElement(By.xpath("//select[@name='fromPort']")));
		From.selectByVisibleText("London");
		Select To = new Select(driver_1.findElement(By.xpath("//select[@name='toPort']")));
		To.selectByVisibleText("Paris");
		driver_1.findElement(By.name("findFlights")).click();
		driver_1.findElement(By.name("reserveFlights")).click();
		driver_1.findElement(By.name("passFirst0")).sendKeys("shaik");
		driver_1.findElement(By.name("passLast0")).sendKeys("suleman");
		driver_1.findElement(By.name("creditnumber")).sendKeys("9874563210");
		
	}

	@When("^Submit$")
	public void submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver_1.findElement(By.name("buyFlights")).click();
	}

	@Then("^I book the ticket$")
	public void i_book_the_ticket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver_1.quit();
	}
}
