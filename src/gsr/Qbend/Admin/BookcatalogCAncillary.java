package gsr.Qbend.Admin;
import gsr.Qbend.ActionLib.QBactionLib;
import gsr.Qbend.Common.CommonFunction;
import gsr.Qbend.TransactionLib.BookCatalogAncillary;
import gsr.Qbend.TransactionLib.BookCatalogContentUnit;
import gsr.Qbend.TransactionLib.Bookcataloger;
import gsr.Qbend.util.AppConstant;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BookcatalogCAncillary {
	
	static QBactionLib QBA = new QBactionLib();
	CommonFunction Comm =new CommonFunction();

	
	
	@Test(priority = 02)
	public void ValidContentAncillary() throws Exception
	{
		try
		{
			Comm.LoginQbend();
			QBA.Explicitwait(Bookcataloger.Bookcatalog);
			QBA.clickButton(Bookcataloger.Bookcatalog);
			QBA.Explicitwait(BookCatalogContentUnit.SubmitBforsearch);
			QBA.setText(BookCatalogContentUnit.SearchBook,AppConstant.SearchContent_Title );
			QBA.clickButton(BookCatalogContentUnit.SubmitBforsearch);
			Thread.sleep(3000);
			QBA.Explicitwait(BookCatalogContentUnit.serachbookrightclick);
			QBA.clickButton(BookCatalogContentUnit.serachbookrightclick);
			QBA.MouseRightClick(BookCatalogContentUnit.Mouseposition, BookCatalogContentUnit.MouseMenuOptionADDContent);
			Thread.sleep(3000);
			QBA.Explicitwait(BookCatalogContentUnit.BookUnitContent);
			QBA.clickButton(BookCatalogContentUnit.BookUnitContent);
			
			QBA.clickButton(BookCatalogAncillary.BookAncillaryAddB);
			QBA.Explicitwait(BookCatalogAncillary.BookAncillaryConTitle);
			QBA.setText(BookCatalogAncillary.BookAncillaryConTitle,AppConstant.Ancillary_TitleName);
			
			QBA.setText(Bookcataloger.SubTitle, "Gsr SubTitle");
			QBA.setText(BookCatalogAncillary.BookAncillaryContentorder, "22");
			QBA.setText(BookCatalogContentUnit.BookcontentUnitProductID, AppConstant.Ancillary_ProductID);
			QBA.clickButton(Bookcataloger.Authorplus);
			for(String popup :QBactionLib.Driver.getWindowHandles())
			{
				QBactionLib.Driver.switchTo().window(popup);
				QBA.setText(Bookcataloger.popsearch, "gsr_test");
				QBA.clickButton(Bookcataloger.popsearchButt);
				QBA.Explicitwait(Bookcataloger.authourCB);
				QBA.clickButton(Bookcataloger.authourCB);
				QBA.clickIDButton(Bookcataloger.ContentpopOkButt);
			}
			QBA.setText(BookCatalogAncillary.BookAncillaryNoofpages, "30");
			QBA.clickButton(BookCatalogAncillary.BookAncillaryFree);
			QBA.clickButton(BookCatalogAncillary.BookAncillaryAvailableinstore);
			QBA.clickButton(Bookcataloger.ContentabSubmitButton);;
	      
//-------------Others are common functionality of book catalog module-----------------------------------
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Assert.assertTrue(false);
			
		}
	}
	@Test (priority = 04)
	public void VaildBookContentTab() throws Exception {
		try {
	          Comm.ContentTab();
	      	
	          
		}catch (Exception e) {
			e.printStackTrace();

		}
	}
	@Test (priority = 05)
	public void VaildBookFileLocationTab() throws Exception {
		try {
	          Comm.BookFileTabwithepup();
	         
	          
		}catch (Exception e) {
			e.printStackTrace();

		}
	}
	@Test (priority = 06)
	public void VaildBookPricingTab() throws Exception {
		try {
	          Comm.PricingTab();
	                
		}catch (Exception e) {
			e.printStackTrace();

		}
	}
	@Test (dependsOnMethods = "VaildBookPricingTab")
	public void Close() throws Exception {
		try {
	          Comm.CloseBrowser();
	          
		}catch (Exception e) {
			e.printStackTrace();

		}
	}
	
}
