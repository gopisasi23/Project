package StepDefinations;
import java.io.IOException;
import ApplicationScript.App1Script;
import GenericFunction.ObjectHandling;
import GenericFunction.ReadFromExcel;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class FormDefination {
	
	@Before
	public void data() throws IOException {
	ReadFromExcel.loaddata("C:\\Users\\gkrishnan22\\Desktop\\Maveric\\","AutomationData.xlsx","Configuration",1);
	if(ReadFromExcel.Configuration.get("Browser").equals("IE")) {	ObjectHandling.BrowserIE(ReadFromExcel.Configuration.get("Url"));}
	if(ReadFromExcel.Configuration.get("Browser").equals("Chrome")){ObjectHandling.BrowserChrome(ReadFromExcel.Configuration.get("Url"));}
	}
	
	@After
	public void Close() {
		//ObjectHandling.driver.quit();		
	}
	
	@Given("^Load (\\d+) row data from Excel$")
	public void load_row_data_from_Excel(int row) throws Throwable {
		ReadFromExcel.loaddata("C:\\Users\\gkrishnan22\\Desktop\\Maveric\\","AutomationData.xlsx","Data",row);
	}
	
	@And("^Fill the form$")
	public void fill_the_form() throws Throwable {
	    new App1Script().EnterFormdetails();
	}
	
	@And("^Submit the form$")
	public void Submit_the_form() throws Throwable {
	   App1Script.SubmitButton();
	}

	@Then("^verify the dropdown$")
	public void verify_the_dropdown() throws Throwable {
	    
	}

}
