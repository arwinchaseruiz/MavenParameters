package PageFactories;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;

public class composeEmailPageFactory {
WebDriver driver;
WebDriverWait wait;	
@FindBy(linkText = "Compose")
WebElement composeButton;

@FindBy(id = "message-to-field")
WebElement emailInput;

@FindBy(xpath = "//input[@data-test-id='compose-subject']")
WebElement subjectInput;

@FindBy(css = "#editor-container > div.rte.em_N.ir_0.iy_A.iz_h.N_6Fd5")
WebElement messageBody;

@FindBy(xpath = "//button[@title='Send this email']")
WebElement sendButton;

	public composeEmailPageFactory(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("arwinchaseruiz@yahoo.com"));
		Assert.assertTrue(driver.getTitle().contains("arwinchaseruiz@yahoo.com"));
	}
	
	public void clickComposeButton()
	{
		composeButton.click();
	}
	
	public void setEmail()
	{
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message-to-field")));
		emailInput.sendKeys("arwinchaseruiz@yahoo.com");
	}
	
	public void setSubject()
	{
		subjectInput.sendKeys("This is only a test");
	}
	
	public void setMessage()
	{
		messageBody.sendKeys("Hello this is a test");
	}
	
	public void sendMessage()
	{
		sendButton.click();
	}
	
	@After
	public void tearDown()
	{
		System.out.println(System.getProperty("param1").toString());
	}
}
