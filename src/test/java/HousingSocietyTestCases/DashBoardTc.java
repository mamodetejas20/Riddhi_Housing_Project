package HousingSocietyTestCases;

import org.Utilities.BaseUtility;
import org.Utilities.ConFig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.dockerjava.api.model.Driver;

import HousingSocietyPages.DashBoardPage;
import HousingSocietyPages.HomePage;
import HousingSocietyPages.LoginPage;

public class DashBoardTc {
	public WebDriver driver;
	String browsername;
	String url;
	String username;
	String password;
	LoginPage Loginpage;
	HomePage homepage;
	DashBoardPage dashboardpage;
	ConFig cr;
	

	@BeforeMethod
	public void LoginCode() {
		BaseUtility bu = new BaseUtility();
		ConFig cr = new ConFig();
		driver=bu.Startup(cr.getTestData("Bname"),cr.getTestData("url"));
		
		
	}
	@Test(priority=7)
	public void DashBoardvalidation() throws InterruptedException  {
		ConFig cr = new ConFig();
		LoginPage Loginpage=new LoginPage(driver);
		Loginpage.EnterUsername(cr.getTestData("username"));
		Loginpage.EnterPassword(cr.getTestData("password"));
		homepage=Loginpage.LoginBtn();
		dashboardpage=homepage.DashBoardClick();
	}
	
	@Test(priority=8)
	public void DashBoardVerification() throws InterruptedException {
		ConFig cr = new ConFig();
		LoginPage Loginpage=new LoginPage(driver);
		DashBoardPage dashboardpage= new DashBoardPage(driver);
		Loginpage.EnterUsername(cr.getTestData("username"));
		Loginpage.EnterPassword(cr.getTestData("password"));
		homepage=Loginpage.LoginBtn();
		dashboardpage=homepage.DashBoardClick();
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(dashboardpage.ResidentisDisp());
		sa.assertTrue(dashboardpage.StaffisDisp());
		sa.assertTrue(dashboardpage.TotalRecieptisDisp());
		sa.assertTrue(dashboardpage.BalanceAmountisDisp());
		sa.assertTrue(dashboardpage.TotalExpensesisDisp());
		sa.assertTrue(dashboardpage.RecievedAmountisDisp());
		
		
		
		
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.close();
}

}
