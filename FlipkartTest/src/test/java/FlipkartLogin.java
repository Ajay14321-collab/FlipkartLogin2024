
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FlipkartLogin extends BaseClassSetup {
	
	
	@Test
	public void Logintest() throws InterruptedException
	
	{
		LoginPage lp = new LoginPage(driver);	
		lp.loginURL();
		lp.clickonLogin();	
	}
	

}
