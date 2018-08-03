package c_example_stepdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class c_example_stepdef {
	@Before
	public void run_before()
	{
		System.out.println("Before Run");
	}
	@Given("^Open the url$")
	public void open_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Open the url");
	}

	@When("^I Login$")
	public void i_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I had login");
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String id, String pwd) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(id);
	    System.out.println(pwd);
	}

	@Then("^user should successfully login$")
	public void user_should_successfully_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@After
	public void run_after()
	{
		System.out.println("After Run");
	}
}
