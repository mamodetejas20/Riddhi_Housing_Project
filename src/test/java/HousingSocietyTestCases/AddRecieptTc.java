package HousingSocietyTestCases;
import org.Utilities.BaseUtility;
import org.Utilities.ConFig;
import org.Utilities.DataProviders;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import HousingSocietyPages.AddRecieptPage;
import HousingSocietyPages.HomePage;
import HousingSocietyPages.LoginPage;

public class AddRecieptTc {
	private WebDriver driver;
	LoginPage loginpage;
	HomePage  homepage;
	ConFig cr;
	
	@BeforeMethod
	public void start() {
		BaseUtility bu = new BaseUtility();
		ConFig cr = new ConFig();
		driver=bu.Startup(cr.getTestData("Bname"),cr.getTestData("url"));
	}
	
	@Test(priority=12,dataProvider="AddReciept",dataProviderClass=DataProviders.class)
	public void AddRecieptvalidation(String Resident,String PaymentFor,String PaymentMode,String TotalAmt,String RecievedAmt,String BalAmt,String TransDetails) throws Exception {
		ConFig cr = new ConFig();
		LoginPage loginpage= new LoginPage(driver);
		HomePage homepage=new HomePage(driver);
		AddRecieptPage  addrecieptpage= new AddRecieptPage(driver);
		loginpage.EnterUsername(cr.getTestData("username"));
		loginpage.EnterPassword(cr.getTestData("password"));
		homepage=loginpage.LoginBtn();
		homepage.RecieptPage();
		addrecieptpage=homepage.AddReciept();
		addrecieptpage.Residentdropdownvali(Resident);
		addrecieptpage.PaymentDescriptionvali(PaymentFor);
		addrecieptpage.PaymentModevali(PaymentMode);
		addrecieptpage.TotalAmountvali(TotalAmt);
		addrecieptpage.RecievedAmountvali(RecievedAmt);
		addrecieptpage.BalanceAmountvali(BalAmt);
		addrecieptpage.TransactionDetailsvali(TransDetails);
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}


