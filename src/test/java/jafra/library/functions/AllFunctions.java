package jafra.library.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import elementPath.ChooseCountry;
import elementPath.Home;
import elementPath.JafrabizLogin;

public class AllFunctions extends CommonFunctions{

	//WebDriver driver;
	CommonFunctions obj=new CommonFunctions();
	
	@Test(priority=1)
	public void OpenJafraWebsite()
	{
		obj.openbrowser("chrome");
		/*obj.ClickElement(Home.ConsultantLogIn);
		String placeholdertext=obj.GetPlaceHolderText(JafrabizLogin.UserName());
		System.out.println(placeholdertext);
		obj.SendKeyValue(JafrabizLogin.UserName(),"Ranit");
		obj.SendKeyValue(JafrabizLogin.Password(),"Ranit");
		obj.ScrollToElement(JafrabizLogin.ForgotPasswordLink());
		obj.ClickElement(JafrabizLogin.ForgotPasswordLink());*/
	}
	
	@Test(priority=2)
	public void GetUsaPhoneNumber()
	{
		obj.openbrowser("chrome");
		obj.ScrollToElement(Home.CHOOSECOUNTRY);
		obj.ClickElement(Home.CHOOSECOUNTRY);
		obj.ScrollToElement(ChooseCountry.choosecountrypath);
		String phonetext=obj.GetText(ChooseCountry.choosecountrypath);
		obj.CompareText(phonetext, "(800) 551-2345");
		String randomnumber= obj.generateRandomNumber();
		obj.takeScreenShot(randomnumber);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
                         }
