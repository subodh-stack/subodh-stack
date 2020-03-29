package test;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import pom.HomePage;
import utility.Chrome;

public class Test extends Chrome {
	private WebDriver driver;
	private HomePage home;
	
	@BeforeClass
	public void browser()
	{
		 driver = Chrome.Browser();
	}
	
@org.testng.annotations.Test
public void Signup() 
{
	 home = new HomePage(driver);
	 home.signin();
	 home.mail("testforplan@gmail.com");
	 home.create();
	 home.gender();
	 home.firstname();home.lastname();
	 home.pass();
	 home.address();
	 home.city();
	 home.state();
	 home.post();
	 home.country();
	 home.mobile();
	 home.addressbook();
	 home.register();
}

}
