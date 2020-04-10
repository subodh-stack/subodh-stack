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
	
}
