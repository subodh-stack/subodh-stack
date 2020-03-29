package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {
	
	@FindBy(xpath="//a[text()='Women']") private WebElement women;
	@FindBy(xpath="(//a[@title='Faded Short Sleeve T-shirts'])[2]") private WebElement product;
	@FindBy(xpath="(//a[@title='Add to cart'])[1]") private WebElement add;
	@FindBy(xpath="(//span[text()='More'])[1]") private WebElement more;
	@FindBy(xpath="(//a[contains(@class,'btn btn-default')])[4]") private WebElement plus;
	@FindBy(xpath="//button[@class='exclusive']") private WebElement addcart;
	@FindBy(xpath="//table//tfoot//tr[7]//td[2]") private WebElement cartvalue;
	@FindBy(xpath="//a[@title='Proceed to checkout']") private WebElement checkout1;
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]") private WebElement checkout2;
	@FindBy(xpath="//button[@name='processAddress']") private WebElement checkout3;
	@FindBy(xpath="//div[@id='uniform-cgv']") private WebElement terms;
	@FindBy(xpath="//button[@name='processCarrier']") private WebElement checkout4;
	@FindBy(xpath="//a[@title='Pay by check.']") private WebElement paybycheck;
	@FindBy(xpath="//span[text()='I confirm my order']") private WebElement checkout5;
	
	
	
	public PlaceOrder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
		public void womensection()
		{
			women.click();
		}
		
			public void product(WebDriver driver)
			{
				Actions action = new Actions(driver);
				action.moveToElement(product).build().perform();
				//action.moveToElement(more).click().build().perform();
			}
			
				public void more()
				{
					more.click();
				}
				 
				 public void cart()
				 {
					 add.click();
				 }
				 		
				 	public void plus()
				 	{
				 		plus.click();
				 	}
				 		
				 		public void addtocart()
				 		{
				 			addcart.click();
				 		}
				 			
				 			public String cartvalue()
				 			{
				 				String value =cartvalue.getText();
				 				System.out.println("The Total Cart value is " + value);
								return value;	
				 			}
				 			
				 				public void checkout1()
				 				{
				 					checkout1.click();
				 				}
				 				
				 					public void checkout2()
				 					{
				 						checkout2.click();
				 					}
		 				 	
				 						public void checkout3()
				 						{
				 							checkout3.click();
				 						}
				 							public void checkout4()
				 							{
				 								checkout4.click();
				 							}
				 							
				 								public void pay()
				 								{
				 									paybycheck.click();
				 								}
				 								
				 								 public void terms()
				 								 {
				 									 terms.click();
				 								 }
				 								 
				 								 		public void checkout5()
				 								 		{
				 								 			checkout5.click();
				 								 		}
}
