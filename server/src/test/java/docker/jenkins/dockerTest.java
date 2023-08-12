package docker.jenkins;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dockerTest extends base
{
    @Test(priority=1)
    public void dockerCICD()
    {
    	init();
        System.out.println("learning CI/CD");
        driver.get("http://localhost:9091/webapp/");
        Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
        driver.close();
    }
    
	/*
	 * @Test(priority=2) public void learn() { init();
	 * driver.findElement(By.id("APjFqb")).sendKeys("hi");
	 * System.out.println("learning first CI/CD");
	 * System.out.println("==================="); }
	 */
}
