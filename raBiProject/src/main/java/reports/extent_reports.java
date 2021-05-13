package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import resources.base_class;

public class extent_reports extends base_class
{
	static ExtentReports extent_report;
	
	public static ExtentReports get_reportObject()
	{
		//Creating Reports
		String report_path = System.getProperty("user.dir")+"\\Extent_Reports\\index.html";
		//project report location, in .html extension
		ExtentSparkReporter reporter = new ExtentSparkReporter(report_path); 
		
		//report name
		String reportName = properties.getProperty("reportName");
		reporter.config().setReportName(reportName);
		
		//document title
		String document_title = properties.getProperty("documenttitle");
		reporter.config().setDocumentTitle(document_title);
		
		//setting theme
		reporter.config().setTheme(Theme.DARK);
		
		
	    extent_report = new ExtentReports();
		 
	    extent_report.attachReporter(reporter);
	    
	    return extent_report;
	}
}
