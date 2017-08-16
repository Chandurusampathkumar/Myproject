package gsr.Qbend.Admin;

import gsr.Qbend.ActionLib.QBactionLib;
import gsr.Qbend.Common.CommonFunction;
import gsr.Qbend.TransactionLib.BookCatalogContentUnit;
import gsr.Qbend.TransactionLib.BookCatalogIssue;
import gsr.Qbend.TransactionLib.Bookcataloger;
import gsr.Qbend.util.AppConstant;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookCatalogCIssue {
	//public static WebDriver Driver;

	QBactionLib QBA = new QBactionLib();
	CommonFunction Comm =new CommonFunction();

	

	@Test(priority = 02)
	public void VaildContentIssus() throws Exception {
		try {
			
			Comm.LoginQbend();
			QBA.Explicitwait(BookCatalogContentUnit.BookcatalogMain);
			QBA.clickButton(BookCatalogContentUnit.BookcatalogMain);
			QBA.Explicitwait(BookCatalogContentUnit.BookCatalogAddNewbookB);
			QBA.clickButton(BookCatalogContentUnit.BookCatalogAddNewbookB);
			QBA.Explicitwait(BookCatalogIssue.BookCatalogIssueContentType);
			//
			QBA.selectListValue(BookCatalogIssue.BookCatalogIssueContentType,"Journal Issue");
			Thread.sleep(3000);

			try { // String mainWindowHandle=Driver.getWindowHandle();
				System.out.println("Popup");
				Comm.checkAlert();
				// Driver.switchTo().window( mainWindowHandle );
				System.out.println("Done");
			} catch (Exception e) {
				e.printStackTrace();
			}
			Thread.sleep(2500);
			QBA.Explicitwait(BookCatalogIssue.BookCatalogIssueTitle);
			QBA.setText(BookCatalogIssue.BookCatalogIssueTitle,AppConstant.Issue_NAME);
			QBA.setText(BookCatalogIssue.BookCatalogIssueNoOfPages, "56");
			QBA.setText(BookCatalogIssue.BookCatalogIssueVolume, "2");
			QBA.setText(BookCatalogIssue.BookCatalogIssueNo, "2232");
			QBA.setText(BookCatalogIssue.BookCatalogIssueIssnNo, "234234");
			QBA.setText(BookCatalogIssue.BookcatalogIssueProductID, AppConstant.JOURNAL_PRODUCTID);
			QBA.clickButton(BookCatalogIssue.BookcatalogIssueDatepicker);
			QBA.Explicitwait(BookCatalogIssue.Issuedateselect);
			QBA.clickButton(BookCatalogIssue.Issuedateselect);
			//QBA.setText(BookCatalogIssue.BookCatalogIssueDate, "2014/8/5");
			//QBA.clickButton(BookCatalogIssue.BookCatalogIssueSpecialIssue);
			QBA.setText(BookCatalogIssue.BookcatelogIssueAudienceageMin, "18");
			QBA.setText(BookCatalogIssue.BookcatelogIssueAudienceAgeMax, "100+");
			QBA.setText(BookCatalogIssue.BookcatelogIssueGradeMin, "25");
			QBA.setText(BookCatalogIssue.BookcatelogIssueGradeMax, "75");
			QBA.setText(BookCatalogIssue.BookcatelogIssueSeries, "Qbend Series");
			QBA.setText(BookCatalogIssue.BookcatelogIssuecustomData, "Qbend Custom Data");
			QBA.setText(BookCatalogIssue.BookcatalogIssueRoyaltypercent, "20%");
			QBA.clickButton(BookCatalogIssue.BookcatalogIssueActiveCB);
			QBA.clickButton(BookCatalogIssue.BookcatalogIssueAncillaryLogUnitSalesCB);
			QBA.clickButton(BookCatalogIssue.BookcatalogIssueSubscriptionCB);
			QBA.clickButton(BookCatalogIssue.BookcatalogIssueLogicalUnitSalesCB);
			
			QBA.clickButton(BookCatalogIssue.IssueContentAvailabiltyB);
			for(String popup :QBactionLib.Driver.getWindowHandles())
			{
				QBactionLib.Driver.switchTo().window(popup);
				QBA.clickButton(BookCatalogIssue.IssuepopGlobalAvailableCB);
				QBA.clickButton(BookCatalogIssue.IssuepopOkB);
				
			}
			QBA.clickButton(BookCatalogIssue.IssueSubmitB);
			

			// Others are common functionality of book catalog
			// module-------------------------------------
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false);

		}
		
	}

		
	@Test(priority = 03)
	public void VaildIssueContentTab() throws Exception {
		try {
	          Comm.ContentTab();
	          
		}catch (Exception e) {
			e.printStackTrace();

		}
	}
	@Test(priority = 04)
	public void VaildIssueFileLocationTab() throws Exception {
		try {
	          Comm.IssueFileTabwithepup();
	          
		}catch (Exception e) {
			e.printStackTrace();

		}
	}
	@Test(priority = 05)
	public void VaildIssuePricingTab() throws Exception {
		try {
	          Comm.PricingTab();
	          
		}catch (Exception e) {
			e.printStackTrace();

		}

	}
	@Test(dependsOnMethods = "VaildIssuePricingTab")
	public void BroserClose() throws Exception
	{
		try
		{
			Comm.CloseBrowser(); 
			}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
