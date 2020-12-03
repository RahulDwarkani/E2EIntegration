package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {
	
	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "D://EclipseSelenium//ESelenium//PracticeSelenium//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElementByName("q").sendKeys("Syllabus");
		driver.quit();
	}
}
