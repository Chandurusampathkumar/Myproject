package gsr.Qbend.Admin;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import gsr.Qbend.Admin.*;

import org.testng.annotations.Test;

public class SpeedTaxServiceLogViewInformation 
{
QBactionLib QBA = new QBactionLib();
	
	@Test
	public void ViewInformation() throws Exception
	{
		try
		{
			String RFile = "F:\\MyProject\\Qbend\\DataQbend.properties" ;
			FileInputStream in = new FileInputStream(new File(RFile));
			Properties pro = new Properties(); 
			pro.load(in);
			
			String  FDate = pro.getProperty("SpeedTaxFromDate");
			String  TDate = pro.getProperty("SpeedTaxToDate");
			QBA.setText(SpeedTaxService.SpeedtaxserviceFromdate, FDate);
			QBA.setText(SpeedTaxService.SpeedtaxserviceTodate, TDate);
			QBA.clickButton(SpeedTaxService.SpeedtaxserviceSearchB);
		}
		catch(Exception e)
		{
		}
		
		}
}

