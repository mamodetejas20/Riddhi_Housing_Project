package HousingSocietyTestCases;

import org.Utilities.BaseUtility;
import org.Utilities.ConFig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HousingSocietyPages.AddNewRecieptPage;
import HousingSocietyPages.HomePage;
import HousingSocietyPages.LoginPage;
import HousingSocietyPages.ViewRecieptPage;

public class ViewRecieptTc {
	public WebDriver driver;
	@BeforeMethod
	public void LoginCode() {
		BaseUtility bu = new BaseUtility();
		ConFig cr = new ConFig();
		driver=bu.Startup(cr.getTestData("Bname"),cr.getTestData("url"));
	}
	@Test(priority=13)
	public void viewRecieptValidation() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		HomePage homepage = new HomePage(driver);
		ViewRecieptPage viewrecieptpage = new ViewRecieptPage(driver);
		ConFig Cr = new ConFig();
		loginpage.EnterUsername(Cr.getTestData("username"));
		loginpage.EnterPassword(Cr.getTestData("password"));
		homepage=loginpage.LoginBtn();
		homepage.RecieptPage();
		viewrecieptpage=homepage.ViewReciept();
		viewrecieptpage.PdfButtonVali();
		viewrecieptpage.SearchFLDVali();
		viewrecieptpage.ActionDropdownVali();
		viewrecieptpage.EditVali();
		AddNewRecieptPage addnewrecieptpage= new AddNewRecieptPage(driver);
		addnewrecieptpage.Residentdrpvali();
		addnewrecieptpage.PaymentDescVali();
		addnewrecieptpage.PaymentModevali();
		addnewrecieptpage.TotalAmtVali();
		addnewrecieptpage.RecievedAmtVali();
		addnewrecieptpage.BalanceAmtVali();
		addnewrecieptpage.SubmiBtnVali();
		
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.close();
}

}
