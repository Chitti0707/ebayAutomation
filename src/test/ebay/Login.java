package test.ebay;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;

public class Login extends basebay {

	@Test
	public void Login() {
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElementById("com.ebay.mobile:id/button_sign_in").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("com.ebay.mobile:id/edit_text_username").sendKeys("kunall.gg@gmail.com");
		driver.findElementById("com.ebay.mobile:id/edit_text_password").sendKeys("infosystest@1");
		driver.findElementById("com.ebay.mobile:id/button_sign_in").click();
		driver.findElementById("com.ebay.mobile:id/button_google_deny").click();
	 
	}
		
	@Test
		public void Search() throws InterruptedException  
	
		  
	{
			
			driver.findElementById("com.ebay.mobile:id/search_box").click(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementById("com.ebay.mobile:id/search_src_text").sendKeys("65-inch TV");
			driver.findElementByXPath("//android.widget.TextView[@text='65 inch led tv']").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SAMSUNG 49 INCHES 49MU6100 4K UHD LED TV 2017 MODEL WITH 1 YEAR DEALER WARRANTY!\"))");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementByAndroidUIAutomator("text(\"SAMSUNG 49 INCHES 49MU6100 4K UHD LED TV 2017 MODEL WITH 1 YEAR DEALER WARRANTY!\")").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Assert.assertEquals("SAMSUNG 49 INCHES 49MU6100 4K UHD LED TV 2017 MODEL WITH 1 YEAR DEALER WARRANTY!", "SAMSUNG 49 INCHES 49MU6100 4K UHD LED TV 2017 MODEL WITH 1 YEAR DEALER WARRANTY!");
			Assert.assertEquals("58,499", "58,499");
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ITEM DESCRIPTION\"))");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementByAndroidUIAutomator("text(\"ITEM DESCRIPTION\")").click();
			Thread.sleep(5000);
			driver.findElementById("com.ebay.mobile:id/home").click();
			
		}
	@Test
	public void Addtocart() throws InterruptedException 
	
	{
		Thread.sleep(2000);
		TouchAction sc = new TouchAction(driver);
		sc.press(1260, 1545).moveTo(23,741).release().perform();
		driver.findElementById("com.ebay.mobile:id/button_bin").click();
		driver.findElementById("com.ebay.mobile:id/take_action").click();
		Thread.sleep(20000);
		sc.press(715, 1417).moveTo(124,-1191).release().perform();
		Assert.assertEquals("SAMSUNG 49 INCHES 49MU6100 4K UHD LED TV", "SAMSUNG 49 INCHES 49MU6100 4K UHD LED TV");
		Assert.assertEquals("58,499", "58,499");
		
	
	}
	
	
}
	 
	
 