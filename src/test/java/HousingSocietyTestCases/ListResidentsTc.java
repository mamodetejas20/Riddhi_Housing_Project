package HousingSocietyTestCases;

import org.Utilities.BaseUtility;
import org.Utilities.ConFig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HousingSocietyPages.HomePage;
import HousingSocietyPages.ListResidentsPage;
import HousingSocietyPages.LoginPage;
import HousingSocietyPages.ViewResidentPage;



public class ListResidentsTc {
	LoginPage loginpage;
	HomePage homepage;
	ListResidentsPage listresident;
	ViewResidentPage viewresidentpage;
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
	
	@Test(priority=15)
	public void ListResidentValidation() throws InterruptedException {
		ConFig cr=new ConFig();
		LoginPage loginpage= new LoginPage(driver);
		HomePage homepage= new HomePage(driver);
		ListResidentsPage listresident= new ListResidentsPage(driver);
		ViewResidentPage viewresidentpage = new ViewResidentPage(driver);
		loginpage.EnterUsername(cr.getTestData("username"));
		loginpage.EnterPassword(cr.getTestData("password"));
		homepage=loginpage.LoginBtn();
		homepage.UsersTab();
		listresident=homepage.ListResidents();
		listresident.ShowEntriesValidation();
		listresident.Searchfldvali();
		viewresidentpage=listresident.ViewTabVali();
		viewresidentpage.RoleVali();
		viewresidentpage.WingVali();
		viewresidentpage.NameVali();
		viewresidentpage.HouseNoVali();
		
		
		
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.close();
}

}
