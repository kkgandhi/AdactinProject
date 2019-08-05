package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	public WebDriver driver;
	public SignInPage(WebDriver ldriver) {
        this.driver=ldriver;
        PageFactory.initElements(driver, this);
}
	
	@FindBy(name="username")
	private WebElement Username;
	
	@FindBy(name="password")
	private WebElement Pasword;
	
	@FindBy(name="login")
	private WebElement Login;
	
	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPasword() {
		return Pasword;
	}

	public WebElement getLogin() {
		return Login;
	}
	
	
	
}
