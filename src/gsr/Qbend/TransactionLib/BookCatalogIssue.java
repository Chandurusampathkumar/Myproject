package gsr.Qbend.TransactionLib;

public class BookCatalogIssue {
	//Click Book Catalog module in main page
	//In book catalog click new book.(in Add/edit content)
	//select content type from dd to Journal issues
	public static String BookCatalogIssueContentType=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_drpContentType']";
	
	//Issue title
	public static String BookCatalogIssueTitle=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_txtIssueTitle']";
	
	//issus description
	public static String BookCatalogIssuedescrition="";
	
	//No of pages
	public static String BookCatalogIssueNoOfPages=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_txtNoofPages']";
	
	//Volume
	public static String BookCatalogIssueVolume=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_txtVolume']";
	
	//issue no
	public static String BookCatalogIssueNo=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_txtISSNNo']";
	
	//ISSN no
	public static String BookCatalogIssueIssnNo=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_txtIssueISSNNo']";
	
	//Issue ProductID
	
	public static String BookcatalogIssueProductID = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_txtproductid']";
	
	//Issue date
	public static String BookCatalogIssueDate=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_rdIssueDate_dateInput_text']";
	
	public static String BookcatalogIssueDatepicker = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_rdIssueDate_popupButton']";
	
	public static String Issuedateselect = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_rdIssueDate_calendar_Top']/tbody/tr[3]/td[3]/a";
	//Special issue
	public static String BookCatalogIssueSpecialIssue=".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_chkSplIssue']";
	
	//Audience Age Minimum
	public static String BookcatelogIssueAudienceageMin = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_txtAud_Age_Minimum']";
	
	//Audience Age maximun
	public static String BookcatelogIssueAudienceAgeMax =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_txtAud_Age_Maximum']";
	
	//Grade Minimum
	public static String BookcatelogIssueGradeMin =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_txtAud_Grd_Minimum']";
	
	//Grade Maximum
	public static String BookcatelogIssueGradeMax =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_Aud_Grd_Maximum']";

	//Series 
	public static String BookcatelogIssueSeries =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_txtIssueSeries']";
	
	//customData
	
	public static String BookcatelogIssuecustomData = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_txtIssueCustomData']";
	
	//Royalty percentage
	public static String BookcatalogIssueRoyaltypercent = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_txtIssueRoyaltyPercentage']";
	
	//Active Check box
	public static String BookcatalogIssueActiveCB =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_chkActive']";

	//Article Logical Unit Sales
	public static String BookcatalogIssueLogicalUnitSalesCB = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_chkALUnitSales']";
	
	//Active Check box
	public static String BookcatalogIssueAncillaryLogUnitSalesCB = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_ChkIssueALUSale']";
	
	//Available for Subscription
	
	public static String BookcatalogIssueSubscriptionCB = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_chkIsSubscriptionON']";
	
	//Content Availabilty
	
	public static String IssueContentAvailabiltyB = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_btIssueAddRegion']";
	
	//Global Avialble Checkbox
	
	public static String IssuepopGlobalAvailableCB =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_chkIssueGlobAvailable']";
	
	//Popup Ok button
	
	public static String IssuepopOkB = ".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_btIssueOk']";
	
	//Issue Tab Submit Button
	
	public static String IssueSubmitB =".//*[@id='ctl00_ContentPlaceHolder1_Ctrl_BookContentTab1_tcBookContent_tpJIssues_Ctrl_JournalIssues1_imgbtnSubmit']";

}
