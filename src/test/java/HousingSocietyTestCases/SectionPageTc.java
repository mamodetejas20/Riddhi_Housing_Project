package HousingSocietyTestCases;

import org.Utilities.BaseUtility;
import org.Utilities.ConFig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HousingSocietyPages.DashBoardPage;
import HousingSocietyPages.HomePage;
import HousingSocietyPages.LoginPage;
import HousingSocietyPages.SectionPage;

public class SectionPageTc {
	public WebDriver driver;
	String browsername;
	String url;
	String username;
	String password;
	String value;
	String text;
	LoginPage Loginpage;
	HomePage homepage;
	DashBoardPage dashboardpage;
	SectionPage sectionpage;
	ConFig cr;


	@BeforeMethod
	public void Launch() {
		BaseUtility bu= new	BaseUtility();
		ConFig cr=new ConFig();
		driver=bu.Startup(cr.getTestData("Bname"), cr.getTestData("url"));
	}

	@Test(priority=1)
	public void SectionPagevalidation() throws Exception  {
		ConFig cr = new ConFig();
		LoginPage Loginpage=new LoginPage(driver);
		Loginpage.EnterUsername(cr.getTestData("username"));
		Loginpage.EnterPassword(cr.getTestData("password"));
		homepage=Loginpage.LoginBtn();
		SectionPage sectionpage= new SectionPage(driver);
		sectionpage=homepage.SectionClick();
		sectionpage.EnterInSearchField();
		sectionpage.submit();
		sectionpage.ShowEntries();
		sectionpage.EnterInListOfSectionField();

	}
	@Test(priority=2)
	public void verificatonSectionPage() throws Exception {
		ConFig cr = new ConFig();
		LoginPage Loginpage=new LoginPage(driver);
		Loginpage.EnterUsername(cr.getTestData("username"));
		Loginpage.EnterPassword(cr.getTestData("password"));
		homepage=Loginpage.LoginBtn();
		SectionPage sectionpage= new SectionPage(driver);
		sectionpage=homepage.SectionClick();
		sectionpage.EnterInListOfSectionField();
		sectionpage.VerifyEnteredField();









		//	}
		//	@AfterMethod
		//	public void teardown() {
		//		driver.close();
	}
}
