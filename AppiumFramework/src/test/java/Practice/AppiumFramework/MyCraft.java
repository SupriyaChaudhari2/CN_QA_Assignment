package Practice.AppiumFramework;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Practice.AppiumFramework.MyCraftBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HomePageDisplayed;
import pageObjects.LoginPage;


public class MyCraft extends MyCraftBase {
	
	 @Test(dataProvider="Credentials")
		
	 public void VerifyLogin(String Username,String Password) throws MalformedURLException
	 
	 {
		 
		 
		StartServer();
		AndroidDriver <AndroidElement>driver = Capabilities();
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		LoginPage L = new LoginPage(driver);
		HomePageDisplayed H = new HomePageDisplayed(driver);
		L.Login.click();
		L.Username.sendKeys(Username);
		L.Password.sendKeys(Password);
		L.SignInButton.click();
		H.HomePage.isDisplayed();
		
	
}
	 
	 @DataProvider(name="Credentials")
	 public Object[][] Credentials()
		{
			
			String[][] obj=new String[1][2];
					
				obj[0][0]= "qa-challenge@craftnote.de";
				obj[0][1]="Automation@2020";
				return obj;
						 
}
	 
	 
}
