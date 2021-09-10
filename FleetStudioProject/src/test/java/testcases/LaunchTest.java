package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import fleetstudiopages.FleetStudioWorkPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchTest {
	
	public static WebDriver driver;
	FleetStudioWorkPage fswp;
	@BeforeSuite
	public void launchbrowser() {
	//	System.setProperty("webdriver.chrome.driver", "F:\\Automation\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		
		
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fleetstudio.com/works/");
	}
	@BeforeClass
	public void createobject() {
		fswp = new FleetStudioWorkPage(driver);
		
	}
	@AfterSuite
	public void CloseBrower() {
		driver.quit();
		
	}

}
