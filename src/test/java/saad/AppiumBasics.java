package saad;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import junit.framework.Assert;

public class AppiumBasics extends BaseTest{
	
	
	@Test
	public void WifiSettingsName() throws MalformedURLException
	{
		//AndroidDriver , IOSDriver
				//Appium code -> Appium Server -> Mobile
		
		//Actual automation
				//xpath, id ,accessibilityId, classname, andriodUIAutomator
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals("WiFi settings", alertTitle);
		driver.findElement(By.id("android:id/edit")).sendKeys("Saad Wifi");
	  //driver.findElement(By.className("android.widget.Button")).get(1).click(); use AppiumBy for className
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
	}

}
