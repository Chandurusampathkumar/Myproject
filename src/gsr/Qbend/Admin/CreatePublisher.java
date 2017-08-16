package gsr.Qbend.Admin;

import gsr.Qbend.ActionLib.QBactionLib;
import gsr.Qbend.Common.CommonFunction;
import gsr.Qbend.TransactionLib.Publisher;
import gsr.Qbend.util.AppConstant;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatePublisher 
{

	QBactionLib QBA = new QBactionLib();
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
	public void ValidPublisher() throws Exception
	{
  
		 try
		 {
			 	Comm.LoginQbend();	
				QBA.Explicitwait(Publisher.publisherMB);
				QBA.clickButton(Publisher.publisherMB);
				QBA.Explicitwait(Publisher.publisherAdd);
				QBA.clickButton(Publisher.publisherAdd);
				QBA.Explicitwait(Publisher.publisherAddB);
				QBA.setText(Publisher.PublisherName,AppConstant.PUBLISHER_NAME);
				QBA.setText(Publisher.publisherDiv, "US");
				QBA.setText(Publisher.publisherAddress,"10 downtown US");
				QBA.setText(Publisher.publisherMobileno,"9823541132");
				QBA.setText(Publisher.publisherContactname,"goodman");
				QBA.setText(Publisher.publisherAccountdetails,"9832942148948");
				QBA.setText(Publisher.publisherWebsiteaddress,"www.testfgh.com");
				QBA.setText(Publisher.publisherAdvertistingurl,"www.greatyu.com");
				QBA.clickButton(Publisher.publisherRedirectCB);
				QBA.clickButton(Publisher.publisherEnableredirection);
				QBA.clickButton(Publisher.publisherStoreActive);
				
				//-------------SNAP SITTING------------------------------
				QBA.setText(Publisher.publishersnapShortname,AppConstant.P_SHORTNAME);
				QBA.setText(Publisher.publisherSnapEmail,"gsr235y@yopmail.com");
				QBA.setText(Publisher.publisherContactInfo, "testing grs");
				QBA.clickButton(Publisher.publisherShowpart);
				QBA.setText(Publisher.publisherSnapXpath,"wdqdqqwqq");
				QBA.setText(Publisher.publisherSnapPermissionforurl,"www.hifi.com");
				QBA.setText(Publisher.publisherUserUploadUrl,"www.useruploadurl");
				QBA.setText(Publisher.publisherdesignUrl,"www.design.com");
				QBA.clickButton(Publisher.publisherSnapActiveCB);
				QBA.clickButton(Publisher.publisherSnapPublicaccess);
				QBA.setText(Publisher.publisherSnapurl,"www.testingsample.com");
				QBA.clickButton(Publisher.publisherSnapSubmitB);
				
				//-----------SNAP LOCALIZATION--------------------------
				Thread.sleep(1000);
				QBA.selectListValue(Publisher.publisherLanguageTitleDD,"Bengali (India)");
				//QBA.setText(Publisher.publisherLanguageDisplay, "Bengali(India)");
				QBA.clickButton(Publisher.publisherLocalizationIsDefaultActive);
				QBA.clickButton(Publisher.publisherLocalizationActive);
				QBA.clickButton(Publisher.publisherAddB);
				
				//-------------Inside table site sitting----------------
				QBA.setText(Publisher.PublisherSiteUrl,"www.samplegsr.com");
				QBA.selectListValue(Publisher.publisherCurrencyDD,"India, Rupees");
				QBA.clickButton(Publisher.publisherPayment);
				QBA.setText(Publisher.publisherTheme,"gsrsample");
				QBA.selectListValue(Publisher.publisherDefaultLanguage,"US English(English)");
				QBA.ClickLink(Publisher.publisherTableEdit);
				
				//---------------SNAP Site Mapping
				QBA.setText(Publisher.publisherTableSiteUrl,"www.sample56.com");
				QBA.clickButton(Publisher.publisherTableSnapEdit);
				
				 
								
		 }catch(Exception e)
		 {
			 e.printStackTrace();
			 Assert.assertTrue(false);
		 }
		}
	
	@Test(dependsOnMethods = "ValidPublisher")
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
