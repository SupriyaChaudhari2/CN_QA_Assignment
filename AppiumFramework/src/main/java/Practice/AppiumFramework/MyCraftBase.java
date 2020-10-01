package Practice.AppiumFramework;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;
import org.testng.ITestContext;
import org.testng.ITestResult;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;




public class MyCraftBase {

	public static AppiumDriverLocalService Service;
	public static AndroidDriver<AndroidElement> driver;

	public static void StartServer()
		{
			
			Service = AppiumDriverLocalService.buildDefaultService();
			Service.start()	;
			//Service = AppiumDriverLocalService.buildDefaultService();
			//Service.start();
			
		}
		
public static AndroidDriver<AndroidElement>Capabilities() throws MalformedURLException{
		
			DesiredCapabilities cap = new DesiredCapabilities();
			
			//Pass the device information to the server.
			
			
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
			cap.setCapability("appPackage", "de.mycrafty.mycrafty");
			cap.setCapability("appActivity", "io.bitfactory.mycrafty.ui.splash.SplashActivity");
			cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
			AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			return driver;
			
		   
		}

	}
	
	

