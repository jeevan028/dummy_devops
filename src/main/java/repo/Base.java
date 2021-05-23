package repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base {
	WebDriver driver;
	@FindBy(xpath="//input[@name='txtUserName']")WebElement usid;
	@FindBy(xpath="//input[@name='txtPassword']")WebElement pass;
	@FindBy(xpath="//input[@name='Submit']")WebElement press;
	@FindBy(linkText="Logout")WebElement out;
	
	
	public Base(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement user() {
		return usid;
	}
	public WebElement pw() {
		return pass;
	}
	public WebElement click() {
		return press;
	}
	public WebElement logout() {
		return out;
	}
	
	

}
