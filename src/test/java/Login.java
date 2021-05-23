import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import repo.Base;

public class Login {
WebDriver driver;
	
    @Test
	public void set() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "J:\\New folder\\selenium\\JAR\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		Properties pro=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\jeevan kumar\\eclipse-workspace\\Total\\Cred.Properties");
		pro.load(fis);
		String Link=pro.getProperty("url");
		driver.get(Link);
		Base obj=new Base(driver);
		obj.user().sendKeys(pro.getProperty("uid"));
		obj.pw().sendKeys(pro.getProperty("pw"));
		obj.click().click();
		obj.logout().click();
		
}
	//@AfterTest
	public void SS() throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\jeevan kumar\\OneDrive\\Desktop\\SS\\one.png"));
	}
}
