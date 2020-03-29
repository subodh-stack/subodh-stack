package test;



import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;


import pom.HomePage;
import utility.Chrome;

public class TestSignup extends Chrome {
	private WebDriver driver;
	private HomePage home;
	
	@BeforeClass
	public void browser()
	{
		 driver = Chrome.Browser();
	}
	


@org.testng.annotations.Test
public void test() 
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
