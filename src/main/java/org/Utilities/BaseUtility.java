package org.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtility {
	private static final String FileUtilis = null;
	public static  WebDriver driver;
	
	public WebDriver Startup(String Bname,String  url) {

		if(Bname.equalsIgnoreCase("ch") ||
				Bname.equalsIgnoreCase("Chrome")) {
	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}else if 
		(Bname.equalsIgnoreCase("ff")  || 
				Bname.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if
		(Bname.equalsIgnoreCase("ed") ||
				Bname.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else {
			System.out.println("no driver Found");


		}
		driver.get(url);
		return driver;



	}
	public void WaitForVisibility(WebDriver driver,WebElement ele,int Time) {
		WebDriverWait wt =new WebDriverWait(driver,Duration.ofSeconds(Time));
		wt.until(ExpectedConditions.visibilityOf(ele));
	}
	public static void ClickbyJs(WebDriver driver,WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click;", ele);
		
	}
	public static void DateByJs(WebDriver driver,WebElement ele,String Datevalue) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+Datevalue+"');", Datevalue);
	}
	public static String screenShot(WebDriver driver, String filename) {
		String dateName = new SimpleDateFormat("dd-MM-yy HH-mm-ss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\ScreenShots\\ScreenShot" + filename + "_" + dateName + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;
	}
	@BeforeSuite
	public void log4j() {
		DOMConfigurator.configure("log4j.xml");
		
	}
	
	public static void  FileUpload(WebDriver driver,WebElement Ele,String FilePath) throws InterruptedException {
		try {
			Thread.sleep(2000);
			Runtime.getRuntime().exec(FilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	
}

