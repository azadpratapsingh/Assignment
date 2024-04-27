import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppAutomation {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "Nexus S API 28");
		capabilities.setCapability("platformname", "Android");
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("app", System.getProperty("user.dir") + "\\assign.apk");
		capabilities.setCapability("platformversion", "9.0");
		capabilities.setCapability("appPackage", "com.eeki.dev");
		capabilities.setCapability("appActivity", "com.eekifoods.MainActivity");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.1.1:4723/"), capabilities);

		Thread.sleep(5000);
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Climate\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Dome Parameters\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.ImageView")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"NANTA-A | Zone : 1\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"))
				.click();
		Thread.sleep(3000);

		for (int i = 1; i <= 50; i++) {

			driver.findElement(By.xpath(
					"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Dome\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Section\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Section\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"SUBMIT\"]")).click();
			Thread.sleep(5000);
		}
		driver.quit();
	}

}
