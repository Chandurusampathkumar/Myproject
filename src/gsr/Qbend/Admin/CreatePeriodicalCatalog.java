package gsr.Qbend.Admin;

import org.testng.annotations.Test;
import gsr.Qbend.ActionLib.QBactionLib;
import gsr.Qbend.Common.CommonFunction; 
import gsr.Qbend.TransactionLib.PeriodicalCatalog;

public class CreatePeriodicalCatalog {

	static QBactionLib QBA=new QBactionLib();
	CommonFunction Comm=new CommonFunction();

	@Test
		public void ValidPeriodical() throws Exception
		{
			try
			{
			Comm.LoginQbend();
			QBA.Explicitwait(PeriodicalCatalog.PeriodicalCatalogMB);
			QBA.clickButton(PeriodicalCatalog.PeriodicalCatalogMB);
			QBA.Explicitwait(PeriodicalCatalog.PeriodicalCatalogAddNewJournal);
			QBA.clickButton(PeriodicalCatalog.PeriodicalCatalogAddNewJournal);
			QBA.Explicitwait(PeriodicalCatalog.PeriodicalCatalogJournalName);
			QBA.setText(PeriodicalCatalog.PeriodicalCatalogJournalName,"12wq123testinggsr");
			QBA.setText(PeriodicalCatalog.PeriodicalCatalogISSNno,"12138eu3");
			QBA.setText(PeriodicalCatalog.PeriodicalCatalogPublisherName,"Qbend , USA");
			QBA.clickButton(PeriodicalCatalog.PeriodicalCatalogEditorPlus);
			for(String popup :QBactionLib.Driver.getWindowHandles())
			{
				QBactionLib.Driver.switchTo().window(popup);
				QBA.Explicitwait(PeriodicalCatalog.PopupEditorName);
				QBA.setText(PeriodicalCatalog.PopupEditorName,"A&M Brother");
				QBA.clickButton(PeriodicalCatalog.PopupEditorSearch);
				QBA.Explicitwait(PeriodicalCatalog.PopupEditorAMCB);
				QBA.clickButton(PeriodicalCatalog.PopupEditorAMCB);
				QBA.clickButton(PeriodicalCatalog.PopupEditorOkB);
				
			}
			QBA.Explicitwait(PeriodicalCatalog.PeriodicalCatalogNoOfIssues);
			QBA.setText(PeriodicalCatalog.PeriodicalCatalogNoOfIssues,"5");
			QBA.clickButton(PeriodicalCatalog.PeriodicalCatalogActiveCB);
			QBA.clickButton(PeriodicalCatalog.PeriodicalCatalogActiveSubscription);
			QBA.setText(PeriodicalCatalog.PeriodicalCatalogProductId,"2109912");
			QBA.setText(PeriodicalCatalog.PeriodicalCatalogSeries, "5");
			QBA.setText(PeriodicalCatalog.PeriodicalCatalogAudienceAgeMinimum,"18");
			QBA.setText(PeriodicalCatalog.PeriodicalCatalogAudienceMaximum,"39");
			QBA.setText(PeriodicalCatalog.PeriodicalCatalogGradeMinimum,"9");
			QBA.setText(PeriodicalCatalog.PeriodicalCatalogGradeMaximum,"35");
	
			QBA.clickButton(PeriodicalCatalog.PeriodicalCatalogContentAvaliabilityB);
			for(String popup :QBactionLib.Driver.getWindowHandles())
			{
				QBactionLib.Driver.switchTo().window(popup);
				QBA.clickButton(PeriodicalCatalog.PeriodicalCatalogGlobalCB);
				QBA.clickButton(PeriodicalCatalog.PeriodicalCatalogContentOkB);
				
			}
			QBA.clickButton(PeriodicalCatalog.PeriodicalCatalogSubmitB);
			QBA.Explicitwait(PeriodicalCatalog.JournalKeywordTab);
		//----------------------------------------------journal keywordtab-----------	
			QBA.clickButton(PeriodicalCatalog.JournalKeywordTab);
			QBA.Explicitwait(PeriodicalCatalog.JournalKeywordTabContent);
			QBA.setText(PeriodicalCatalog.JournalKeywordTabContent,"testifffwfn");
			QBA.clickButton(PeriodicalCatalog.JournalKeywordTabSubmitB);
			QBA.Explicitwait(PeriodicalCatalog.ContentKeywordAlert);
		
		//-------------------------Content role map tab--------------------------------------	
			//QBA.Explicitwait(PeriodicalCatalog.ContentRoleMapTab);
			QBA.clickButton(PeriodicalCatalog.ContentRoleMapTab);
			QBA.Explicitwait(PeriodicalCatalog.ContentTabRoleNameDD);
			QBA.selectListValue(PeriodicalCatalog.ContentTabRoleNameDD, "Analysis");
			QBA.setText(PeriodicalCatalog.ContentTabXpath, "rrerff-rfe-csv");
			QBA.clickButton(PeriodicalCatalog.ContentTabXmlParts);
			QBA.clickButton(PeriodicalCatalog.ContentTabActiveCb);
			QBA.clickButton(PeriodicalCatalog.ContentTabEditLink);
			QBA.Explicitwait(PeriodicalCatalog.ContentKeywordAlert);
			
		//--------------------------Journal file location-----------------------------------	
			QBA.clickButton(PeriodicalCatalog.JournalFileLocationTab);
			QBA.selectListValue(PeriodicalCatalog.FileLocationTabFileTypeDD, "ePub");
			QBA.setText(PeriodicalCatalog.FileLocationTabResourceid,"21413");
			QBA.setText(PeriodicalCatalog.FileLocationTabISSN,"234444442");
			QBA.clickButton(PeriodicalCatalog.FileLocationTabAsubmitB);
			QBA.Explicitwait(PeriodicalCatalog.FileLocationAlert);
			QBA.selectListValue(PeriodicalCatalog.FileLocationTabSelectFileTypeDD, "ePub");
			QBA.clickButton(PeriodicalCatalog.FileLocationTabDRMDisplayCB);
			QBA.clickButton(PeriodicalCatalog.FileLocationTabDRMrelativeRB);
			QBA.setText(PeriodicalCatalog.FileLocationTabEvery,"23");
			QBA.selectListValue(PeriodicalCatalog.FileLocationTabSecondsDD,"Minute(s)");
			QBA.clickButton(PeriodicalCatalog.FileLocationTabDRMCopyCB);
			QBA.setText(PeriodicalCatalog.FileLocationTabSelection, "34");
			QBA.setText(PeriodicalCatalog.FileLocationTabEvery,"32");
			QBA.selectListValue(PeriodicalCatalog.FileLocationTabcopySecondsDD,"Hour(s)");
			QBA.clickButton(PeriodicalCatalog.FileLocationTabPrintCB);
			QBA.setText(PeriodicalCatalog.FileLocationTabPage,"34");
			QBA.setText(PeriodicalCatalog.FileLocationTabprintsEvery,"32");
			QBA.selectListValue(PeriodicalCatalog.FileLocationTabPrintsSecondsDD,"Day(s)");
			QBA.clickButton(PeriodicalCatalog.FileLocationTabDRMSubmitB);
			QBA.Explicitwait(PeriodicalCatalog.DRMLabelAlert);
			
		//------------------journal price tab-------------------------------------------------	
			QBA.clickButton(PeriodicalCatalog.JournalPriceTab);
			QBA.selectListValue(PeriodicalCatalog.JournalPriceTabFileFormatDD,"ePub");
			QBA.selectListValue(PeriodicalCatalog.JournalPriceTabLocationDD, "India");
			QBA.selectListValue(PeriodicalCatalog.JournalPriceTabCurrencyDD, "India, Rupees");
			QBA.selectListValue(PeriodicalCatalog.JournalPriceTabSaleTypeDD, "Subscribe");
			QBA.selectListValue(PeriodicalCatalog.JournalPriceTabUnitTypeDD, "Month(s)");
			QBA.setText(PeriodicalCatalog.JournalPriceTabUnitValue,"57");
			QBA.setText(PeriodicalCatalog.JournalPriceTabUnitPrice,"78");
			QBA.setText(PeriodicalCatalog.JournalPriceTabListPrice,"45");
			QBA.clickButton(PeriodicalCatalog.JournalPriceTabActiveCB);
			QBA.ClickLink(PeriodicalCatalog.JournalPriceTabEditLink);
			
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
