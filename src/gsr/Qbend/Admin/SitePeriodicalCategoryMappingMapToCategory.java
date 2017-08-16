package gsr.Qbend.Admin;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class SitePeriodicalCategoryMappingMapToCategory extends SitePeriodicalCategoryMapping
{
QBactionLib QBA = new QBactionLib();
	
	@Test
	public boolean MapCategoryToSite() throws Exception
	{
		try
		{
			String RFile = "F:\\MyProject\\Qbend\\DataQbend.properties" ;
			FileInputStream in = new FileInputStream(new File(RFile));
			Properties pro = new Properties(); 
			pro.load(in);
			
			String  SiteName = pro.getProperty("SitePeriodicalCategoryMappingSiteName");
			QBA.setText(SitePeriodicalCategoryMappingSiteNameTB, SiteName);
			QBA.clickButton(SitePeriodicalCategoryMappingSearchB);
			
			QBA.clickButton(SitePeriodicalCategoryMappingLeftSideJournalCategoriesPlusSign);
			QBA.clickButton(SitePeriodicalCategoryMappingSampleDataToMapCB);
			QBA.clickButton(SitePeriodicalCategoryMappingEqualtoSymbolB);
			
		}
		catch(Exception e)
		{
			
		}
		return true;
	}
	

}
