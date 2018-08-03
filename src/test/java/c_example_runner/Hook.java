package c_example_runner;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
@Before
public void run_before()
{
	System.out.println("Before Run");
}

@After
public void run_after()
{
	System.out.println("Before Run");
}
}
