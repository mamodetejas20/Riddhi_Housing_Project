package HousingSocietyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddRecieptPage {
	public WebDriver driver;
	
	@FindBy(xpath="//select[@name='userid']")
	WebElement ResidentDropdown;
	
	@FindBy(xpath="//*[@name='payment_desc']")
	WebElement PaymentDescription;
	
	@FindBy(xpath="//select[@name='mode_of_payment']")
	WebElement paymentMode;
	
	@FindBy(xpath="//input[@name='total_amount']")
	WebElement TotalAmount;
	
	@FindBy(xpath="//input[@name='received_amount']")
	WebElement RecievdAmount;
	
	@FindBy(id="balance_amount")
	WebElement BalanceAmount;
	
	@FindBy(xpath="//*[@name='payment_note']")
	WebElement TransactionDetails;
	
	public AddRecieptPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Residentdropdownvali(String Resident) {
		Select Sel = new Select(ResidentDropdown);
		Sel.selectByValue(Resident);
	}
	public void PaymentDescriptionvali(String PaymentFor) throws Exception {
		PaymentDescription.sendKeys(PaymentFor);
		
		
	}
	public void PaymentModevali(String PaymentMode) {
		Select Sel = new Select(paymentMode);
		Sel.selectByValue(PaymentMode);
	}
	public void TotalAmountvali(String TotalAmt) throws Exception {
		TotalAmount.sendKeys(TotalAmt);
	}
	public void RecievedAmountvali(String RecievedAmt) throws Exception {
		RecievdAmount.sendKeys(RecievedAmt);
		
	}
	public void BalanceAmountvali(String BalAmt) {
		BalanceAmount.sendKeys(BalAmt);
		
	}
	public void TransactionDetailsvali(String TransDetails) {
		TransactionDetails.sendKeys(TransDetails);
	}
	
	}
	
