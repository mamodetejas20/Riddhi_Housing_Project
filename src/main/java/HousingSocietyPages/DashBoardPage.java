package HousingSocietyPages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	public  WebDriver driver;
	
	@FindBy(xpath="//span[@class='app-menu__label']")
	WebElement DashBoardClick;
	
	@FindBy(xpath="//*[text()='Resident']")
	WebElement Resident;
	
	@FindBy(xpath="//*[text()='Staff']")
	WebElement Staff;
	
	@FindBy(xpath="//*[text()='Total Receipt']")
	WebElement TotalReciept;
	
	@FindBy(xpath="//*[text()='Received Amount']")
	WebElement RecievedAmount;
	
	@FindBy(xpath="//*[text()='Balance Amount']")
	WebElement BalanceAmount;
	
	@FindBy(xpath="//*[text()='Total Expenses']")
	WebElement TotalExpenses;
	
	
	public DashBoardPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
	public void DashboardClick() {
		DashBoardClick.click();
		
	}
	public boolean ResidentisDisp() {
		return Resident.isDisplayed();
	}
	public boolean StaffisDisp() {
		return Staff.isDisplayed();
	}
	public boolean TotalRecieptisDisp() {
		return TotalReciept.isDisplayed();
	}
	public boolean BalanceAmountisDisp() {
		return RecievedAmount.isDisplayed();
	}
	public boolean TotalExpensesisDisp() {
		return TotalExpenses.isDisplayed();
	}
	public boolean RecievedAmountisDisp() {
		return RecievedAmount.isDisplayed();
}
}
