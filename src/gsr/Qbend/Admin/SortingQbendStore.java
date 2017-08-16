package gsr.Qbend.Admin;

import org.testng.annotations.Test;

public class SortingQbendStore extends Sorting
{
QBactionLib QBA = new QBactionLib();
	
	@Test
	public boolean QbendStore() throws Exception
	{
		try
		{
			QBA.clickButton(SortingQbendStoreB);
			QBA.clickButton(SortingQbendStoresampleCategory);
			QBA.selectListValue(SortingQbendStoreSampleDD, "Published Date Z-A");
			QBA.clickButton(SortingQbendStoreSaveB);
		}
		catch(Exception e)
		{
			
		}
		return true;
	}

}
