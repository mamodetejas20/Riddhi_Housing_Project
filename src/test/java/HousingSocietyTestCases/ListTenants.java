package HousingSocietyTestCases;

import org.Utilities.BaseUtility;
import org.Utilities.ConFig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HousingSocietyPages.HomePage;
import HousingSocietyPages.ListResidentsPage;
import HousingSocietyPages.ListTenantsPage;
import HousingSocietyPages.LoginPage;
import HousingSocietyPages.ViewResidentPage;

public class ListTenants {
	LoginPage loginpage;
	HomePage homepage;
	ListTenantsPage Listtenants;
	ConFig cr;
	BaseUtility bu;
	WebDriver driver;
	String Bname;
	String url;
	
	@BeforeMethod
	public void Launch() {
		BaseUtility bu= new	BaseUtility();
		ConFig cr=new ConFig();
	driver=bu.Startup(cr.getTestData("Bname"), cr.getTestData("url"));
	}
	@Test(priority=16)
	public void tenantsValidation() throws InterruptedException {
		ConFig cr=new ConFig();
		LoginPage loginpage= new LoginPage(driver);
		HomePage homepage= new HomePage(driver);
		ListTenantsPage Listtenants = new ListTenantsPage(driver);
		loginpage.EnterUsername(cr.getTestData("username"));
		loginpage.EnterPassword(cr.getTestData("password"));
		homepage=loginpage.LoginBtn();
		homepage.UsersTab();
		Listtenants=homepage.ListTenants();
		Listtenants.Searchfldvali();
		Listtenants.ShowEntriesValidation();
		Listtenants.ViewTabVali();
	}
}
