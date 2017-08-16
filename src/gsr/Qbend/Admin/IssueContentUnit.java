package gsr.Qbend.Admin;

import gsr.Qbend.ActionLib.QBactionLib;
import gsr.Qbend.Common.CommonFunction;
import gsr.Qbend.TransactionLib.BookCatalogContentUnit;
import gsr.Qbend.TransactionLib.Bookcataloger;
import gsr.Qbend.util.AppConstant;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IssueContentUnit {

	static QBactionLib QBA = new QBactionLib();
	CommonFunction Comm =new CommonFunction();

	@Test(priority = 01)
	public void QbendMain() throws Exception
	{
		try
		{
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
@Test(priority = 02)
	public void VaildIssueContentUnit() throws Exception
		  {
			try
			{
				Comm.LoginQbend();
				QBA.Explicitwait(Bookcataloger.Bookcatalog);
				QBA.clickButton(Bookcataloger.Bookcatalog);
				QBA.Explicitwait(BookCatalogContentUnit.SubmitBforsearch);
				QBA.setText(BookCatalogContentUnit.SearchBook,AppConstant.SearchIssue_Title);
				QBA.clickButton(BookCatalogContentUnit.SubmitBforsearch);
				Thread.sleep(3000);
				QBA.Explicitwait(BookCatalogContentUnit.serachbookrightclick);
				QBA.clickButton(BookCatalogContentUnit.serachbookrightclick);
				QBA.MouseRightClick(BookCatalogContentUnit.Mouseposition, BookCatalogContentUnit.MouseMenuOptionADDContent);
				Thread.sleep(3000);
		        QBA.Explicitwait(BookCatalogContentUnit.BookUnitContent);
				QBA.clickButton(BookCatalogContentUnit.BookUnitContent);
				QBA.Explicitwait(BookCatalogContentUnit.IssueAddUnit);
				QBA.clickButton(BookCatalogContentUnit.IssueAddUnit);
				Thread.sleep(3000);
				QBA.Explicitwait(BookCatalogContentUnit.BookCatalogContentTitleid);
				QBA.setText(BookCatalogContentUnit.BookCatalogContentTitleid,AppConstant.Content_TitleName);
				
			
				//---------Others are common function from book catalog module-------
				
				}
				catch(Exception e)
				{
					e.printStackTrace();
					Assert.assertTrue(false);
				}
			
				
			  }
		@Test(priority = 03)
		public void VaildContentUnitTab() throws Exception {
			try {
				QBA.Explicitwait(Bookcataloger.ContentTab);
				QBA.clickButton(Bookcataloger.ContentTab);
				QBA.setText(Bookcataloger.SubTitle, "Gsr SubTitle");
				QBA.setText(BookCatalogContentUnit.BookcontentUnitProductID, AppConstant.IssueUnit_productID);
				QBA.setText(BookCatalogContentUnit.BookunitNoofpages, "20");
				QBA.setText(BookCatalogContentUnit.BookunitChapterNo, "22");
				QBA.clickButton(Bookcataloger.Authorplus);
				for(String popup :QBactionLib.Driver.getWindowHandles())
				{
					QBactionLib.Driver.switchTo().window(popup);
					Thread.sleep(2000);
					QBA.setText(Bookcataloger.popsearch, "gsr_test");
					QBA.clickButton(Bookcataloger.popsearchButt);
					QBA.Explicitwait(Bookcataloger.authourCB);
					QBA.clickButton(Bookcataloger.authourCB);
					QBA.clickIDButton(Bookcataloger.ContentpopOkButt);
				}
				
				QBA.clickButton(Bookcataloger.PurchaseCB);
				QBA.clickButton(Bookcataloger.RentCB);
				//QBA.clickButton(Bookcataloger.AvilableStoreCB);
				QBA.clickButton(Bookcataloger.SnapCB);
				QBA.clickButton(Bookcataloger.ContentabSubmitButton);
				QBA.Explicitwait(BookCatalogContentUnit.ContentUnitsuccessfulMsg);
		          
			}catch (Exception e) {
				e.printStackTrace();
				Assert.assertTrue(false);
		
			}
		}
		@Test(priority = 04)
		public void VaildContentFilelocationTab() throws Exception {
			try {
		          Comm.IssueContentunitFileTabwithepup();
		          
			}catch (Exception e) {
				e.printStackTrace();
		
			}
		}
		@Test(priority = 05)
		public void VaildContentPricingTab() throws Exception {
			try {
		          Comm.PricingTab();
		          
			}catch (Exception e) {
				e.printStackTrace();
		
			}
		}
		@Test (dependsOnMethods = "VaildContentPricingTab")
		public void Close() throws Exception {
			try {
				 
		          Comm.CloseBrowser();
		          
			}catch (Exception e) {
				e.printStackTrace();

			}
		}

}
