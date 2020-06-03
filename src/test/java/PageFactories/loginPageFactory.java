package PageFactories;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPageFactory
{

WebDriver driver;

@FindBy(linkText = "Sign in")
WebElement signInButton;
	
@FindBy(id = "login-username")
WebElement userName;

@FindBy(id = "login-passwd")
WebElement passWord;

@FindBy(className =  "orko-button-primary orko-button challenge-button")
WebElement nextButton;

WebDriverWait wait;

	public loginPageFactory(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void clickSignIn()
	{
		signInButton.click();
	}
	
	public void setUsername(String username) throws InterruptedException
	{
		wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username")));
		userName.sendKeys(username);
		userName.sendKeys(Keys.ENTER);
	}
	
	public void setPassWord(String password)
	{
		wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-passwd")));
		passWord.sendKeys(password);
		passWord.sendKeys(Keys.ENTER);
	}
	
}
