package gsr.Qbend.Admin;

import gsr.Qbend.ActionLib.QBactionLib;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class EditGiftTypeName extends GiftShipMasterModule
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
			
			QBA.clickButton(GiftshipmasterTedtDataEdit);
			QBA.ClearText(Giftshiptypename);
			QBA.setText(Giftshiptypename, "TestData");
			QBA.clickButton(GiftShipMasterUpdateB);
		}
		catch(Exception e)
		{
			
		}
		return true;
	}

}
