package gsr.Qbend.TransactionLib;

public class Bookcataloger {

	//Main page username 

		public static String username = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_LoginMain1_Login1_UserName']";
//Main page Password
		
		public static String password = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_LoginMain1_Login1_Password']";
//Submit button for login paeg
		
		public static String Logsubmitbutton = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_LoginMain1_Login1_LoginButton']";
//Book cata log button  
  		public static String Bookcatalog = ".//*[@id='ctl00_ContentPlaceHolder1_HyLBooks']";
  		
//BookTab xpath
  		
  		public static String Booktab =".//*[@id='__tab_ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook']";

// add new book button 
		public static String Addnewbook=".//*[@id='ctl00_ContentPlaceHolder1_btncreatebook']";

// Book Tab
		//Bookname 
		public static String Bookname = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtBookAutoComplete']";
//Book Name validation message 
		public static String Bookvalidationmsg = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_Alert_LabelAlert']";
		
		public static String ISBN13 =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtISBNNo13']";

//ISBN No 10 
		public static String ISBNno10 =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtISBNNo10']";

//Publish Year(date pick) 
		public static String PublishYear =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtPublishYear_dateInput_text']";

//Edition 
		public static String Edition = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtEdition']";

//No of page
		public static String Noofpage  = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtNoofPages']";

//Active
		public static String ActiveBookTabCB = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_chkActive']";

//Logical Unit Sales
		public static String LogicalUnitSales = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_chkLUSale']";

//Ancillary Logical Unit Sale
		public static String AncillaryLogicalUnitSale = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_ChkALUSale']";

//COver image Path
		public static String CoverImagepath = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtCover_img_Path']";

//ProductID
		public static String ProductID = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtProductID']";

//Price Display Option

//Lowest Chapter Price
		public static String LowestChapter =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_chkLCP']";

//Default Price
		public static String DefaultPrice = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_chkDP']";

//Series
		public static String Series = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtSeries']";

//Audience Age Minimum

		public static String AgeMinimum = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtAud_Age_Minimum']";
	
//Audience Age Maximum
		public static String AgeMaximun = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtAud_Age_Maximum']";

//Grade Minimum
		public static String Grademinimum = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtAud_Grd_Minimum']";

//Grade Maximum
		public static String Grademaximum = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_Aud_Grd_Maximum']";

//Sale Model(Drop down)
		public static String SaleModelDP=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_drpdnSalesModel']";

//Imprint
		public static String Imprint =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtImprint']";

//CustomData
		public static String CustomData=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtCustomData']";
		

//Royaltly Percentage
		public static String RoyaltlyPercentage=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_txtRoyaltyPercentage']";

//Set Content Availability
		public static String ContentAvilabilityB =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_btAddRegion']";

//Globally Available(check box)
		public static String GlobalAvilable=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_chkGlobAvailable']";

//Ok(button)
		public static String popOK=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_btOk']";

//Submit
		public static String BooksTabsubmit= ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpBook_BookMultipleAuthor1_imgbtnSubmit']";

//Content Tab

		public static String ContentTab = ".//*[@id='__tab_ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent']";
//content Title

		public static String ContentTitle =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtContentTitle']";

//SubTitle
		public static String SubTitle=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtSubtitle']";

//Content Order
		public static String ContentOrder=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtContentOrder']";

//Publisher Name
		public static String Publishername = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtPublisherAutoComplete']";
//Publisher name typoid search
		
		public static String Publishertypoid =".//*[@id='PubAutoCom_completionListElem']/li";
		
		
//Reset(button)
public static String ResetB=".//*[@id='btnPubClear']";

//Author Name
		public static String Authorname = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtAuthorAutoComplete']";

//+ (button) for author
		public static String Authorplus =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_btnMultipleAuthor']";

//Reset button for author
		public static String AuthorResetB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_btnRestAuthor']";
//popup search test pass field
		
		public static String popsearch =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_Ctrl_AuthorsGrid1_txtFirstName']";
		
//Seacrch button
		
		public static String popsearchButt = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_Ctrl_AuthorsGrid1_ibtSearch']"; 
		
//select authour check boc
		
		public static String authourCB = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_Ctrl_AuthorsGrid1_rgMultipleAuthors_ctl00__0']/td[1]";
//Available From Qbend(Date picker)
		public static String QbendDataPicker=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtAvailableFrom_dateInput_text']";

//Available From Snap (date picker)
		public static String SnapDatePicker=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_DtPkrAvailableSnap_dateInput_text']";

		//Click ok button from popup
		public static String ContentpopOkButt="ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_Ctrl_AuthorsGrid1_OK";
		
		
//Selling Mode

//Purchase(check box)
		public static String PurchaseCB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkPurchase']";

//Rental(check box)
		public static String RentCB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkRent']";

//XPath
		public static String Xpath=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_txtXPath']";


//Download

//Free(check box)
//public static String FreeCB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkFree']";

//Available for Store(check box)
		public static String AvilableStoreCB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkActive']";



//Available for Snap(check box)
		public static String SnapCB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkActiveSnap']";

//Show Parts XML(check box)
//public static String ShowXmlPart=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_chkShowParts']";
		

//Content tab submit button 
		
