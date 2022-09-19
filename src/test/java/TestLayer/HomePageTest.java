package TestLayer;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import PageLayer.loginPage;

public class HomePageTest extends BaseClass {
	
	
	@Test(priority=1,groups= {"loginpGE"})
	public void AblLoginPage()
	{
		BaseClass.initilizaton();
		BaseClass.setUp();
	}
	@Test(priority=2,groups= {"loginpGE"})
	public void loginPag()
	{
		
		loginPage l=new loginPage();
		l.login("Admin","admin123");
		l.login("Admin","admin123");
	}
	
	
	@Test(dependsOnGroups= {"loginpGE"},groups= {"Home"})
	public void home()
	{
		HomePage h=new HomePage();
		h.PIM();
		Boolean j=h.URL();
		Assert.assertEquals(j, true);
	}
}
