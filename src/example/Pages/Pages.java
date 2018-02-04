package example.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Pages {
	
	public Pages(AppiumDriver<WebElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
	public WebElement Preference;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	public WebElement Preference_dependencies;
	
	@AndroidFindBy(id="android:id/checkbox")
	public WebElement WiFi_checkbox;
	
	@AndroidFindBy(xpath="(//android.widget.RelativeLayout)[2]")
	public WebElement WiFi_settings;
	
	@AndroidFindBy(className="android.widget.EditText")
	public WebElement WiFi_name;
	
	@AndroidFindBy(id="android:id/button1")
	public WebElement OK;

public void Clickelements()
{
	Preference.click();
	Preference_dependencies.click();
	WiFi_checkbox.click();
	WiFi_settings.click();
	WiFi_name.sendKeys("hello");
	OK.click();
	
}

public boolean VerifyPage(String pagetitle)
{
	if(OK.getText().contains(pagetitle))
		return true;
	else
		return false;
	
}


}
