package gsr.Qbend.Admin;

import gsr.Qbend.ActionLib.QBactionLib;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class AddGiftShipTypeName extends GiftShipMasterModule
{
	QBactionLib QBA = new QBactionLib();
	
	@Test
	public boolean AddGiftShipType() throws Exception
	{
		try
		{
			String RFile = "F:\\MyProject\\Qbend\\DataQbend.properties" ;
			FileInputStream in = new FileInputStream(new File(RFile));
			Properties pro = new Properties(); 
			pro.load(in);
			
			String  GiftTypeName = pro.getProperty("GiftShipTypeName");
			String  GiftDisplayName = pro.getProperty("GiftShipDisplayName");
			QBA.setText(Giftshiptypename, GiftTypeName);
			QBA.setText(Giftshipdisplayname, GiftDisplayName);
			QBA.clickButton(GiftshipmasteractiveCB);
			QBA.clickButton(GiftshipmastersubmitB);
		}
		catch(Exception e)
		{
			
		}
		return true;
	}

}
