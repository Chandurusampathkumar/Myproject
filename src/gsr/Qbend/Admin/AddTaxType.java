package gsr.Qbend.Admin;

import gsr.Qbend.ActionLib.QBactionLib;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class AddTaxType extends TaxTypeMaster 
{
	QBactionLib QBA = new QBactionLib();
	
	@Test
	public boolean AddTax() throws Exception
	{
		
		try
		{
			String RFile = "F:\\MyProject\\Qbend\\DataQbend.properties" ;
			FileInputStream in = new FileInputStream(new File(RFile));
			Properties pro = new Properties(); 
			pro.load(in);
			
			String  TType = pro.getProperty("TaxType");
			String  TDisplay = pro.getProperty("TaxDisplay");
			
			QBA.setText(TaxTypeMasterTaxTypeName, TType);
			QBA.setText(TaxTypeMasterTaxTypeName, TDisplay);
			QBA.clickButton(TaxTypeMasterActiveCheckBox);
			QBA.clickButton(TaxTypeMasterSubmitB);
			
			
		}
		catch(Exception e)
		{
			
		}
		return true;
		
	}

}
