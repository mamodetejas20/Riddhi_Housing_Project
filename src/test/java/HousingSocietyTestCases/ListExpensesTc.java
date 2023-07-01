package HousingSocietyTestCases;

import org.Utilities.BaseUtility;
import org.Utilities.ConFig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HousingSocietyPages.AddContentsPage;
import HousingSocietyPages.AddExpensesPage;
import HousingSocietyPages.HomePage;
import HousingSocietyPages.ListExpensesPage;
import HousingSocietyPages.LoginPage;

public class ListExpensesTc {
	public WebDriver driver;
	String browsername;
	String url;
	String username;
	String password;
	LoginPage Loginpage;
	HomePage homepage;
	AddContentsPage addcontentpage;
	ConFig cr;
	
	@BeforeMethod
	public void LoginCode() {
		BaseUtility bu = new BaseUtility();
		ConFig cr = new ConFig();
		driver=bu.Startup(cr.getTestData("Bname"),cr.getTestData("url"));
	}
	@Test(priority=18)
	public void ListExpensesValidation() throws Exception  {
		ConFig cr = new ConFig();
		LoginPage Loginpage=new LoginPage(driver);
		AddContentsPage addcontentpage= new AddContentsPage(driver);
		Loginpage.EnterUsername(cr.getTestData("username"));
		Loginpage.EnterPassword(cr.getTestData("password"));
		homepage=Loginpage.LoginBtn();
		ListExpensesPage listexpensespage = new ListExpensesPage(driver);
		homepage.ExpensesPage();
		listexpensespage=homepage.ListExpenses();
		listexpensespage.SelectEmployeeVali();
		listexpensespage.SearchFieldVali();
		listexpensespage.DeleteAlertVali();
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.close();
}

}
