package forwardapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class LoginScreen extends BaseClass {

	public static void main(String[] args)  {
		try{
			
			AndroidDriver<AndroidElement> driver =capabilities();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
       WebElement name=driver.findElement(By.xpath("//android.widget.EditText[@text='User Name']"));
       name.click();


		Actions performAct = new Actions(driver);
		performAct.sendKeys(name, "DO-TRUC-LEAS-FD1").build().perform();
		
		
		WebElement name2=driver.findElement(By.xpath("//android.widget.EditText[@text='Password']"));
        name2.click();
        
        
        Actions password = new Actions(driver);
        password.sendKeys(name2, "Testing@1").build().perform();
        
        
        driver.findElement(By.xpath("//android.widget.Button[@text='LOGIN']")).click();
        
        
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
       driver.findElement(By.xpath("//android.widget.ImageView[@text='This Week']")).click();
}
	   catch (Exception e){
		 e.printStackTrace();
		 
		 
		 
	 }
		

	}

}
