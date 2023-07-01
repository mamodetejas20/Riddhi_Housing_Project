package HousingSocietyPages;
import org.Utilities.ConFig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	ConFig cr;
	private WebDriver driver;
	@FindBy(xpath="//input[@name='myusername']")
	private WebElement UsernameField;
	
	@FindBy(xpath="//input[@name='mypassword']")
	private WebElement PwdField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement LoginBtn;
	
	@FindBy(xpath="//div[@class='alert alert-danger']")
	private WebElement AlertMsg;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public boolean isUnameFldisdidp() {
		return UsernameField.isDisplayed();
	}
	public boolean ispwdFldisdidp() {
		return PwdField.isDisplayed();
	}
	public boolean LgnBtnIsDsp() {
		return LoginBtn.isDisplayed();
	}
	public void EnterUsername(String Uname) {
		UsernameField.sendKeys(Uname);
	}
	public void EnterPassword(String Pass) {
		PwdField.sendKeys(Pass);
	}
	public void EnterUsernamePassword(String username,String password) {
		UsernameField.sendKeys(username);
		PwdField.sendKeys(password);
		LoginBtn.click();
		String ActMessage=AlertMsg.getText();
		String ExpMessage="Username and Password field should not left blank		";
		Assert.assertEquals(ActMessage, ExpMessage);
		
	}
	public void EnterUsernamePassword1(String username,String password) {
		UsernameField.sendKeys(username);
		PwdField.sendKeys(password);
		LoginBtn.click();
	}
	
	public HomePage LoginBtn() {
		LoginBtn.click();
		return new HomePage(driver);
	}
}
