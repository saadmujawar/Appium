package saad;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MisceallanousAppiumActions extends BaseTest{
	
	
	@Test
	public void Misceallanous() throws MalformedURLException
	{
		//App Package & App Activity
		
		//Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.view.DragAndDropDemo");
		
		//Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.view.DragAndDropDemo");
		// Start the activity
		//driver.startActivity(activity);
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		DeviceRotation landscape = new DeviceRotation(0, 0, 90);
		driver.rotate(landscape);
		
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals("WiFi settings", alertTitle);
		//copy paste
		//copy to clipboard - 
		driver.setClipboardText("Saad Wifi");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	  //driver.findElement(By.className("android.widget.Button")).get(1).click(); use AppiumBy for className
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
	}

}
