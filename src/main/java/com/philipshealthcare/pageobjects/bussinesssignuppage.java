package com.philipshealthcare.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.philipshealthcare.actiondriver.Action;
import com.philipshealthcare.base.BaseClass;

public class bussinesssignuppage extends BaseClass{

	Action action = new Action();
	
	@FindBy(xpath="/html/body/div[6]/div/div[5]/div/div/div/a[2]")
	WebElement createacntbtn;
	@FindBy(xpath="//*[@id='nav_main']/div/ul/li[1]")
	WebElement verifytxt;
	
	public bussinesssignuppage() {
		PageFactory.initElements(driver, this);
	}
	public boolean verifytext() {
	return action.isDisplayed(driver, verifytxt);
	}
	public createbussinessaccountpage createaccountbtn() {
		action.click(driver, createacntbtn);
		return new createbussinessaccountpage();
	}
}
