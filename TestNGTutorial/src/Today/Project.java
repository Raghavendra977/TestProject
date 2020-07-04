package Today;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Project 
{
	
	@BeforeClass
	public void First()
	{
		
		System.out.println("First page");
	}
	@AfterClass
	public void Second()
	{
		
		System.out.println("Second page");
	}
	@Test
	public void Third()
	{
		
		System.out.println("Third page");
	}
	@Test
	public void Fourth()
	{
		
		System.out.println("Fourth page");
	}
	
}
