package TestLayer;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

import PageLayer.loginPage;

public class LoginPageTest extends BaseClass {

	
	@BeforeTest
	public void AblLoginPage()
	{
		BaseClass.initilizaton();
		BaseClass.setUp();
	}
	@Test(priority=1)
	public void loginPag()
	{
		
		loginPage l=new loginPage();
		l.login("Admin","admin123");
		l.login("Admin","admin123");
	}
	
	
	}
