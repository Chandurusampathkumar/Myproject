package gsr.Qbend.Admin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import gsr.Qbend.ActionLib.QBactionLib;
import gsr.Qbend.Common.CommonFunction;
import gsr.Qbend.TransactionLib.GiftCard;

public class CreateGiftCard {
	
	public static WebDriver Driver;
	QBactionLib QBA=new QBactionLib();
	CommonFunction comm=new CommonFunction();
	
@Test(priority=1)
public void ToSearchGiftcard() throws Exception
{
	try
	{
//----------------TO search the giftcard, and  edit gift card------------ 
		comm.LoginQbend();
		QBA.Explicitwait(GiftCard.GiftcardMB);
		QBA.clickButton(GiftCard.GiftcardMB);
		QBA.Explicitwait(GiftCard.GiftcardNo);
		QBA.setText(GiftCard.GiftcardNo,"BARGC003");
		QBA.clickButton(GiftCard.GiftcardSB);
		QBA.Explicitwait(GiftCard.GiftcardEditLink);
		QBA.clickButton(GiftCard.GiftcardEditLink);
		//--Editing field not written
		QBA.Explicitwait(GiftCard.GiftcardEditLinkSubmitB);
		QBA.clickButton(GiftCard.GiftcardEditLinkSubmitB);
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
/*		
//-----------After clicking Uploadgift link, below code with NO condition(with product gc and format gc)---inside uploadgiftcard link-----------------------
public void ToUploadGiftCard() throws Exception
{
	try
	{
		
		QBA.Explicitwait(GiftCard.GiftcardMB);
		QBA.clickButton(GiftCard.GiftcardMB);
		QBA.Explicitwait(GiftCard.GiftcardUpload);
		QBA.clickButton(GiftCard.GiftcardUpload);
		QBA.Explicitwait(GiftCard.GiftcardUploadNoRadioB);
		QBA.clickButton(GiftCard.GiftcardUploadNoRadioB);
		QBA.setText(GiftCard.GiftcardUploadProductid,"342213");
		QBA.clickButton(GiftCard.GiftcardUploadProductGC);
		//QBA.clickButton(GiftCard.GiftcardUploadFormateGc);
		//------need to browse the file-------------
		//QBA.ClickLink(GiftCard.GiftcardDownloadGiftCardTemplate);
		//QBA.clickButton(GiftCard.GiftcardUploadPreview);
		
//----------------WIth Yes condition-----------------------------------------------------------------
		
		//QBA.Explicitwait(GiftCard.GiftcardMB);
		//QBA.clickButton(GiftCard.GiftcardMB);
		//QBA.Explicitwait(GiftCard.GiftcardUpload);
		//QBA.clickButton(GiftCard.GiftcardUpload);
		//QBA.Explicitwait(GiftCard.GiftcardUploadNoRadioB);
		QBA.clickButton(GiftCard.GiftcardUploadyesRadioB);
		QBA.Explicitwait(GiftCard.GiftcardSiteName);
		QBA.setText(GiftCard.GiftcardSiteName,"Qbend");
		QBA.clickButton(GiftCard.GiftcardUploadSearchB);
		String Parentwindow=Driver.getWindowHandle();
		for(String popup:Driver.getWindowHandles())
		{
			QBA.Explicitwait(GiftCard.GIftcardPopupSubmitB);
			QBA.clickButton(GiftCard.GiftcardPopupRadioB);
			QBA.clickButton(GiftCard.GIftcardPopupSubmitB);
		}
		
		QBA.Explicitwait(GiftCard.GiftcardUploadProductid);
		QBA.setText(GiftCard.GiftcardUploadProductid, "235465");
		QBA.clickButton(GiftCard.GiftcardUploadProductGC);
		//QBA.clickButton(GiftCard.GiftcardUploadFormateGc);
		//------need to browse the file-------------
		//QBA.ClickLink(GiftCard.GiftcardDownloadGiftCardTemplate);
		//QBA.clickButton(GiftCard.GiftcardUploadPreview);
		
//-----------------------------with no or yes conditin and Exclude GC----
		
		QBA.clickButton(GiftCard.GiftcardUploadExcludeGc);
		
 
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
*/
}
