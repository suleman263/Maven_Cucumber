package step_definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinations {
	public WebDriver driver,driver_1;

	@Given("^Open the url$")
	public void open_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
		this.driver_1=driver;
	    
	}

	@When("^I Login$")
	public void i_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    
	}

	@When("^user enter valid id and pwd$")
	public void user_enter_valid_id_and_pwd() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver_1.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr143413");
		driver_1.findElement(By.xpath("//input[@name='password']")).sendKeys("zygUrag");
	   
	}

	@Then("^user should successfully login$")
	public void user_should_successfully_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver_1.findElement(By.xpath("//input[@type='submit']")).click();
		driver_1.quit();
	}

}
