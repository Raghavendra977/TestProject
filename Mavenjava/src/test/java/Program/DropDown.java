package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDown 
{
	@Test
	public void Login() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rn90\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
//		Thread.sleep(3000);
		
		
		WebElement ele=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction"));
		ele.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' Bengaluru (BLR)']")).click();
		
		driver.findElement(By.xpath("(//a[text()=' Ahmedabad (AMD)'] ) [1]")).click();
		driver.quit();
		
		
		
		
		
		
	}
}
