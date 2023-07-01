package HousingSocietyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewRecieptPage {
    String PaymentModevali;
	String Residentdrpvali;
	String pay;
	String TotalAmtVali;
	String RecievedAmtVali;
	private WebDriver driver;
	
	@FindBy(xpath="//select[@name='userid']")
	WebElement ResidentDropDown;
	
	@FindBy(xpath="//textarea[@name='payment_desc']")
	WebElement PaymentForFld;
	
	@FindBy(id="select")
	WebElement PaymentMode;
	
	@FindBy(id="total_amount")
	WebElement TotalAmountFld;
	
	@FindBy(id="received_amount")
	WebElement RecievedAmountFld;
	
	@FindBy(id="balance_amount")
	WebElement BalanceAmountFld;
	
	@FindBy(xpath="//button[@name='submit']")
	WebElement SubmitBtn;
	
	public AddNewRecieptPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Residentdrpvali() {
		Select sel = new Select(ResidentDropDown);
		sel.selectByValue("12");
		System.out.println("Residentdrpv="+Residentdrpvali);
	}
	public void PaymentDescVali() {
		PaymentForFld.sendKeys("Maintenece");
		System.out.println("pay="+pay);
	}
	public void PaymentModevali() {
		Select sel = new Select(PaymentMode);
		sel.selectByValue("UPI");
		System.out.println("PaymentModevali="+PaymentModevali);
	}
	public void TotalAmtVali() {
		TotalAmountFld.sendKeys("1000");
		System.out.println("TotalAmtVali="+TotalAmtVali);
	}
	public void RecievedAmtVali() {
		RecievedAmountFld.sendKeys("500");
		System.out.println("RecievedAmtVali="+RecievedAmtVali);
	}
	public void BalanceAmtVali() {
		BalanceAmountFld.sendKeys("500");
		System.out.println("BalanceAmountFld="+BalanceAmountFld);
	}
	public void SubmiBtnVali() {
		SubmitBtn.click();
	}
	

}
