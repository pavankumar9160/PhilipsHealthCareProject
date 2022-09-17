package com.philipshealthcare.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.philipshealthcare.actiondriver.Action;
import com.philipshealthcare.base.BaseClass;

public class searchproductpage extends BaseClass {
Action action = new Action();

@FindBy(xpath="//header/nav[1]/div[3]/div[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")
WebElement automotive_btn;

@FindBy(xpath="//header/div[3]/div[1]/div[2]/div[1]/button[1]")
WebElement profile_icon;

@FindBy(xpath="//span[contains(text(),'Sign up')]")
WebElement signup_btn;

@FindBy(xpath="//header/div[3]/div[1]/div[1]/div[2]/button[1]")
WebElement search_btn;

@FindBy(xpath="//input[@id='search_22425']")
WebElement search_field;

@FindBy(xpath="//header/div[3]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/form[1]/fieldset[1]/button[1]")
WebElement search;

@FindBy(xpath="//body[1]/div[1]/section[1]/div[1]/div[3]/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/a[2]/span[1]/span[1]")
WebElement specifications;

@FindBy(xpath="//button[contains(text(),'Show all Technical Specifications')]")
WebElement allspecifications; 

public searchproductpage() {
	PageFactory.initElements(driver,this);
}
public boolean verifytext() {
	return action.isDisplayed(driver, automotive_btn);
}

public void product() {
	action.click(driver, search_btn);
	action.type(search_field, "smart tv");
	action.click(driver, search);
	action.implicitWait(driver, 20);
	action.click(driver, specifications);
	action.click(driver, allspecifications);
}
public signuppage signupbutton() {
	action.click(driver, profile_icon);
	action.click(driver, signup_btn);
	return new signuppage();
	
	
	
}
}
