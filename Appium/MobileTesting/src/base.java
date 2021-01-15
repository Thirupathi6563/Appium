import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
	
		AndroidDriver<AndroidElement>driver;
		//driver.get("http://google.com");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "6215b09b");
		capabilities.setCapability("platformName", "Android");
	    capabilities.setCapability("platformVersion", "9 PKQ1.180904.001");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		//capabilities.setCapability("appPackage", "com.android.chrome84.0.4147.89");
		//capabilities.setCapability("appActivity", "com.google.android.apps.chrome.IntentDispatcher");
		
		
		driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
return driver;
	}

}
