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
import HousingSocietyPages.LoginPage;

public class AddExpensesTc {
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
		String Bname="ch";
		String url="https://tronsoftech.in/projects/riddhi/index.php";
		driver=bu.Startup(Bname,url);
	}
	@Test(priority=17)
	public void AddExpensesValidation() throws Exception  {
		ConFig cr = new ConFig();
		LoginPage Loginpage=new LoginPage(driver);
		AddContentsPage addcontentpage= new AddContentsPage(driver);
		Loginpage.EnterUsername(cr.getTestData("username"));
		Loginpage.EnterPassword(cr.getTestData("password"));
		homepage=Loginpage.LoginBtn();
		AddExpensesPage addexpensespage = new AddExpensesPage(driver);
		homepage.ExpensesPage();
		addexpensespage=homepage.AddExpenses();
		addexpensespage.ExpensesDoneByVali();
		addexpensespage.ExpensesAmountVali();
		addexpensespage.ExpensesTypeVali();
		addexpensespage.ExpensesModeVali();
		addexpensespage.Date();
		addexpensespage.SubmitbtnVali();
		
	}
	//@AfterMethod
	//public void teardown() {
	//	driver.close();
}
