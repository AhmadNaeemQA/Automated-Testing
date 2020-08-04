import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingSiteTest {

	private WebDriver driver;

	private String item;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/ahmadnaeem/Documents/Work/QA Consulting/Automated-Testing/Automated-Testing/Shopping Site/src/test/resources/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void test() {
		driver.get("http://automationpractice.com/index.php");
		WebElement target;
		target = driver.findElement(By.id("search_query_top"));

		target.sendKeys("shoe");
		target.submit();
		assertEquals(
				"http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=shoe",
				driver.getCurrentUrl());
	}

}
