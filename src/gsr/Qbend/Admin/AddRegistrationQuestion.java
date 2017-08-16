package gsr.Qbend.Admin;

import gsr.Qbend.ActionLib.QBactionLib;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class AddRegistrationQuestion extends RegistrationQuestions
{
QBactionLib QBA = new QBactionLib();
	
	@Test
	public boolean AddRegQues() throws Exception
	{
		try
		{
			String RFile = "F:\\MyProject\\Qbend\\DataQbend.properties" ;
			FileInputStream in = new FileInputStream(new File(RFile));
			Properties pro = new Properties(); 
			pro.load(in);
			
			String  Question = pro.getProperty("RegistrationQuestionsQuestion");
			String  Identifier = pro.getProperty("RegistrationQuestionsIdentifier");
			String  xmlNode = pro.getProperty("RegistrationQuestionsXmlNode");
			
			
			QBA.setText(RegistrationQuestionsQuestions, Question);
			QBA.setText(RegistrationQuestionsQuestionsidentifer, Identifier);
			QBA.setText(RegistrationQuestionsXmlcode, xmlNode);
			QBA.clickButton(RegistrationQuestionsActiveCB);
			QBA.clickButton(RegistrationQuestionsAddandedit);
		}
		catch(Exception e)
		{
			
		}
		return true;
	}
}
	


