package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	@FindBy(xpath="//table//tfoot//tr[7]//td[2]") private WebElement cartvalue;
	@FindBy(xpath="//a[@title='Proceed to checkout']") private WebElement checkout1;
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]") private WebElement checkout2;
	@FindBy(xpath="//button[@name='processAddress']") private WebElement checkout3;
	@FindBy(xpath="//div[@id='uniform-cgv']") private WebElement terms;
	@FindBy(xpath="//button[@name='processCarrier']") private WebElement checkout4;
	@FindBy(xpath="//a[@title='Pay by check.']") private WebElement paybycheck;
	@FindBy(xpath="//span[text()='I confirm my order']") private WebElement checkout5;
	
	public Checkout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
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
