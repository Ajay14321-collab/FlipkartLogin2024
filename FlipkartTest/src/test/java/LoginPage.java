import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClassSetup {

	
	//constructor with driver as argument
	public LoginPage(WebDriver driver) 
	{

	    this.driver = driver ;
	    PageFactory.initElements(driver, this);
	    //initialize the objects
	}

	 // pageObjects of Login page
	   @FindBy(xpath = "//span[contains(text(),'Login')]")
	   WebElement login_btn;
	   
	   @FindBy (xpath ="//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")
	   WebElement mobileNumber;
	   
	   @FindBy (xpath="//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button")
	   WebElement requestOTP;
	 // methods of Login page    
	   public void loginURL() 
	   {
		   driver.get("https://www.flipkart.com/");
	    
	   }
	   public void clickonLogin() throws InterruptedException
	   {
		   login_btn.click();
		   mobileNumber.sendKeys("9673587808");
		   Thread.sleep(1000);
		   requestOTP.click();
		   
	   }
}