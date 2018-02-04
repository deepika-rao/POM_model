package example.Test;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import example.Pages.Pages;
import example.Pages.SetUp;
import io.appium.java_client.android.AndroidDriver;

public class Test_cases {
	
	AndroidDriver<WebElement> driver;
	
	@BeforeClass
	public void Setup() throws IOException{		
		
		SetUp capabalities = new SetUp();
		
		capabalities.Set_Up();
		
	}
	
	@Test
	public void Test1()
	{
		Pages methods = new Pages(driver);
		
		methods.Clickelements();
		
		if (methods.VerifyPage("APPIUM API DEMOS"))
			
			System.out.println("Testing Passed");
		else
			
			System.out.println("Testing Failed");
		
		
	}
	
	public void ExplicitWait(WebElement element)
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(element));
		
	}
	

}
