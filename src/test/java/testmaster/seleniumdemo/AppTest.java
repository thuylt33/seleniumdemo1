package testmaster.seleniumdemo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageobject.DangKyPage;
import pageobject.loginpage;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    WebDriver driver;
    
    @Test
    public void firstTestCase()
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\program\\AutoVT\\installAutoTest\\chromedriver.exe");
    	driver= new ChromeDriver();
    	//driver= new FirefoxDriver();

    	//webdriver.gecko.driver
    	//driver.get("https://member.lazada.vn/user/login?spm=a2o4n.home.header.d5.19056afeWNz03N&redirect=https%3A%2F%2Fwww.lazada.vn%2F");
    	driver.get("https://member.lazada.vn/user/register?spm=a2o4n.login_signup.header.d6.15185d0aGiHplR");
    	//Nhap Username
    	DangKyPage lgPage = new DangKyPage(driver);
    	//lgPage.txtUserName.sendKeys("khanh.tx@live.com");
    	lgPage.txtPhoneNumber.sendKeys("0988960508");
    	lgPage.txtPassword.sendKeys("1234456@u");

    	lgPage.SpanMonth.click();
    	lgPage.ChonThang.click();
    	
    	
    	
    	//chon Ngay
    	lgPage.SpanDate.click();
    	lgPage.ChonNgay.click();
    	
        assertTrue( true );
    }
}
