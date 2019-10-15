package GenericFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

public class ObjectHandling {

	public static WebDriver driver=null;
	
	public static void BrowserIE(String Url) {
		 System.setProperty("webdriver.ie.driver", "C:\\Users\\gkrishnan22\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		 InternetExplorerOptions option = new InternetExplorerOptions();
		 option.introduceFlakinessByIgnoringSecurityDomains();		 
		 driver= new InternetExplorerDriver(option);
		 driver.manage().window().maximize();
		 driver.navigate().to(Url);
	}
	public static void BrowserChrome(String Url) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\gkrishnan22\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to(Url);
	}
	public static void EnterByXpath(String Xpath,String Value) {
		try {
		driver.findElement(By.xpath(Xpath)).sendKeys(Value);}
		catch(Exception e) {e.printStackTrace();
			System.out.println(e.getMessage());}
	}
	public static void click(String Xpath) {
		try {
		driver.findElement(By.xpath(Xpath)).click();}
		catch(Exception e) {e.printStackTrace();
		System.out.println(e.getMessage());}
	}
	public static String GetTextFromElement(String Xpath) {
		try {
		return driver.findElement(By.xpath(Xpath)).getText();}
		catch(Exception e) {e.printStackTrace();
		System.out.println(e.getMessage()); return "";}
	}
	
	public static void Select(String Xpath,String Value) {
		try {
		 new Select(driver.findElement(By.xpath(Xpath))).selectByValue(Value);	}
		catch(Exception e) {e.printStackTrace();
		System.out.println(e.getMessage());}	
	}	
	public static void SelectByVisibleText(String Xpath,String Value) {
		try {
		 new Select(driver.findElement(By.xpath(Xpath))).selectByVisibleText(Value);	}
		catch(Exception e) {e.printStackTrace();
		System.out.println(e.getMessage());}	
	}
	public static void SelectByIndex(String Xpath,int Value) {
		try {
		 new Select(driver.findElement(By.xpath(Xpath))).selectByIndex(Value);		}
		catch(Exception e) {e.printStackTrace();
		System.out.println(e.getMessage());}
	}	
	public static String VerifyTitle(String Title) {
		if(driver.getTitle().equals(Title))
		{return "true";}else {return "false";}
	} 
	public static void MouseMoveclick(String Xpath) {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath(Xpath))).click().build().perform();
	}
	
}
