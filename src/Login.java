
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Login extends basebay {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("com.ebay.mobile:id/button_sign_in").click();
		
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("com.ebay.mobile:id/edit_text_username").sendKeys("kunall.gg@gmail.com");
		driver.findElementById("com.ebay.mobile:id/edit_text_password").sendKeys("infosystest@1");
		driver.findElementById("com.ebay.mobile:id/button_sign_in").click();
		driver.findElementById("com.ebay.mobile:id/button_google_deny").click();
		//driver.findElementByXPath("//android.widget.TextView[@text='No thanks']").click();
		driver.findElementById("com.ebay.mobile:id/search_box").click(); 
		driver.findElementById("com.ebay.mobile:id/search_src_text").sendKeys("65-inch TV");
		//driver.findElementsByClassName("android.widget.TextView").get(0).click();
		driver.findElementByXPath("//android.widget.TextView[@text='65 inch led tv']").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SAMSUNG 49 INCHES 49MU6100 4K UHD LED TV 2017 MODEL WITH 1 YEAR DEALER WARRANTY!\"))");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		//driver.findElementByXPath("//android.widget.TextView[@text='SONY 65 INCHES 65X7000E 4k UHD HDR SMART LED TV + ONE YEAR DEALER'S WARRANTY']").click();
		//driver.("android.view.View").get(1).click();
		driver.findElementByAndroidUIAutomator("text(\"SAMSUNG 49 INCHES 49MU6100 4K UHD LED TV 2017 MODEL WITH 1 YEAR DEALER WARRANTY!\")").click();
		
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ITEM DESCRIPTION\"))");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"ITEM DESCRIPTION\")").click();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		driver.findElementById("com.ebay.mobile:id/home").click();
		
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
				
		TouchAction sc = new TouchAction(driver);
		//Duration r=Duration.ofSeconds(30);
		//ts.press(207, 582).moveTo(8, -360).release().perform();
		sc.press(1260, 1545).moveTo(23,741).release().perform();
		
		
        /*TouchAction sr =new TouchAction(driver );
		
		Dimension size= driver.manage().window().getSize();
		int x = size.getWidth()/2;
        int starty =(int)(size.getHeight()*-0.160);
		int endy =(int)(size.getHeight()* -0.80); 
		sr.press(x, starty).moveTo(x, endy).release().perform();*/

		/*Dimension dim= driver.manage().window().getSize();
		//int height = dim.getHeight();
		int width = dim.getWidth();
		//int y = (int)(height*0.20);
		int startx =(int)(width*-10);
		int endx =(int)(width*10.0);                                    
		ta.press(driver.findElementById("timentask.location_tracker:id/llTaskDetailContainer")).waitAction(r).moveTo(startx, endx).release().perform();	*/
  
		driver.findElementById("com.ebay.mobile:id/button_bin").click();
		
		
		//driver.findElementByXPath("//android.widget.TextView[@text='BUY IT NOW']").click();
		
		driver.findElementById("com.ebay.mobile:id/take_action").click();
		
	
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Proceed to Pay\"))");
		driver.findElementByAndroidUIAutomator("text(\"Proceed to Pay\")").click();
	
	
	
	}
	
	
	
	
	
	

}
