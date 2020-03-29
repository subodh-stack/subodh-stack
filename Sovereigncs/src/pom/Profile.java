package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
	
	@FindBy(xpath="//a[@class='account']") private WebElement profile;
	@FindBy(xpath="//span[text()='Order history and details']") private WebElement orders;
	@FindBy(xpath="//table//tbody//tr[1]//td[3]") private WebElement price;
	
	
	
	public Profile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void profile()
	{
		profile.click();
	}
		public void orders()
		{
			orders.click();
		}
			public String price()
			{
				String ordervalue = price.getText();
				System.out.println("Oder final value is "+ ordervalue);
				return ordervalue;
			}

}
