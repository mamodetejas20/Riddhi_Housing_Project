package HousingSocietyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewContentPage {
	private WebDriver driver;
	@FindBy(xpath="//input[@type='search']")
	WebElement EnterInsearchField;

	public ViewContentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void EnterValueInSearchField() {
		EnterInsearchField.sendKeys("Payment");
		
	}

}
