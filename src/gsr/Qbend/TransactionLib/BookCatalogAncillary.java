package gsr.Qbend.TransactionLib;

public class BookCatalogAncillary {
	
	//click BookCatalog module
   public static String BookcatalogMain=".//*[@id='ctl00_ContentPlaceHolder1_HyLBooks']";
	
	//Inside create new or edit book click content 
     public static String BookAncillaryContent=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_UpdatePanel1']/a/img";
	                                            
     //Click Add Ancillary content
	public static String BookAncillaryAddB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_lnkAncillary']";
	                                        
	//Enter content title for ancillary
	public static String BookAncillaryConTitle=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtContentTitle']";
	                                         
	//Content order

	public static String BookAncillaryContentorder = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtContentOrder']";

	//No of pages
	public static String BookAncillaryNoofpages =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtNoofPages']";

	//Content Distribution options
	//Free supplementary

	public static String BookAncillaryFreesupplementary =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkfreesupplementary']";

	//SoldSeparately

	public static String BookAncillarySoldseparately =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chksoldseparately']";


	//Download
	//Free 
	public static String BookAncillaryFree =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkFree']";

	//Available in store
	public static String BookAncillaryAvailableinstore =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkActive']";

	//Disable search table writing
	public static String BookAncillaryDisableSearchtablewriting =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkDisableSTW']";

	//Ancillary submit

	public static String BookAncillarysubmit =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_imgbtnSubmit']";
	 

}
