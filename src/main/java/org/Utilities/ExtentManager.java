package org.Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	public static ExtentReports extent;
	public static ExtentTest test;
	public static  ExtentReports SetupExtent() {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy HH-mm-ss");
		Date date = new Date();
		String Actualdate=format.format(date);
		
		String ReportPath=System.getProperty("user.dir")+
				"/Reports/ExecutionReport_"+Actualdate+".html";
		ExtentSparkReporter sparkreport= new ExtentSparkReporter(ReportPath);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(sparkreport);
		
		sparkreport.config().setDocumentTitle("Automation Testing Report");
		sparkreport.config().setTheme(Theme.STANDARD);
		sparkreport.config().setReportName("Riddhi housing Society");
		extent.setSystemInfo("HostName", "tejas");
		extent.setSystemInfo("Project", "Riddhi Housing Society");
		extent.setSystemInfo("Tester", "Tejas M");
		extent.setSystemInfo("Browser", "Chrome");
		return extent;
	}
	public static ExtentReports Flushextent()  {
		return extent;
	}
	}
	
