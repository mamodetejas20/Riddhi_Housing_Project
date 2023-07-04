package HousingSocietyTestCases;

import org.Utilities.BaseUtility;
import org.Utilities.ConFig;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HousingSocietyPages.AddContentsPage;
import HousingSocietyPages.DashBoardPage;
import HousingSocietyPages.HomePage;
import HousingSocietyPages.LoginPage;

public class AddContentTc {
	public WebDriver driver;
	String Bname;
	String url;
	String username;
	String password;
	

	@BeforeMethod
	public void LoginCode() {
		BaseUtility bu = new BaseUtility();
		ConFig cr = new ConFig();
		driver=bu.Startup(cr.getTestData("Bname"),cr.getTestData("url"));
		System.out.println();
		
	}
	@Test(priority=10)
	public void AddContentValidation() throws Exception  {
		ConFig cr = new ConFig();
		LoginPage Loginpage=new LoginPage(driver);
		HomePage homepage= new HomePage(driver);
		AddContentsPage addcontentpage= new AddContentsPage(driver);
		Loginpage.EnterUsername(cr.getTestData("username"));
		Loginpage.EnterPassword(cr.getTestData("password"));
		homepage=Loginpage.LoginBtn();
		homepage.ContentPage();
		addcontentpage=homepage.AddContent();
		addcontentpage.DSelectvalue();
		addcontentpage.ContentTxtTitlefield();
		addcontentpage.ContentChargesfield();
		addcontentpage.ContentSequencefield();
		addcontentpage.ContentImgAltfield();
		addcontentpage.Datetab();
		addcontentpage.FileUpload();
		addcontentpage.Submit();
		Reporter.log("Add Content Validation");
		
	}
	
/*	@AfterMethod
	public void teardown() {
		driver.close();
		
		
		
		
		
		
		
		
	

}*/
}