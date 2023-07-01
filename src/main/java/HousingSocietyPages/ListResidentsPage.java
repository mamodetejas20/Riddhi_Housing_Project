package HousingSocietyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ListResidentsPage {
    public WebDriver driver;
	@FindBy(xpath="//select[@name='sampleTable_length']")
	WebElement ShowEntries;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement SearchField;
	
	@FindBy(xpath="(//a[@class='btn btn-info btn-sm'])[1]")
	WebElement ViewTab;
	

	public ListResidentsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void ShowEntriesValidation() {
		Select sel = new Select(ShowEntries);
		sel.selectByValue("10");
	}
	public void Searchfldvali() {
		SearchField.sendKeys("Ankita Chheda");	
	}
	public ViewResidentPage ViewTabVali() {
		ViewTab.click();
		return new ViewResidentPage(driver);
	}

}
