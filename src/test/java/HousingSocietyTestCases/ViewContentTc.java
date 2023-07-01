package HousingSocietyTestCases;

import org.Utilities.BaseUtility;
import org.Utilities.ConFig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HousingSocietyPages.HomePage;
import HousingSocietyPages.LoginPage;
import HousingSocietyPages.ViewContentPage;

public class ViewContentTc {
	private  WebDriver driver;
	
	@BeforeMethod
	public void LoginCode() {
		BaseUtility bu = new BaseUtility();
		ConFig cr = new ConFig();
		driver=bu.Startup(cr.getTestData("Bname"),cr.getTestData("url"));
	}
	@Test(priority=11)
	public void ViewContentValidation() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		ConFig cr = new ConFig();
		loginpage.EnterUsername(cr.getTestData("username"));
		loginpage.EnterPassword(cr.getTestData("password"));
		HomePage homepage= new HomePage(driver);
		homepage=loginpage.LoginBtn();
		ViewContentPage viewcontentpage=new ViewContentPage(driver);
		homepage.ContentPage();
		viewcontentpage=homepage.ViewContent();
		viewcontentpage.EnterValueInSearchField();
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.close();
}

}
