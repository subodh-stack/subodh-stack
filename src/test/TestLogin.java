package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import pom.Checkout;
import pom.HomePage;
import pom.PlaceOrder;
import pom.Profile;
import utility.Chrome;
import utility.Screenshot;

public class TestLogin {
	
	private WebDriver driver;
	private HomePage home;
	private PlaceOrder order;
	private Checkout checkout;
	private String value;
	private Profile user;
	private String cost;
	private SoftAssert verify;
	private Screenshot snap;
	
	@BeforeClass
	public void browser()
	{
		 driver = Chrome.Browser();
	}

	@org.testng.annotations.Test
	public void signin() throws EncryptedDocumentException, IOException
	{
		home = new HomePage(driver);
		home.signin();
		home.email();
		home.passwd();
		home.login();
		snap = new Screenshot();
		snap.snap("Login", driver);
	}
	
	@org.testng.annotations.Test (dependsOnMethods = "signin")
	public void selectProduct() throws IOException
	{
		order = new PlaceOrder(driver);
		checkout = new Checkout(driver);
		order.womensection();
		order.product(driver);
		order.more();
		order.plus();
		order.addtocart();
		snap.snap("addedtocart", driver);
		checkout.checkout1();
		value = checkout.cartvalue();
		checkout.checkout2();
		checkout.checkout3();
		checkout.terms();
		checkout.checkout4();
		checkout.pay();
		checkout.checkout5();
	}
	
	@org.testng.annotations.Test (dependsOnMethods = "selectProduct")
	public void amount() throws IOException
	{
		user = new Profile(driver);
		user.profile();
		user.orders();
		snap.snap("Orders", driver);
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
