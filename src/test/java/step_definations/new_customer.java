package step_definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class new_customer {
	WebDriver driver_2;
	@Given("^After login with valid crendetials$")
	public void After_login_with_valid_crendetials() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr143413");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("zygUrag");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		this.driver_2=driver;
	    
	}

	@When("^I click on new customer$")
	public void I_click_on_new_customer() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver_2.findElement(By.xpath("/html/body/div[4]/div/ul/li[2]/a")).click();
		
	}

	@When("^I will fill the form and submit$")
	public void I_will_fill_the_form_and_submit() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver_2.findElement(By.xpath("//input[@name='name']")).sendKeys("abc");
		driver_2.findElement(By.xpath("//input[@name='dob']")).sendKeys("01012013");
		driver_2.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")).sendKeys("test");
		driver_2.findElement(By.xpath("//input[@name='city']")).sendKeys("test");
		driver_2.findElement(By.xpath("//input[@name='state']")).sendKeys("test");
		driver_2.findElement(By.xpath("//input[@name='pinno']")).sendKeys("123214");
		driver_2.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("123214");
		driver_2.findElement(By.xpath("//input[@name='emailid']")).sendKeys("test12@gmail.com");
		driver_2.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("^new customer should be created$")
	public void new_customer_should_be_created() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
}
