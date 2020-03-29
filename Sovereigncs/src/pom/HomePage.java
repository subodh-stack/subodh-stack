package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	@FindBy(xpath="//a[@class='login']") private WebElement signin;
	@FindBy(xpath="//input[@id='email_create']") private WebElement mail;
	@FindBy(xpath="//i[@class='icon-user left']") private WebElement create;

	@FindBy(xpath="//input[@id='id_gender1']") private WebElement gender;
	@FindBy(xpath="//input[@id='customer_firstname']") private WebElement firstname;
	@FindBy(xpath="//input[@id='customer_lastname']") private WebElement lastname;
	@FindBy(xpath="//input[@id='passwd']") private WebElement pass;
	@FindBy(xpath="//input[@id='address1']") private WebElement address;
	@FindBy(xpath="//input[@id='city']") private WebElement city;
	@FindBy(xpath="//select[@id='id_state']") private WebElement state;
	@FindBy(xpath="//input[@id='postcode']") private WebElement post;
	@FindBy(xpath="//select[@id='id_country']") private WebElement country;
	@FindBy(xpath="//input[@id='phone_mobile']") private WebElement mobile;
	@FindBy(xpath="//input[@id='alias']") private WebElement addressname;
	@FindBy(xpath="//button[@id='submitAccount']") private WebElement submit;
	
	@FindBy(xpath="//input[@id='email']") private WebElement email;
	@FindBy(xpath="//input[@id='passwd']") private WebElement passwd;
	@FindBy(xpath="//button[@id='SubmitLogin']") private WebElement login;
	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
		public void signin()
		{
			signin.click();
		}
		
			public void mail(String email)
			{
				mail.sendKeys(email);
			}
			
				public void create()
				{
					create.click();
				}
				
					public void gender()
					{
						gender.click();
					}
					
						public void firstname()
						{
							firstname.sendKeys("abc");
						}
						
							public void lastname()
							{
								lastname.sendKeys("ijk");
							}
						 
								public void pass()
								{
									pass.sendKeys("12345");
								}
								
									public void address()
									{
										address.sendKeys("acbcde");
									}
									
										public void city()
										{
											city.sendKeys("pune");
										}
										
											public void state()
											{
												state.click();
												Select select = new Select(state);
												select.selectByVisibleText("Alabama");
											}
											
												public void post()
												{
													post.sendKeys("56789");
												}
												
													public void country()
													{
														Select select = new Select(country);
														select.selectByVisibleText("United States");
													}
													
														public void mobile()
														{
															mobile.sendKeys("123456789");
														}
														
														 public void addressbook()
														 {
															 addressname.sendKeys("Home");
														 }
														 
														 	public void register()
														 	{
														 		submit.click();
														 	}
														 	
														 		public void email (String id)
														 		{
														 			email.sendKeys(id);
														 		}
														 		
														 			public void passwd()
														 			{
														 				passwd.sendKeys("12345");
														 			}
														 	 
														 				public void login()
														 				{
														 					login.click();
														 				}
	
	
	
	
}
