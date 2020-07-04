package Today;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstProject 
{
	WebDriver driver;
	String baseurl="https://www.google.com/";
	@Parameters({"browser"})
	@BeforeTest
	public void Login(String browser)
	{
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rnagalli\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			
			driver=new FirefoxDriver();
		}
	
	}
	
	@Test
	public void Page()
	{
		driver.get(baseurl);
		
	}
	
}
