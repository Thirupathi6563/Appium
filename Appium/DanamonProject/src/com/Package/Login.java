package com.Package;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Login {
	static AndroidDriver<AndroidElement> driver;
@BeforeTest
	public static void loginFunctionality() throws Exception 
	{
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi");
		cap.setCapability("udid", "6215b09b");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9 PKQ1.180904.001");
		cap.setCapability("appPackage", "com.danamon.uatomnimicroapps");
		cap.setCapability("appActivity", "com.danamon.uatomnimicroapps.MainActivity");
		cap.setCapability("noReset", true);
		cap.setCapability("fullReset",false);
		
		
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		
		driver=new AndroidDriver<AndroidElement>(url,cap);
		System.out.println("application started..");
		//Thread.sleep(50000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*
		 MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View[2]");
		 
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.EditText");
		el2.sendKeys("perfomni1");
		
		MobileElement el3=(MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.EditText");
		

	el3.sendKeys("Reskin01");
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.Button[1]").click();
		Thread.sleep(220000);
		

		//MobileElement el4=(MobileElement)driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.EditText");
		

		//el4.sendKeys("Reskin01");
		 
		 */
		
		MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText");
		el5.sendKeys("Reskin01");

		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.Button").click();
	
				}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				loginFunctionality();
			}
			catch(Exception exp) {
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				exp.printStackTrace();
				
			}

	}

}
