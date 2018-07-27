package Smoke_Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo_flight_book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32_v2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("suleman.shaik121@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Hyderabad");
		driver.findElement(By.name("login")).click();
		//Code for the drop down selection
		String pass="//select[@name='passCount']";
		Select Passenger = new Select(driver.findElement(By.xpath(pass)));
		Passenger.selectByVisibleText("1");
		Select From = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		From.selectByVisibleText("London");
		Select To = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		To.selectByVisibleText("Paris");
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("shaik");
		driver.findElement(By.name("passLast0")).sendKeys("suleman");
		driver.findElement(By.name("creditnumber")).sendKeys("9874563210");
		driver.findElement(By.name("buyFlights")).click();
		
		
	}

}
