import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSiteTest {

	private WebDriver driver;
	private WebElement target;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/ahmadnaeem/Documents/Work/QA Consulting/Automated-Testing/Automated-Testing/src/test/resources/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void test() {
		driver.get("http://thedemosite.co.uk/");
		target = driver.findElement(
				By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
		target.click();
		target = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		target.sendKeys("username");
		target = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		target.sendKeys("root");
		target.submit();
		target = driver
				.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[2]/small/a"));
		target.click();
		target = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		target.sendKeys("username");
		target = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		target.sendKeys("root");
		target.submit();

		target = driver
				.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		assertEquals("**Successful Login**", target.getText());
	}

	@After
	public void close() {
		driver.close();
	}

}
