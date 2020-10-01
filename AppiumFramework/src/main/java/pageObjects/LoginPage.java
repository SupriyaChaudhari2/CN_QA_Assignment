package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

	public  LoginPage(AppiumDriver driver)
	{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}
	
	@AndroidFindBy(id="de.mycrafty.mycrafty:id/btn_intro_login")
	public WebElement Login;
	
	
	@AndroidFindBy(id="de.mycrafty.mycrafty:id/et_login_email")
	public WebElement Username;
	
	@AndroidFindBy(id="de.mycrafty.mycrafty:id/et_login_password")
	public WebElement Password;
	
	@AndroidFindBy(id="de.mycrafty.mycrafty:id/btn_login_custom")
	public WebElement SignInButton;
}
