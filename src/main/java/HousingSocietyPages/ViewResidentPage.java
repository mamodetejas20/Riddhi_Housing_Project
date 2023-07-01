package HousingSocietyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ViewResidentPage {
	WebDriver driver;
	@FindBy(xpath="//*[text()='Role']")
	WebElement Role;
	
	@FindBy(xpath="//*[text()='Wing / Row House']")
	WebElement Wing;
	
	@FindBy(xpath="//*[text()='House / Flat Number']")
	WebElement HouseNo;
	
	@FindBy(xpath="//*[text()='Name']")
	WebElement Name;
	
	@FindBy(xpath="//*[text()='Mobile Number']")
	WebElement MobNo;
	
	@FindBy(xpath="//*[text()='Username']")
	WebElement UserName;
	
	
	
	public ViewResidentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void RoleVali() {
		SoftAssert sa = new SoftAssert();
		String Act="Resident";
		String Exp=Role.getText();
		sa.assertEquals(Act, Exp);
	}
	public void WingVali() {
		SoftAssert sa = new SoftAssert();
		String Act="A Wing";
		String Exp=Wing.getText();
		sa.assertEquals(Act,Exp);
		
		
	}
	public void HouseNoVali() {
		SoftAssert sa = new SoftAssert();
		Integer Act=302;
		String Exp=HouseNo.getText();
		sa.assertEquals(Act, Exp);
	}
	public void NameVali() {
		SoftAssert sa = new SoftAssert();
		String Act="Ankita Chheda";
		String Exp=Name.getText();
		sa.assertEquals(Act, Exp);
	}
/*	public void Mobnovali() {
		double Act= 5634346435;
		String Exp=MobNo.getText();
		Assert.assertEquals(Act, Exp);
	} */

}
