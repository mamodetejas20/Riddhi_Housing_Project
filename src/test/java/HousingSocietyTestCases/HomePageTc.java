package HousingSocietyTestCases;

import java.time.Duration;

import org.Utilities.BaseUtility;
import org.Utilities.ConFig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import HousingSocietyPages.DashBoardPage;
import HousingSocietyPages.HomePage;
import HousingSocietyPages.LoginPage;

public class HomePageTc {
	 WebDriver driver;
	 String Bname;
	 String url;
	LoginPage loginpage;
	HomePage homepage;
	DashBoardPage dashboardpage;
	ConFig cr;
	

	@BeforeMethod
	public void Startup() {
		BaseUtility bu = new BaseUtility();
		ConFig cr = new ConFig();
		driver=bu.Startup(cr.getTestData("Bname"),cr.getTestData("url"));
		
		
		
	}
	@Test(priority=5)
	public void logincode() {
		LoginPage loginpage = new LoginPage(driver);
		 ConFig cr = new ConFig();
		 loginpage.EnterUsername(cr.getTestData("username"));
		 loginpage.EnterPassword(cr.getTestData("password"));
		 homepage=loginpage.LoginBtn();
		 HomePage homepage = new HomePage(driver);
		 SoftAssert sa = new SoftAssert();
		 sa.assertTrue(homepage.ContentsisDisp());
		 sa.assertTrue(homepage.DashboardpageisDisp());
		 sa.assertTrue(homepage.ExpensesisDisp());
		 sa.assertTrue(homepage.RecieptisDisp());
		 sa.assertTrue(homepage.SectionsisDisp());
	 }
		 
	@Test(priority=6)
	public void Validation() throws Exception {
		LoginPage loginpage = new LoginPage(driver);
		ConFig cr = new ConFig();
		loginpage.EnterUsername(cr.getTestData("username"));
		loginpage.EnterPassword(cr.getTestData("password"));
		homepage=loginpage.LoginBtn();
		HomePage homepage = new HomePage(driver);
		homepage.ValidateShowEntries();
	//	Hp2.Logout();
		
		
	
			
		 
		 
		 
	 }
	@AfterMethod
	public void teardown() {
		driver.close();
}

}