		public static String ContentabSubmitButton = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContent_Ctrl_ContentDetails1_imgbtnSubmit']";




/*//                     Keyword Tab
   public static String KeywordTab=".//*[@id='__tab_ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpKeywords']";


//Content Keyword
public static String ContentKeyword=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpKeywords_Ctrl_ContentKeywords1_txtContentKeyword']";


//Submit
public static String KeywordTabSubmitB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpKeywords_Ctrl_ContentKeywords1_imgbtnSaveKeyword']";

//Clear
public static String KeywordTabClearB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpKeywords_Ctrl_ContentKeywords1_imgbtnKeywordClear']";


-------------------------------------------------------------------------------------------------------------------------------------------------------
                     

                ContentRoleMap
             public static String ContentRoleMap=" .//*[@id='__tab_ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContentRoleMap']";


            //Inside the grid//

//Role Name(dropdown box)
public static String ContentRoleNameDD=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContentRoleMap_Ctrl_ContentRoleXpath1_grdRoleXpath_ctl03_drpAddSnapRoles']";


//Xpath
 public static String ContentRoleXpath=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContentRoleMap_Ctrl_ContentRoleXpath1_grdRoleXpath_ctl03_txtAddXPath']";


//Show Xpath  XML(check box)
public static String ContentRoleShowXpath=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContentRoleMap_Ctrl_ContentRoleXpath1_grdRoleXpath_ctl03_ChkAddShowParts']";

//Active
public static String ContentRoleActiveCB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContentRoleMap_Ctrl_ContentRoleXpath1_grdRoleXpath_ctl03_chkAddActive']";

//Edit
public static String ContentRoleEdit=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpContentRoleMap_Ctrl_ContentRoleXpath1_grdRoleXpath_ctl03_lnkAdd']";

----------------------------------------------------------------------------------------------------------------------------------------------------------


          Index AnD Toc
     public static String IndexAndToc=".//*[@id='__tab_ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC']";


//Index File(Browse)
public static String IndexFileBrowse=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_fupIndex']";

//Reset
public static String IndexResetB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_btnResetindexfileupload']";


//Index Content

//Active
public static String IndexContentActiveCb=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_chkindexActive']";

//Submit
public static String IndexContentSubmitB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_imgbtnindxSubmit']";

//Reset
public static String IndexContentResetB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_imgbtnindxClear']";


//Toc file
public static String Tocfile=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_fupTOCImage']";

//toc file reset
public static String TocFileResetB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_btnResettocfileupload']";


//Active
public static String TocActiveCB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_chkActive']";

//Submit
public static String TocSubmitB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_imgbtnTOCSubmit']";


//Reset
public static String TocResetB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpIndexTOC_Ctrl_IndexDetails1_imgbtnTOCClear']";

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/
//                  File Location
		public static String FilelocationTab =".//*[@id='__tab_ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile']";
                  


      //Preview File Upload

//File Upload

/*
//Active
public static String FileUploadActiveCB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkpreviewactive']";

//Browse
public static String FileUploadBrowse=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_Fuppreview']";


//Store Preview Upload

//Active
public static String StoreUploadActiveCB.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkbxzippreview']

//Browse
public static String StoreBrowse=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_Fuppreviewupload']";

//SNAP preview File uploaded

//Active
public static String SnapActiveCb=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chksnappreviewactive']";

//Browse
public static String SnapBrowse=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_FUSnappreview']";


//Submit
public static String SnapSubmitB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_imgbtnpreviewupload']";


//Aggregator
public static String SnapAggregator=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_drpAggregator']";


		
//File Location(browse)
public static String FileLocationBrowse=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_fupContentFileLocation']";


//Reset
.//*[@id='file_input_container']/input[2]

//Thumb Location(browse)
public static String ThumbLocation=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_fupContentThumbFileLocation']";

*/
//FileType(drop down)
		public static String FileTypeDD=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_drpFileType']";


//Make As default
//.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkdefaultfiletype']

//Active
		public static String ActiveCB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkfilelocationactive']";

//DRM Download
		public static String DRMCB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkDRM']";

//Display single Device
//.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkDisplaySingleDevice']

//GLobally Avaliable
//.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkglobalAvailable']

//Store Display Option

//Display
//.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkDisplay']

//Print
//.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkPrint']

//Copy
//.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkCopy']

//Share
//.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_chkShare']

//Product ID
		public static String FileTabResourceID =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_txtResourceID']";
		
//ISBN 10
		public static String FiletabISBN10 =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_txtFTISBN10']";

//ISBN 13
		public static String FiletabISBN13 =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_txtFTISBN13']";

//Submit
		public static String SubmitFiletypeB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_imgbtnfileuploadSubmit']";

//clear
		public static String clearB=" .//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_imgbtnfileuploadClear']";

//Submit
		public static String Submitabove2B=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_imgbtnoverallsubmit']";

// Validation message for file location 
		
