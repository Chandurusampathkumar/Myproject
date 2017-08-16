package gsr.Qbend.Admin;
import gsr.Qbend.ActionLib.QBactionLib;
import gsr.Qbend.Common.CommonFunction;
import gsr.Qbend.TransactionLib.PublisherBookCatalog;

import org.testng.annotations.Test;

public class CreatePublisherBookCatalog {
	

	QBactionLib QBA=new QBactionLib();
	CommonFunction Comm =new CommonFunction();
	
@Test
public void ValidPublisherBookCatalog() throws Exception
{
	try
	{
		Comm.LoginQbend();
		QBA.Explicitwait(PublisherBookCatalog.publisherbookcatalogMainpageB);
		QBA.clickButton(PublisherBookCatalog.publisherbookcatalogMainpageB);
		QBA.Explicitwait(PublisherBookCatalog.searchpublisherB);
		QBA.clickButton(PublisherBookCatalog.searchpublisherB);
	
		QBA.Explicitwait(PublisherBookCatalog.publisherPopUpSubmitB);
		for(String popup:QBactionLib.Driver.getWindowHandles())
		{
			QBactionLib.Driver.switchTo().window(popup);
			QBA.Explicitwait(PublisherBookCatalog.publisherPopUpSubmitB);
			QBA.setText(PublisherBookCatalog.publisherPopupPublishername,"gsrtest 21");
			QBA.clickButton(PublisherBookCatalog.publisherPopupFilterB);
			//QBA.setText(PublisherBookCatalog.publisherPopupPublishername,"Qbend");
			//QBA.clickButton(PublisherBookCatalog.publisherPopupFilterB);
			//QBA.clickButton(PublisherBookCatalog.publisherPopupRD);
			//QBA.clickButton(PublisherBookCatalog.publisherPopupBotSubmitB);
			
		}
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	
	
}

	
}
