package gsr.Qbend.Admin;

import org.testng.annotations.Test;

public class EditTaxType extends TaxTypeMaster 
{
QBactionLib QBA = new QBactionLib();
	
	@Test
	public boolean EditTax() throws Exception
	{
		try
		{
			QBA.clickButton(TaxTypeEditAddB);
			QBA.clickButton(TaxtypeEditTB);
			QBA.ClearText(TaxtypeEditTB);
			QBA.setText(TaxtypeEditTB, "GSR");
			QBA.clickButton(TaxTypeEditAddB);
			
		}
		
		catch (Exception e)
		{
			
			
		}
		return true;
		
	}

}
