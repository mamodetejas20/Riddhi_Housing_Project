package HousingSocietyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage {
	public WebDriver driver;
	
	@FindBy(xpath="//select[@name='role']")
	WebElement RoleDropDown;
	
	@FindBy(xpath="//input[@name='fullname']")
	WebElement EnterFullName;
	
	@FindBy(xpath="//input[@name='mobile']")
	WebElement EnterMobileNumber;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement EnterPassword; 
	
	@FindBy(xpath="//input[@name='landline']")
	WebElement AlternateLandline; 
	
	@FindBy(xpath="//input[@name='email']")
	WebElement Email; 
	
	@FindBy(xpath="//select[@name='gender']")
	WebElement GenderDropdown;
	
	@FindBy(xpath="//input[@name='adhar_no']")
	WebElement AdharNumberField;

	@FindBy(xpath="//input[@name='pan_no']")
	WebElement PanNo;
	
	@FindBy(xpath="//button[@name='submit']")
	WebElement SUBMITBTN;
	
	
	public AddUserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Roledropdown() throws InterruptedException {
		Thread.sleep(2000);
		Select sel = new Select(RoleDropDown);
		sel.selectByValue("Admin");
	}
	public void EnterFullNameVali() {
		EnterFullName.sendKeys("Xyz");
	}
	public void EnterMobileNumberVali() {
		EnterMobileNumber.sendKeys("869857");
	}
	public void EnterPasswordVali() {
		EnterPassword.sendKeys("XYZ@789");
	}
	public void AlternateLandlineVali() {
		AlternateLandline.sendKeys("72883889");
	}
	public void EmailVali() {
		Email.sendKeys("tssg@gmail.com");
	}
	public void AdharNoField() {
		AdharNumberField.sendKeys("7807756755");
	}
	public void GenderDropdownvali() {
		Select sel = new Select(GenderDropdown);
		sel.selectByValue("Male");
	}
	public void PanNoFld() {
		PanNo.sendKeys("DYRPM999R");
	}
	public void Submit() {
		SUBMITBTN.click();
		
	}

}
