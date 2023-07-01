package HousingSocietyTestCases;

import org.Utilities.BaseUtility;
import org.Utilities.ConFig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HousingSocietyPages.AddUserPage;
import HousingSocietyPages.HomePage;
import HousingSocietyPages.LoginPage;

public class AddUserTc {
	String Bname;
	String url;
	String username;
	String password;
	WebDriver driver;
	HomePage homePage;
	AddUserPage adduserpage;
	@BeforeMethod
	public void Startup() {
		ConFig cr = new ConFig();
		BaseUtility bu = new BaseUtility();
		driver=bu.Startup(cr.getTestData("Bname"), cr.getTestData("url"));
	}
	
	@Test(priority=14)
	public void Validation() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		ConFig cr = new ConFig();
		loginpage.EnterUsername(cr.getTestData("username"));
		loginpage.EnterPassword(cr.getTestData("password"));
		homePage=loginpage.LoginBtn();
		homePage.UsersTab();
		adduserpage=homePage.AddUser();
		//adduserpage.Roledropdown();
		adduserpage.EnterFullNameVali();
		adduserpage.EnterMobileNumberVali();
		adduserpage.AlternateLandlineVali();
		adduserpage.EmailVali();
		adduserpage.GenderDropdownvali();
		adduserpage.AdharNoField();
		adduserpage.PanNoFld();
		adduserpage.Submit();
	}
	@AfterMethod
	public void teardown() {
		driver.close();
}


}
