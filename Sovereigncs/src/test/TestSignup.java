package test;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;


import pom.HomePage;
import pom.Signup;
import utility.Chrome;

public class TestSignup extends Chrome {
	private WebDriver driver;
	private HomePage home;
	private Signup signup;
	
	
	@BeforeClass
	public void browser()
	{
		 driver = Chrome.Browser();
	}
	


	@org.testng.annotations.Test
	public void test() throws EncryptedDocumentException, IOException 
	{
		home = new HomePage(driver);
		signup = new Signup (driver);
		home.signin();
		signup.mail();
		signup.create();
		signup.gender();
		signup.firstname();
		signup.lastname();
		signup.pass();
		signup.address();
		signup.city();
		signup.state();
		signup.post();
		signup.country();
		signup.mobile();
		signup.addressbook();
		signup.register();
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}


}
