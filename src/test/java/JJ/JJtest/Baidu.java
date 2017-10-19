package JJ.JJtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Baidu {
	public WebDriver driver=new FirefoxDriver();
	@Test
	public void	 baidu(){
		driver.get("http://www.baidu.com");
	}
	@AfterClass
	public void release() throws InterruptedException{
		driver.quit();
		Thread.sleep(3000);
	}
}
