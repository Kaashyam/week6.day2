package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksImplementation extends BaseClass{

	@Before
	public void preCondition() {
		// Code to open chrome browser and load the application
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	@After
	public void postCondition() throws Exception {
		// Code to close the browser
		Thread.sleep(3000);
		driver.close();


	}
}


