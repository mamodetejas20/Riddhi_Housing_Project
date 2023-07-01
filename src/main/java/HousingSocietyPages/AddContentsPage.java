package HousingSocietyPages;

import org.Utilities.BaseUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddContentsPage {
	public WebDriver driver;

	

	@FindBy(xpath="//select[@name='sectionname']")
	WebElement SelectSectionDropdown;

	@FindBy(xpath="//input[@name='contenttitle']")
	WebElement ContentTitleField;

	@FindBy(xpath="//input[@name='price']")
	WebElement ContentCharges;

	@FindBy(xpath="//input[@name='sequence']")
	WebElement ContentSequence;

	@FindBy(xpath="//input[@name='alt_tag']")
	WebElement ContentImgAlt;
	
	@FindBy(xpath="//input[@name='content_date']")
	WebElement Date;
	
	@FindBy(xpath="//input[@name='alt_tag']")
	WebElement SubmitBtn;

	@FindBy(xpath="//input[@name='image_filename']")
	WebElement uploadBtn;
	
	


	public AddContentsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	public void DSelectvalue() {
		SelectSectionDropdown.click();
		Select sel = new Select(SelectSectionDropdown);
		sel.selectByValue("100");

	}
	public void ContentTxtTitlefield() {
		ContentTitleField.sendKeys("Scout");

	}
	public void ContentChargesfield() {
		ContentCharges.sendKeys("1000");
	}
	public void ContentSequencefield() {
		ContentSequence.sendKeys("100");
	}
	public void ContentImgAltfield() {
		ContentImgAlt.sendKeys("180");
	}
	public void Datetab() {
		Date.sendKeys("26-06-2023");
	}
	public void FileUpload() {
		uploadBtn.sendKeys("C:\\Users\\TEJAS\\OneDrive\\Pictures\\Camera Roll\\3726300.png");
	}
	public void Submit() {
		SubmitBtn.click();
	}
}

