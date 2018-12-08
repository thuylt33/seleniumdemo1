package TestAutoWebElement;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobject.DangKyPage;

public class TestWebDriver {
WebDriver driver;
    
    @Test
    public void firstTestCase1()
    {

	System.setProperty("webdriver.chrome.driver", "D:\\program\\AutoVT\\installAutoTest\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.lazada.vn/");
	
	driver.manage().window().maximize();
	
	if(driver.getTitle().equals("Lazada.vietnam")) {
		driver.get("https://member.lazada.vn/user/register?spm=a2o4n.home.header.d6.1905e182eA4CA3");
	}
	else {
		driver.navigate().to("https://tiki.vn");

	}
	System.out.println(driver.getTitle());
    }
	
}
