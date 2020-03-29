package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import pom.HomePage;
import pom.PlaceOrder;
import pom.Profile;
import utility.Chrome;

public class TestLogin {
	
	private WebDriver driver;
	private HomePage home;
	private PlaceOrder order;
	private String value;
	private Profile user;
	private String cost;
	private SoftAssert verify;
	
	@BeforeClass
	public void browser()
	{
		 driver = Chrome.Browser();
	}

	@org.testng.annotations.Test
	public void signin()
	{
		home = new HomePage(driver);
		home.signin();
		home.email("testforplan@gmail.com");
		home.passwd();
		home.login();
	}
	
	@org.testng.annotations.Test (dependsOnMethods = "signin")
	public void selectProduct()
	{
		order = new PlaceOrder(driver);
		order.womensection();
		order.product(driver);
		order.more();
		order.plus();
		order.addtocart();
		order.checkout1();
		value = order.cartvalue();
		order.checkout2();
		order.checkout3();
		order.terms();
		order.checkout4();
		order.pay();
		order.checkout5();
	}
	
	@org.testng.annotations.Test (dependsOnMethods = "selectProduct")
	public void amount()
	{
		user = new Profile(driver);
		user.profile();
		user.orders();
		cost = user.price();
		verify = new SoftAssert();
		verify.assertEquals(cost, value);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		verify.assertAll();
		driver.quit();
	}
}
