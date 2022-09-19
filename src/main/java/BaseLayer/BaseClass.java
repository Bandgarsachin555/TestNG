package BaseLayer;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class BaseClass {

  public static WebDriver driver ;
	public static void initilizaton()
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Setup Files\\chromedriver.exe");
		
		 driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	public static void setUp()
	{
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
		
	}
	
}
