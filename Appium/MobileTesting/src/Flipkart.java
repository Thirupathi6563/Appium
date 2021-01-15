import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Flipkart {
	
	static AndroidDriver<AndroidElement> driver;

	
		
		public static void OpenFlipkart() throws Exception 
		{
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability("deviceName", "Redmi");
			cap.setCapability("udid", "6215b09b");
			cap.setCapability("noReset", "true");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "9 PKQ1.180904.001");
			 //cap.setCapability("app", app.getAbsolutePath());
			cap.setCapability("appPackage", "com.flipkart.android");
			cap.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
			
			URL url=new URL("http://127.0.0.1:4723/wd/hub");
			driver=new AndroidDriver<AndroidElement>(url,cap);
			System.out.println("application started..");
			Thread.sleep(3000);
			driver.findElementByClassName("android.widget.ImageButton").click();
			//driver.findElementByXPath("//*[@id=\"screenshotContainer\"]/div/div/div/div/div/div[63]").click();
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				OpenFlipkart();
			}
			catch(Exception exp) {
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				exp.printStackTrace();
				
			}
		}

	

}
