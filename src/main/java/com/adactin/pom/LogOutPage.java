package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	public WebDriver driver;
	public LogOutPage(WebDriver ldriver) {
           this.driver=ldriver;
           PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[text()='You have successfully logged out. ']")
	private WebElement LogOutMessage;
	
	
	public WebElement getLogOutMessage() {
		return LogOutMessage;
	}
	
	
	
}
