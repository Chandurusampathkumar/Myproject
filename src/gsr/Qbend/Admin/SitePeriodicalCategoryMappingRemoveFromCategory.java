package gsr.Qbend.Admin;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class SitePeriodicalCategoryMappingRemoveFromCategory extends SitePeriodicalCategoryMapping
{
QBactionLib QBA = new QBactionLib();
	
	@Test
	public boolean RemoveFromCategory() throws Exception
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
			
			QBA.clickButton(SitePeriodicalCategoryMappingRightSideJournalCategoriesPlusSign);
			QBA.clickButton(SitePeriodicalCategoryMappingRemoveFromSiteData);
			QBA.clickButton(SitePeriodicalCategoryMappingRemoveFromSiteB);
		}
		catch(Exception e)
		{
			
		}
		return true;
	}
	

}
