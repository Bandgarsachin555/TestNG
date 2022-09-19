package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{

	@FindBy(xpath="//a[contains(@href,'pim/viewPimModule')]")
	WebElement PIM;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public void PIM()
	{
		PIM.click();
	}
	
	public boolean URL()
	{
	return driver.getCurrentUrl().contains("pim");
		
	}
}
