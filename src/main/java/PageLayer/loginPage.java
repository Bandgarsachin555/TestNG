package PageLayer;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class loginPage extends BaseClass
{
   @FindBy(name="username")
  private WebElement usernam;
	
   @FindBy(name="password")
   private  WebElement password;
   
   @FindBy(xpath="//*[text()=' Login ']")
   private WebElement button;
   
   
   public loginPage()
   {
	 PageFactory.initElements(driver, this);
   }
	public void login(String uname,String pass)
	{
		usernam.sendKeys(uname);
		password.sendKeys(pass);
		button.click();
	}
}
