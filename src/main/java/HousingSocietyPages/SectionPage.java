package HousingSocietyPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SectionPage {
	private WebDriver driver;
	@FindBy(xpath="//input[@name='sectionname']")
	WebElement EnterSectionName;
	
	@FindBy(xpath="//button[@name='submit']")
	WebElement SubmitButton;
	
	@FindBy(xpath="//select[@name='sampleTable_length']")
	WebElement ShowEntrieDropdown;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement ListOfSectionSearchField;
	
	@FindBy(xpath="//*[text()='Tejas721']")
	WebElement VerificationOfAddedvalue;
	
	public SectionPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void EnterInSearchField() throws Exception {
		Thread.sleep(2000);
		EnterSectionName.sendKeys("Tejas721");
		
	}
	public void submit() throws Exception {
		Thread.sleep(2000);
		SubmitButton.click();
	}
	public void ShowEntries() throws Exception {
		Thread.sleep(2000);
		Select sel = new Select(ShowEntrieDropdown);
		List<WebElement>allOptions=sel.getOptions();
		for(int i=0;i<allOptions.size();i++) {
			System.out.println(allOptions.get(i).getText());
		}
		sel.selectByValue("10");
	    String SelectedOption=sel.getFirstSelectedOption().getText();
	    System.out.println("SelectedOption="+SelectedOption);
	    
		
	}
	public void EnterInListOfSectionField() throws InterruptedException {
		Thread.sleep(2000);
		ListOfSectionSearchField.sendKeys("tejas721");
		
	}
	public void VerifyEnteredField() throws InterruptedException {
		Thread.sleep(2000);
		VerificationOfAddedvalue.isDisplayed();
	}
}
	
	


