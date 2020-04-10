package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utility.Excel;

public class HomePage {
	
	@FindBy(xpath="//a[@class='login']") private WebElement signin;

	@FindBy(xpath="//input[@id='email']") private WebElement email;
	@FindBy(xpath="//input[@id='passwd']") private WebElement passwd;
	@FindBy(xpath="//button[@id='SubmitLogin']") private WebElement login;
	private Excel excel;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	public void signin()
	{
		signin.click();
	}
					 	
	public void email () throws EncryptedDocumentException, IOException
	{
		excel = new Excel();
		String id = excel.ExcelSheet("Credentials", 1, 0, "string data");
		email.sendKeys(id);
	}
	
	public void passwd() throws EncryptedDocumentException, IOException
	{
		int value =excel.ExcelSheet("Credentials", 1, 1, 5);
		String pass = Integer.toString(value);
		passwd.sendKeys(pass);
	}
	 
	public void login()
	{
		login.click();
	}


	
	
}
