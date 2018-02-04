package example.Pages;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

public class SetUp {
	
	Properties properties;
	
	AndroidDriver<WebElement> driver;
	
	public void Set_Up() throws IOException{		
		
		properties = new Properties();
		
		File f = new File(System.getProperty("user.dir")+"\\src\\properties_file\\config.properties");
		
		FileReader obj = new FileReader(f);
		
		properties.load(obj);
		
			//Setting desired capabilities
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, properties.getProperty("PLATFORM_NAME"));
			
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, properties.getProperty("DEVICE_NAME"));
			
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "50");
			
			cap.setCapability(MobileCapabilityType.APP, properties.getProperty("APP"));	
		
			driver = new AndroidDriver<>(new URL(properties.getProperty("AppiumURL")),cap);
	}
	
	public SetUp()
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}

}
