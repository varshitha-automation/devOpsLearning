package docker.jenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public static WebDriver driver;

	public static void init()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
	}

}
