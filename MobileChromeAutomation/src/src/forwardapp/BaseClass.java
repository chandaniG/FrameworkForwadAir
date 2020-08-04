package forwardapp;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	static WebDriver driver;

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		
		//try{
			File fis = new File("src");
			File fs = new File(fis, "app-release.apk");
			
			
			DesiredCapabilities cap =new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung SM-G570F");
			cap.setCapability(MobileCapabilityType.UDID,"420034a7ca0fc3cb");
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");

			cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
			AndroidDriver<AndroidElement> driver = new AndroidDriver<>( new URL("http://127.0.0.1:4723/wd/hub"), cap);
					
				
//	      Increase server end timing		
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			//appium --default-capabilities '{"newCommandTimeout": 3000}';
			
			capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3000);
			
			
			driver.switchTo().alert().accept();
			return driver;
			

		 
		 }

}
