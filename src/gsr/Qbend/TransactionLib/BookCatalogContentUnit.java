package gsr.Qbend.TransactionLib;

public class BookCatalogContentUnit {
    
	//Search Bookcataloger page 
	
	public static String SearchBook =".//*[@id='ctl00_ContentPlaceHolder1_txtBookName']";
	
	//Submit button in bookcataloger page to search a book
	
	public static String SubmitBforsearch = ".//*[@id='ctl00_ContentPlaceHolder1_ibtSearch']";
	
	//Search result book click on right mouse button
	
	public static String serachbookrightclick = ".//*[@id='ctl00_ContentPlaceHolder1_rgBook_ctl00__0']/td[1]";
	
	
	//click BookCatalog module
	public static String BookcatalogMain=".//*[@id='ctl00_ContentPlaceHolder1_HyLBooks']";
	
	//ContentTitle Name 
	//public static String ContentTitlename = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtContentTitle']";
	
  //Add new book
	public static String BookCatalogAddNewbookB=".//*[@id='ctl00_ContentPlaceHolder1_btncreatebook']";
	

	//Inside create new or edit book click content 
	public static String BookUnitContent=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_UpdatePanel1']/a/img";
	                                    
	//Click Unit
	public static String BookCatalogAddUnit=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_LinkButtonAddNew']";
	
	//Click issue unit
	
	public static String IssueAddUnit = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_LnkBtnAddArticle']";
	
	//Click Issue Add Ancillary Content
	
	public static String IssueAddAncillaryContent =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_lnkAncillary']";
	 
	//enter content title
	public static String BookCatalogContentTitleid=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtContentTitle']";
	
	//Product ID in content Unit 
	
	public static String BookcontentUnitProductID = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtProductID']";
	
	//Mouse right click 
	
	public static String Mouseposition = ".//*[@id='ctl00_ContentPlaceHolder1_rgBook_ctl00__0']/td[1]";
	
	//Mouse right click menu selection 
	
	public static String MouseMenuOptionADDContent = ".//*[@id='aspnetForm']/div[1]/ul/li[1]/a/span";
	
	//Content order

		public static String BookunitContentorder =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtContentOrder']";


		//DOI

		public static String BookunitDOI =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtDOI']";


		//No of pages

		public static String BookunitNoofpages =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtNoofPages']";


		//Chapter No

		public static String BookunitChapterNo =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtChapterNo']";


		//Selling Mode

		//Purchase

		public static String Bookunitpurchase =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkPurchase']";


		//Rental

		public static String Bookunitrental =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkRent']";


		//Xpath

		public static String BookunitXpath =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtXPath']";

		//Download

		//Free

		public static String BookunitFree =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkFree']";


		//Available in store

		public static String BookunitAvailableinstore =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkActive']";

		//Availableinsnap

		public static String BookunitAvailableinsnap =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkActiveSnap']";


		//Show parts XMl

		public static String BookunitShowpartsXMl =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkShowParts']";


		//Disable search Table writing

		public static String BookunitDisablesearchTablewriting =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkDisableSTW']";


		//Unitsubmit

		public static String Bookunitsubmit =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_imgbtnSubmit']";

		//Content unit successful message 
		
		public static String ContentUnitsuccessfulMsg = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_Alert_LabelAlert']";
		

} 


