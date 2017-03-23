package TestSelenium.co.edu.eam.model;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCaseGmail {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Documentos\\Jefry\\EAM\\Semestre_8\\Ing_Software3\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://www.google.com.co/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testCaseGmail() throws Exception {
		driver.get(baseUrl + "/?gfe_rd=cr&ei=7lzTWM-HH8qGgQT6nprAAw");
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.linkText("Iniciar sesión")).click();
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("jjmb2789@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).clear();
		driver.findElement(By.id("Passwd")).sendKeys("LondonoAJJ0789_");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.cssSelector("span.gb_9a.gbii")).click();
		driver.findElement(By.id("gb_71")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
