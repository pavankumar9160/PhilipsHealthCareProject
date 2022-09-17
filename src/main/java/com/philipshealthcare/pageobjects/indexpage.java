package com.philipshealthcare.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.philipshealthcare.actiondriver.Action;
import com.philipshealthcare.base.BaseClass;

public class indexpage extends BaseClass{
	Action action = new Action();
	
	@FindBy(xpath="//span[contains(text(),'Consumer products')]")
	WebElement consumerproducts_btn;
	
	@FindBy(xpath="//*[@id='gc04v3-WBKx9ARaYXDiy4Mg']/div/div/div[2]/div/section/div/div/div/a")
	WebElement register_btn;
	
public indexpage() {
	PageFactory.initElements(driver, this);
}


public boolean verifytext() {
	action.implicitWait(driver, 20);
	return action.isDisplayed(driver, consumerproducts_btn);
}
public searchproductpage clickconsumerproducts() {
	action.click(driver, consumerproducts_btn);
	return new  searchproductpage();
}

public createbussinessaccountpage clickhere() {
	
	action.click(driver, register_btn);
	action.switchToNewWindow(driver);
	return new createbussinessaccountpage(); 
	
}

}
