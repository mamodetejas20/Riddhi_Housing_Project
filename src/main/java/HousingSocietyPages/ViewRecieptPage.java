package HousingSocietyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewRecieptPage {
	public WebDriver driver;
	
	@FindBy(xpath="//button[@class='dt-button buttons-pdf buttons-html5']")
	WebElement PdfButton;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement SearchFld;
	
	@FindBy(xpath="(//a[@class='btn btn-info btn-sm'])[1]")
	WebElement ViewReciept;
	
	@FindBy(id="dropdownMenuButton")
	WebElement ActionDropdown;
	
	@FindBy(xpath="//a[@title='Edit Receipt']")
	WebElement EditReciept;
	
	public ViewRecieptPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void PdfButtonVali() {
		PdfButton.click();
	}
	public void SearchFLDVali() {
		SearchFld.sendKeys("Ashis");
	}
	public void ViewRecieptVali() {
		SearchFld.sendKeys("ashis");
	}
	public void ActionDropdownVali() {
		ActionDropdown.click();
	}
	public AddNewRecieptPage EditVali() {
		EditReciept.click();
		return new AddNewRecieptPage(driver);
	}
	
	
		
}

