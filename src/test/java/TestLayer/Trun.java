package TestLayer;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trun {

	@Test(priority=1,dataProvider="sa")
	public void setup(String uname,String pass)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pass);
		
	}
	@DataProvider(name="sa")
	public Object[][] data() throws IOException
	{
		u1 u=new u1("C:\\\\Users\\\\vilaas\\\\eclipse-workspace\\\\TestNg\\\\data.xlsx");
		
		int row =u.gerrow(0);
		System.out.println(row);
		int cell=u.gercell(0);
		
		System.out.println(cell);
		
		Object[][] o=new Object[row][cell];
		
		for(int i=0;i<row;i++)
		{
			o[i][0]=u.data1(0, i, 0);
			o[i][1]=u.data1(0, i, 1);
			
		}
		return o;
	}
	
	
	
	
}
