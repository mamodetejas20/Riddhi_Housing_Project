package HousingSocietyPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ListExpensesPage {
	private WebDriver driver;
	
	@FindBy(id="selectbox")
	WebElement selectEmployee;
	
	@FindBy(xpath="//span[text()='Excel']")
	WebElement ExcelClick;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement SearchField;
	
	@FindBy(xpath="//a[@class='btn btn-danger btn-sm']")
	WebElement Deletealert;
	
	public ListExpensesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    public void SelectEmployeeVali() {
    	Select sel = new Select(selectEmployee);
    	sel.selectByValue("Honey singh");
    }
    public void ExcelClickVali() {
    	ExcelClick.click();
    }
    public void SearchFieldVali() {
    	SearchField.sendKeys("Honey singh");
    }
    public void DeleteAlertVali() throws InterruptedException {
    	Deletealert.click();
    	Alert Alt = driver.switchTo().alert();
    	Thread.sleep(2000);
    	Alt.accept();
    }
    
}
