package ApplicationScript;
import java.time.Month;

import GenericFunction.ObjectHandling;
import GenericFunction.ReadFromExcel;
import GetPageObject.ApplicationPageObject;

public class App1Script {

	public App1Script(){
		try {
			if(ObjectHandling.VerifyTitle("Selenium Practice Form").equals("false"))
				throw new Exception("page Not found");	
			}catch(Exception e) {e.printStackTrace();		System.out.println(e.getMessage());}
	}
	
	public void EnterFormdetails() {
		try {
		ObjectHandling.EnterByXpath(ApplicationPageObject.GetFirstName(), ReadFromExcel.UserDetails.get("FirstName"));
		ObjectHandling.EnterByXpath(ApplicationPageObject.GetLastName(), ReadFromExcel.UserDetails.get("LastName"));	
		ObjectHandling.EnterByXpath(ApplicationPageObject.GetPhone(), ReadFromExcel.UserDetails.get("Phone"));
		ObjectHandling.EnterByXpath(ApplicationPageObject.GetCountry(), ReadFromExcel.UserDetails.get("Country"));
		ObjectHandling.EnterByXpath(ApplicationPageObject.GetCity(), ReadFromExcel.UserDetails.get("City"));		
		ObjectHandling.EnterByXpath(ApplicationPageObject.GetEmailAddress(), ReadFromExcel.UserDetails.get("EmailAddress"));
	
		if(ReadFromExcel.UserDetails.get("Gender").toUpperCase().equals("MALE")) {
		ObjectHandling.MouseMoveclick(ApplicationPageObject.GetGenderMale());}
		if(ReadFromExcel.UserDetails.get("Gender").toUpperCase().equals("FEMALE")) {
		ObjectHandling.MouseMoveclick(ApplicationPageObject.GetGenderFemale());}
				
		
		ObjectHandling.MouseMoveclick(ApplicationPageObject.GetDays()+ ReadFromExcel.UserDetails.get("Days")+"')]/preceding-sibling::input");
		
		ObjectHandling.SelectByVisibleText(ApplicationPageObject.Getcontact(), ReadFromExcel.UserDetails.get("Contact"));
				
		SelectDateFromCalender(ReadFromExcel.UserDetails.get("Date"));
		
		ObjectHandling.MouseMoveclick(ApplicationPageObject.GetUpload());
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\gkrishnan22\\Desktop\\Maveric\\Upload.exe");
		Thread.sleep(3000);			
		ObjectHandling.EnterByXpath(ApplicationPageObject.GetComment(),ReadFromExcel.UserDetails.get("Comments"));
		
		}catch(Exception e) {e.printStackTrace();		System.out.println(e.getMessage());}					 	

	}
	public static void SelectDateFromCalender(String date) {
		try {
			String[] dt=date.split("/");
			String month= Month.of(Integer.parseInt(dt[0])).name();
			String dd=dt[1].toString();
			String year=dt[2].toString();
			
		ObjectHandling.MouseMoveclick(ApplicationPageObject.GetCalendar());
		Thread.sleep(2000);
		
		while(true) {
		String text= ObjectHandling.GetTextFromElement(ApplicationPageObject.GetCalendarMonth());
		if(text.toUpperCase().equals(month)) 
		{break;}
		else {ObjectHandling.MouseMoveclick(ApplicationPageObject.GetCalendarNext());}
		}
		ObjectHandling.Select(ApplicationPageObject.GetCalendarYear(), year);
		ObjectHandling.MouseMoveclick("//a[text()='"+dd+"']");
		
		}catch(Exception e) {e.printStackTrace();System.out.println(e.getMessage());}					 	
	}
    
	public static void SubmitButton() {
		ObjectHandling.click(ApplicationPageObject.GetSubmit());
	}
}
