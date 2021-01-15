package com.Package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class TransactionHistory extends Login {
	
	@Test
	public void transactionHistory()
	{
	
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Image").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	                                                  
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View").click();
		//s.selectByVisibleText("");
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[4]/android.view.View/android.view.View/android.app.Dialog/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[16]").click();
		                           
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View[2]/android.view.View[5]/android.view.View/android.widget.EditText").click();
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View").click();
		
		//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View/android.widget.GridView/android.view.View[6]/android.view.View[4]/android.view.View").click();
		List<AndroidElement>date=driver.findElementsByXPath("android.view.View");
		AndroidElement num=date.get(0);
		System.out.println(num);
		
	}
	

}
