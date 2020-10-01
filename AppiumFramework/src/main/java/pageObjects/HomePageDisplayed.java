package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePageDisplayed {


	public  HomePageDisplayed(AppiumDriver driver)
	{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='PROJECTS']")
	public WebElement HomePage;
	
}
