package steps;

import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass{

	public static RemoteWebDriver driver;

/*	@BeforeMethod
	public void preCondition() {
		// Code to open chrome browser and load the application
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	@AfterMethod
	public void postCondition() throws Exception {
		// Code to close the browser
		Thread.sleep(3000);
		driver.close();


	} */
}


