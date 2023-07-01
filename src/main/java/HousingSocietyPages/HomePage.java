package HousingSocietyPages;

import java.util.List;

import org.Utilities.BaseUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BaseUtility  {
	DashBoardPage dashboardpage;
	AddContentsPage addcontentpage;
	ViewContentPage viewcontentpage;
	private WebDriver driver;
	@FindBy(xpath="//span[@class='app-menu__label']")
	WebElement Dashclickpage;

	@FindBy(xpath="(//span[@class='app-menu__label'])[2]")
	WebElement Section;

	@FindBy(xpath="(//span[@class='app-menu__label'])[3]")
	WebElement Contents;

	@FindBy(xpath="(//span[@class='app-menu__label'])[4]")
	WebElement Reciepts;

	@FindBy(xpath="(//span[@class='app-menu__label'])[5]")
	WebElement users;

	@FindBy(xpath="(//span[@class='app-menu__label'])[6]")
	WebElement Expenses;

	@FindBy(xpath="//select[@name='sampleTable_length']")
	WebElement ShowEntries;

	@FindBy(xpath="//a[@class='app-nav__item']")
	WebElement Admin;

	@FindBy(xpath="(//a[@class='dropdown-item'])[2]")
	WebElement Logout;

	@FindBy(xpath="(//a[@class='treeview-item '])[1]")
	WebElement AddContent;

	@FindBy(xpath="(//a[@class='treeview-item '])[2]")
	WebElement ViewContent;

	@FindBy(xpath="/html/body/aside/ul/li[4]/ul/li[1]/a")
	WebElement AddReciept;

	@FindBy(xpath="/html/body/aside/ul/li[4]/ul/li[2]/a")
	WebElement ViewReciept;

	@FindBy(xpath="(//i[@class=\"icon fa fa-plus-circle\"])[4]")
	WebElement AddExpensesTab;

	@FindBy(xpath="(//i[@class='icon fa fa-list-alt'])[6]")
	WebElement ListExpensesTab;

	@FindBy(xpath="/html/body/aside/ul/li[5]/ul/li[1]/a")
	WebElement AddUser;

	@FindBy(xpath="/html/body/aside/ul/li[5]/ul/li[2]/a")
	WebElement ListResidents;

	@FindBy(xpath="/html/body/aside/ul/li[5]/ul/li[3]/a")
	WebElement ListStaff;

	@FindBy(xpath="(//a[@class='treeview-item'])[3]")
	WebElement ListTenants;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public boolean DashboardpageisDisp() {
		return Dashclickpage.isDisplayed();
	}
	public boolean SectionsisDisp() {
		return Section.isDisplayed();
	}
	public boolean ContentsisDisp() {
		return Contents.isDisplayed();
	}
	public boolean RecieptisDisp() {
		return Reciepts.isDisplayed();
	}
	public boolean UsersisDisp() {
		return users.isDisplayed();
	}
	public boolean ExpensesisDisp() {
		return Expenses.isDisplayed();
	}
	public void ValidateShowEntries() {
		Select sel = new Select(ShowEntries);
		List<WebElement>alloptions=sel.getOptions();
		System.out.println(alloptions.size());
		for(int i =0;i<alloptions.size();i++) {
			System.out.println(alloptions.get(i).getText());
		}
	}

	public DashBoardPage DashBoardClick() throws InterruptedException {
		Thread.sleep(2000);
		Dashclickpage.click();
		return new DashBoardPage(driver);

	}
	public SectionPage SectionClick() {
		Section.click();
		return new SectionPage(driver);

	}
	public void ContentPage () {
		Contents.click();
	}
	public void RecieptPage () {
		Reciepts.click();
	}

	public void ExpensesPage () {
		Expenses.click();
	}
	public AddExpensesPage AddExpenses() throws InterruptedException {
		Thread.sleep(2000);
		AddExpensesTab.click();
		return new AddExpensesPage(driver);
	}
	public ListExpensesPage ListExpenses() throws InterruptedException {
		Thread.sleep(2000);
		ListExpensesTab.click();
		return new ListExpensesPage(driver);
	}

	public AddContentsPage AddContent() throws InterruptedException {
		Thread.sleep(2000);
		AddContent.click();
		return new AddContentsPage(driver);
	}
	public ViewContentPage ViewContent() throws InterruptedException {
		Thread.sleep(2000);
		ViewContent.click();
		return new ViewContentPage(driver);
	}
	public AddRecieptPage AddReciept() throws InterruptedException {
		Thread.sleep(2000);
		AddReciept.click();
		return new AddRecieptPage(driver);
	}
	public ViewRecieptPage ViewReciept() throws InterruptedException {
		Thread.sleep(2000);
		ViewReciept.click();
		return new ViewRecieptPage(driver);
	}
	public void Logout() throws Exception {
		Thread.sleep(2000);
		Logout.click();
		BaseUtility bu = new BaseUtility();
		bu.WaitForVisibility(driver, Logout, 10);
	}
	public void UsersTab() {
		users.click();
	}
	public AddUserPage AddUser() throws InterruptedException {
		Thread.sleep(2000);
		AddUser.click();
		return new AddUserPage(driver);
	}
	public ListTenantsPage ListTenants() throws InterruptedException  {
		Thread.sleep(2000);
		ListTenants.click();
		return new ListTenantsPage(driver);
	}
	public ListStaffPage ListStaff()  {
		ListStaff.click();
		return new ListStaffPage(driver);
	}
	public ListResidentsPage ListResidents() throws InterruptedException  {
		Thread.sleep(2000);
		ListResidents.click();
		return new ListResidentsPage(driver);
	}
}
