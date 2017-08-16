package gsr.Qbend.Admin;

import gsr.Qbend.ActionLib.QBactionLib;
import gsr.Qbend.Common.CommonFunction;

import org.testng.annotations.Test;

import gsr.Qbend.TransactionLib.RegistrationQuestions;

public class EditRegistrationQuestion  
{
QBactionLib QBA = new QBactionLib();
CommonFunction comm=new CommonFunction();
	
	@Test
	public void EditRegQues() throws Exception
	{
		try
		{
			comm.LoginQbend();
			
			QBA.clickButton(RegistrationQuestions.RegistrationQuestionEdit);
			QBA.ClearText(RegistrationQuestions.RegistrationQuestionQuestionEdit);
			QBA.setText(RegistrationQuestions.RegistrationQuestionQuestionEdit, "GSR");
			QBA.ClearText(RegistrationQuestions.RegistrationQuestionIdentifierEdit);
			QBA.setText(RegistrationQuestions.RegistrationQuestionIdentifierEdit, "GSR");
			QBA.ClearText(RegistrationQuestions.RegistrationQuestionXmlNodeEdit);
			QBA.setText(RegistrationQuestions.RegistrationQuestionXmlNodeEdit, "GSR");
			QBA.clickButton(RegistrationQuestions.RegistrationQuestionUpdateB);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 
	}
		

	

}
