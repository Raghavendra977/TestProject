package Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick
{
	@Test
	public void Login() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rn90\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//span[text()='SUBMIT']"));
		action.contextClick(ele).build().perform();
		Thread.sleep(3000);
		
		
		

		
		
	}
}
