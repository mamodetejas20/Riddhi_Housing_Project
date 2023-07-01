package HousingSocietyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddExpensesPage {
   private WebDriver driver;
   @FindBy(xpath="//input[@name='employee_name']")
   WebElement ExpensesDoneby;
   
   @FindBy(xpath="/html/body/main/div/div[1]/div/div[1]/form/div[2]/div/input")
   WebElement ExpensesAmount;
   
   @FindBy(id="select")
   WebElement ExpensesTypeDropDown;
   
   @FindBy(xpath="(//select[@name='expense_mode'])[2]")
   WebElement ExpensesModeDropDown;
   
   @FindBy(xpath="//input[@name='expense_date']")
   WebElement ExpensesDate;
   
   @FindBy(xpath="//button[@name='submit']")
   WebElement SubmitButton;
   
   
   public AddExpensesPage(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   public void ExpensesAmountVali() {
	   ExpensesDoneby.sendKeys("Honey singh"); 
   }
   public void ExpensesDoneByVali() {
	   ExpensesAmount.sendKeys("10000"); 
   }
   public void ExpensesTypeVali() {
	   Select sel = new Select(ExpensesTypeDropDown);
	   sel.selectByValue("Transport");
	    
   }
   public void ExpensesModeVali() {
	   Select sel = new Select(ExpensesModeDropDown);
	   sel.selectByValue("UPI");
   }
   public void Date () {
	   ExpensesDate.sendKeys("22-06-2023");
	   
   }
   public void SubmitbtnVali() {
	   SubmitButton.click();
   }
   
}
