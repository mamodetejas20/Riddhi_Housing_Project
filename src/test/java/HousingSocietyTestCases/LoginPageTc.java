package HousingSocietyTestCases;

import org.Utilities.BaseUtility;
import org.Utilities.ConFig;
import org.Utilities.DataProviders;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import HousingSocietyPages.HomePage;
import HousingSocietyPages.LoginPage;

public class LoginPageTc {
	public WebDriver driver;
	String Bname;
	String url;
	HomePage homepage;
	LoginPage loginpage;

	@BeforeMethod
	public void startup() {
			BaseUtility bu = new BaseUtility();
			ConFig cr = new ConFig();
			driver=bu.Startup(cr.getTestData("Bname"),cr.getTestData("url"));
			
		}
	
		
		
		@Test(priority=2)
		public void Verification() {
			LoginPage Lp_Obj = new LoginPage(driver);
			SoftAssert Sa = new SoftAssert();
			Sa.assertTrue(Lp_Obj.isUnameFldisdidp());
			Sa.assertTrue(Lp_Obj.ispwdFldisdidp());
			Sa.assertTrue(Lp_Obj.LgnBtnIsDsp());
			Reporter.log("Verfied succesfull");
			
		}
		@Test(priority=1)
		public void LoginPagePositiveValidation() {
			LoginPage loginpage = new LoginPage(driver);
			ConFig cr = new ConFig();
			loginpage.EnterUsername(cr.getTestData("username"));
			loginpage.EnterPassword(cr.getTestData("password"));
			homepage=loginpage.LoginBtn();
		//	homepage=Vp_Obj.Login(uname, pswd);
		//	Reporter.log("Validated Succesful");
		}	
		@Test(priority=3)
		public void NegativeTestCase() {
			LoginPage loginpage1 = new LoginPage(driver);
			ConFig cr = new ConFig();
			loginpage1.EnterUsernamePassword(cr.getTestData(""),cr.getTestData(""));
			loginpage1.LoginBtn();
			
		
		}
		@Test(priority=4,dataProvider="logindata",dataProviderClass=DataProviders.class)
		public void ExcelVerification(String username,String password) {
			LoginPage loginpage1 = new LoginPage(driver);
			loginpage1.EnterUsernamePassword1(username, password);
			
		}
			
		@AfterMethod
		public void teardown() {
			driver.close();
	}		
			
}
			
		
		

