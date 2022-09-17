package com.philipshealthcare.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.philipshealthcare.actiondriver.Action;
import com.philipshealthcare.base.BaseClass;

public class createaccountpage extends BaseClass{
	
	Action action = new Action();

	@FindBy(xpath="//h1[contains(text(),'Continue to 'Philips')]")
	WebElement verifytext;
	
	@FindBy(xpath="//input[@id='capture_traditionalRegistration_emailAddress']")
	WebElement emailaddress;
	
	@FindBy(xpath="//input[@id='capture_traditionalRegistration_newPassword']")
	WebElement choosepswd;
	
	@FindBy(xpath="//input[@id='capture_traditionalRegistration_firstName']")
	WebElement first_name;
	
	@FindBy(xpath="//input[@id='capture_traditionalRegistration_lastName']")
	WebElement last_name;
	
	@FindBy(xpath="//select[@id='capture_traditionalRegistration_gender']")
	WebElement gender;
	
	@FindBy(xpath="//input[@id='capture_traditionalRegistration_informationOptIn']")
	WebElement tickbox;
	
	@FindBy(xpath="//*[@class='register-button']")
	WebElement register_btn;
	
	public createaccountpage() {
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifytext() {
		return action.isDisplayed(driver,verifytext);
	}
	
	public void createaccount(String email,String pwd,String fname,String lname,String value) {
		action.type(emailaddress, email);
		action.type(choosepswd, pwd);
		action.type(first_name, fname);
		action.type(last_name, lname);
		action.implicitWait(driver, 20);
		action.selectByValue(gender, value);
		action.click(driver, tickbox);
		action.click(driver,register_btn);
		
	}
	
	
}
