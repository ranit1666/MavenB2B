package elementPath;

import org.openqa.selenium.By;

public class JafrabizLogin {
	
	public static By UserName()
	{
	return By.xpath("//input[@id='j_username']"); 
	}
	
	public static By Password()
	{
	return By.xpath("//input[@id='j_password']"); 
	}
	
	public static By SubmitButton()
	{
	return By.xpath("//button[@id='loginUS']"); 
	}
	
	public static By ForgotPasswordLink()
	{
	return By.xpath("//a[contains(text(),' Forgot your password?')]"); 
	}
	

	
	
                          }
