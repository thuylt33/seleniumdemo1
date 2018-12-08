package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class DangKyPage {
	private WebDriver driver;
	
	@FindBy(xpath="//div[@class='mod-input mod-login-input-phone mod-input-phone']//input")
	public WebElement txtPhoneNumber;
	
	@FindBy(xpath="//div[@class='mod-input mod-input-password mod-login-input-password mod-input-password']//input")
	public WebElement txtPassword;
	
	
	@FindBy(xpath="//div[@class='mod-birthday-month']//span[@class='next-select-placeholder']")
	public WebElement SpanMonth;
	
	
	@FindBy(xpath="//div[@data-tag='gateway-wrapper']//ul[@class='next-menu-content']/li[@value='2']")
	public WebElement ChonThang;
	
	//Span Date
	@FindBy(xpath="//span[@id='day']")
	public WebElement SpanDate;
	
	@FindBy(xpath="//ul[@class='next-menu-content']/li[@value='2']")
	public WebElement ChonNgay;
	
	public DangKyPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
