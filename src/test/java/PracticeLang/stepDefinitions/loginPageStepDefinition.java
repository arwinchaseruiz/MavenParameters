package PracticeLang.stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import PageFactories.loginPageFactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginPageStepDefinition {

	static WebDriver driver;
	static Properties properties;
	static FileInputStream io;
	loginPageFactory login;
	static String browser;
	
	@Before
	public void setUp()
	{
		browser = System.getProperty("browser").toString();
		System.out.println("Gotta git git");
	}
		
	@Given("^User navigates to Yahoo Mail$")
	public void user_is_on_Gmail_Home_page() throws IOException
	{
		driver = utilities.driverFactory.initializeWebDriver(browser);
		properties = new Properties();
		io = new FileInputStream("C:\\Users\\EJ\\Desktop\\Eclipse\\Practice\\src\\test\\java\\utilities\\global.properties");
		properties.load(io);
		
		driver.get(properties.getProperty("baseURL"));
		driver.manage().window().maximize();
	}
	
	@When("^User tries to login$")
	public void user_tries_to_login() 
	{
	   login = new loginPageFactory(driver);
	   login.clickSignIn();
	}
	
	@When("^User inputs username (.*)$")
	public void user_inputs_username(String username) throws InterruptedException 
	{
		login.setUsername(username.trim());
	}

	@When("^User inputs password (.*)$")
	public void user_inputs_password(String password) 
	{
	    login.setPassWord(password.trim());
	}
}
