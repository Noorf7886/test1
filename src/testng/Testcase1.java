package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 
{
	public WebDriver driver;
	@BeforeTest
		public void openApp()
		{
		 driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	@Test
	public void tc1()
	{
		driver.findElement(By.id("email")).sendKeys("9380340177");
		driver.findElement(By.id("pass")).sendKeys("Nufa*1202");
		driver.findElement(By.name("login")).click();
		Reporter.log(driver.getTitle(),true);
		Reporter.log(driver.getCurrentUrl(),true);
	}
	@AfterMethod
	public void CloseApp()
	{
		driver.close();
	}
	}


