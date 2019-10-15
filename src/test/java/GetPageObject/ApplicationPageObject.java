package GetPageObject;

public class ApplicationPageObject {
	
	public static String FilePath="C:\\Users\\gkrishnan22\\Desktop\\SS.txt";
	
	public static String GetFirstName() {
		return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.FirstName.txt.xpath");}
	public static String GetLastName() {
		return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.LastName.txt.xpath");}
	public static String GetPhone() {return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.Phone.txt.xpath");}
	public static String GetCountry() {return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.Country.txt.xpath");}
	public static String GetCity() {return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.City.txt.xpath");}
	public static String GetEmailAddress() {return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.EmailAddress.txt.xpath");}
	public static String GetGenderMale() {return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.GenderMale.rdo.xpath");}
	public static String GetGenderFemale() {return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.GenderFemale.rdo.xpath");}
	public static String GetDays() {return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.Days.chk.xpath");}
	public static String Getcontact() {return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.contact.drp.xpath");}
	public static String GetCalendar() {return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.calendar.elm.xpath");}
	public static String GetCalendarNext() {return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.calendarNext.lnk.xpath");}
	public static String GetCalendarMonth() {return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.calendarMonth.elm.xpath");}
	public static String GetCalendarYear() {return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.calendarYear.drp.xpath");}
	public static String GetUpload() {return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.Upload.btn.xpath");}
	public static String GetComment() {return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.Comment.txt.xpath");}
	public static String GetSoftwareTestingTutorials() {return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.SoftwareTestingTutorials.lnk.xpath");}
	public static String GetSoftwareTestingToolsTraing() {return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.SoftwareTestingToolsTraing.lnk.xpath");}
	public static String GetSubmit() {return GenericFunction.GenericMethod.GetLoctorFromTextFile(FilePath, "Volunteer.Submit.btn.xpath");}
}
