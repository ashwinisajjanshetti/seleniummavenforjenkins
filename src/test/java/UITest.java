import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class UITest {
	@Parameters("Browser")
	@Test
	public void startbrowser(String browserName)
	{
		System.out.println("parameter value is"+browserName);
		WebDriver driver=null;
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			 
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			 driver=new EdgeDriver();
		}
		
		driver.get("https://www.orangehrm.com/");
		Assert.assertTrue(driver.getTitle().contains("Orange"),"Title does not match");
		driver.close();
	}
}
