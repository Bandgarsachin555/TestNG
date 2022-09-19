package TestLayer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class runnerr {

	@Test(dataProvider="sa",priority=1)
	public void setup(String uname,String pass)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(uname);
		driver.findElement(By.name("pass")).sendKeys(pass);
	}
	
	@DataProvider(name="sa")
	public Object[][] getd() throws IOException
	{
		utilss pth=new utilss("C:\\Users\\vilaas\\eclipse-workspace\\TestNg\\data.xlsx");
		int rows=pth.getrow(0);
		System.out.println(rows+"rows");
		int cell=pth.getcell(0);
		System.out.println(cell+"rows");
		
		Object[][] o=new Object[rows][cell];
		
		for(int i=0;i>1;i++)
		{
			o[i][0]=pth.getdata(0, i, 0);
			System.out.print(o[i][0]);
			
			    o[i][1]    =pth.getdata(0, i, 0);
			    System.out.print(o[i][1]);
					}
		return o;
	}
	
	
	
	
}