		public static String FileTypeSubmissionValidationMSG = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_Ctrl_Alert1_LabelAlert']";
		

//DMR Rights

//Purchase Permission

//select File Type(dropdown)
		public static String DRMFileTypeDD=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_drpPurchasrFileType']";

//Display(check box)
		public static String DRMFileDisplayCB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_chkpurchaseDisplay']";


//Relative(radio button)
//.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_RBpurchaseDisp_Relative']


//Expires
		public static String DRMExpires =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_txtpurchaseRelative']";

//Seconds(Dropdown)
		public static String DRMPurchaseSelectSecondsDD=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_DrpDwnduration']";


//Absolute
//.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_RBpurchaseDisp_Absolute']

//Expires at
		//public static String DRMExpires=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_txtpurchaseAbsolute']";


//Copy (Check box)
		public static String FLTDRMCOPYCB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_chkpurchaseCopy']";


//Selection Every
//.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_txtpurchaseCopy_2']

//seconds(dropdown)
//.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_drpdwnpurcpyduration']


//Print(checkbox)
		public static String FLTDRMPrintCB =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_chkpurchasePrint']";


//Page every
//.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_txtpurchasePrint_2']

//Seconds(dropdown)
//.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_drpdwnpurprntduration']

//Purchase updated conformation
		
		public static String Purchasevalidationmsg =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_Ctrl_Alert2_LabelAlert']";
//Submit

		public static String FLTDRMPurchaseSunmitB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_imgbtnpurchasepermissionsave']";
													
//Clear
//.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tppurchaserights_imgbtnpurchasepermissionClear']


//Rental Premission

		public static String DRMRentalTab=".//*[@id='__tab_ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights']";


//Select File Type(Dropdown)
		public static String DRMRentTabSelectFile=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_drpRentFileType']";


//Copy(checkbox)
		public static String DRMRentTabCopyCB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_chkrentCopy']";

//Selection  Every
		public static String DRMRentTabSelectionEvery =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_txtrentCopy_2']";

//Seconds(Dropdown)
		public static String DRMRentTabSecondsDD=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_drpdwnrentcpyduration']";

//print(checkbox)
		public static String DRMRentTabPrintCB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_chkrentPrint']";

//Page Every
//.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_txtrentPrint_2']

//Seconds(dropdown)
//.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_drpdwnrentprntduration']


//Submit
		public static String DRMRentTabSubmitB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_imgbtnnrentpermissionsave']";

//Clear
//.//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_imgbtnnrentpermissionclear']

//Validation message for Rent Tab

		public static String Rentvalidationmsg =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_tcContentRights_tprentalrights_Ctrl_Alert4_LabelAlert']";

                 //Pricing Tab
		public static String PricingTab =".//*[@id='__tab_ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing']";


//Inside Grid table


//File Format
		public static String PricingFileformatDD=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_GridViewPrice_ctl03_DrpdwnFileType']";

//Location
		public static String LocationDD=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_GridViewPrice_ctl03_Drpdwnlocation']";

//Currency
		public static String Currency =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_GridViewPrice_ctl03_Drpdwncurrency']";

//SaleType
		public static String PricingSaleType = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_GridViewPrice_ctl03_DropDownListSaleType']";

//Unit type
		public static String UnitTypeDD=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_GridViewPrice_ctl03_DropDownListUnitType']";

//Unit price
		public static String Unitprice =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_GridViewPrice_ctl03_txtUnitPrice']";

//List Price
		public static String Listprice=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_GridViewPrice_ctl03_txtListPrice']";

//Active
		public static String pricingActiveCB=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_GridViewPrice_ctl03_chkboxactive']";

//Edit(insert)
		public static String pricingEditB =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_GridViewPrice_ctl03_lnkAdd']";

//Pricing Tab successful maessage 
		
		public static String PricingUpdatedMsg = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpPricing_Ctrl_Pricing1_Ctrl_Alert1_LabelAlert']";
		//Click on Booklink
				public static String BoolLinkHead = ".//*[@id='ctl00_SiteMapPath1']/span[5]/a";
				
		//Click on Category
				
				public static String CategoryB = ".//*[@id='RAD_SLIDING_PANE_TAB_ctl00_ContentPlaceHolder1_Contacts']";
				
		//Category source
				
				public static String DropElement =".//*[@id='ctl00_ContentPlaceHolder1_rtvCatalogTree']/ul/li/ul/li[18]/div/span[3]";
		//serach Book eelment for drag and drop
				
				public static String DragElement =".//*[@id='ctl00_ContentPlaceHolder1_rgBook_ctl00__0']/td[1]";
				
		//ISSN no
				
				public static String FiletabISSN=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_txtftissn']";
						
		//Filelocation validation message
						
				public static String FilelocationtabValidationMsg =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpFile_Ctrl_FileLocation1_Ctrl_Alert1_LabelAlert']";
						

}
		


