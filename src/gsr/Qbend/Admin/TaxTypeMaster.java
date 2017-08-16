package gsr.Qbend.Admin;

public class TaxTypeMaster 
{
	
	//Admin - Tax type master button
	public String TaxTypeMasterB = "//*[@id='ctl00_ContentPlaceHolder1_hltaxtype']";
	
	//Tax type master - Tax type name text box
	public String TaxTypeMasterTaxTypeName = "//*[@id='ctl00_ContentPlaceHolder1_txtTaxType']";
			
	//Tax type master - Tax display name text box		
    public String TaxTypeMasterTaxDisplayName = "//*[@id='ctl00_ContentPlaceHolder1_txttaxdisplay']";
    
    //Tax type master - active check box
    public String TaxTypeMasterActiveCheckBox = "//*[@id='ctl00_ContentPlaceHolder1_ChkTaxTypeActive']";
    
    //Tax type master - submit button
    public String TaxTypeMasterSubmitB = "//*[@id='ctl00_ContentPlaceHolder1_btnSubmit']";
    
    //Tax type master - reset button
    public String TaxTypeMasterRestB = "//*[@id='ctl00_ContentPlaceHolder1_btnRest']";
    
  //Tax type master - edit
    public String TaxTypeEdit = "//*[@id='ctl00_ContentPlaceHolder1_GrdTaxType_ctl12_imgEditTaxdet']";
   
    //Tax edit- add button 
    public String TaxTypeEditAddB = "//*[@id='ctl00_ContentPlaceHolder1_GrdTaxType_ctl12_imgUpdTaxdet']";

  //Tax Type edit check box
    public String TaxtypeEditTB = "//*[@id='ctl00_ContentPlaceHolder1_GrdTaxType_ctl12_lblEditTaxTypeName']";
}
