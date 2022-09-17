package com.philipshealthcare.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.philipshealthcare.actiondriver.Action;
import com.philipshealthcare.base.BaseClass;

public class signuppage extends BaseClass {

	Action action= new Action();
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/section[1]/div[3]/div[3]/div[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/a[1]")
	WebElement createaccount_btn;
	
	
	
	public signuppage() {
		PageFactory.initElements(driver,this);
	}
	
	
	
	public createaccountpage createaccount() {
	action.click(driver, createaccount_btn);
	return new createaccountpage();
	}
}
