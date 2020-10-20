package com.ta.salesforce.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ta.salesforce.testcases.BaseClass;

public class loginPage extends BaseClass{
	
static WebDriver driver;

public loginPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//a[contains(text(),'Login')]")
@CacheLookup
WebElement txtlogin;


@FindBy(id="username")
@CacheLookup
WebElement Username;

@FindBy(id="password")
@CacheLookup
WebElement Password;

@FindBy(id="Login")
@CacheLookup
WebElement btnLogin;

@FindBy(xpath="//a[contains(text(),'Home')]")
@CacheLookup
WebElement txtHome;

public void LoginToWebsite()  {

driver.get("https://www.salesforce.com/");
 

driver.manage().window().maximize();
 
SaleUtil.explicitWaitFun(txtlogin);
SaleUtil.ufClickElement(txtlogin);
 
SaleUtil.explicitWaitFun1(Username);

 
SaleUtil.ufClickElement(Username);
SaleUtil.ufClearElement(Username);
 SaleUtil.ufSendkeys(Username,"shiny@ati.com");

 
SaleUtil.ufClickElement(Password);
SaleUtil.ufClearElement(Password);
 SaleUtil.ufSendkeys(Password,"apple123");

 
SaleUtil.ufClickElement(btnLogin);

 
SaleUtil.ufClickElement(txtHome);


}
}
