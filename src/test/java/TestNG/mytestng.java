package TestNG;

import org.testng.annotations.Test;

public class mytestng {
@Test(groups={"P1"})
public void before_run()
{
	System.out.println("Before code");
}
@Test(groups={"P1"})
public void main_run()
{
	System.out.println("Hello world");
}
@Test(groups={"P2"})
public void After_run()
{
	System.out.println("After code");
}

}
