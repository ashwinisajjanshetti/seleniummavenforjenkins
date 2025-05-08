import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class UITest {

	@Test
	public void startbrowser()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		Assert.assertTrue(driver.getTitle().contains("Orange"),"Title does not match");
		driver.close();
	}
}
