package com.philipshealthcare.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.philipshealthcare.actiondriver.Action;
import com.philipshealthcare.base.BaseClass;

public class createbussinessaccountpage extends BaseClass {
	
	Action action = new Action();

	@FindBy(xpath="//*[@id='firstName']")
	WebElement first_name;
	
	@FindBy(xpath="//*[@id='lastName']")
	WebElement last_name;
	
	@FindBy(xpath="//*[@id='phoneNumber']")
	WebElement phone_number;
	
	@FindBy(xpath="//*[@id='emailAddressId']")
	WebElement email_id;
	
	@FindBy(xpath="//*[@id='userTitle']")
	WebElement positiontitle;
	
	@FindBy(xpath="//*[@id='personalinfo']/div[5]/a")
	WebElement nextstep;
	
	@FindBy(xpath="//*[@id='haveHealthCareAcct']/label[2]/span")
	WebElement radiobtn;
	
	@FindBy(xpath="//*[@id='companyName']")
	WebElement orgname;
	
	@FindBy(xpath="//*[@id='orgType']")
	WebElement orgtype1;
	
	@FindBy(xpath="//*[@id='organisation']/div[4]/div[6]/a")
	WebElement nxtstep1;
	
	@FindBy(xpath="//*[@id='companyAddressPrimary']")
	WebElement comp_address;
	
	@FindBy(xpath="//*[@id='city']")
	WebElement city1;
	
	@FindBy(xpath="//*[@id='organisationCountry']")
	WebElement country1;
	
	@FindBy(xpath="//*[@id='state']")
	WebElement state1;
	
	@FindBy(xpath="//*[@id='postalCode']")
	WebElement postalcode1;
	
	@FindBy(xpath="//*[@id='billOrgName']")
	WebElement orgbillname;
	
	@FindBy(xpath="//*[@id='billOrgAddress']")
	WebElement orgbilladrs;
	
	@FindBy(xpath="//*[@id='billOrgCity']")
	WebElement orgbillcity;
	
	@FindBy(xpath="//*[@id='billOrgCountry']")
	WebElement orgbillcountry;
	
	@FindBy(xpath="//*[@id='billOrgState']")
	WebElement orgbillstate;
	
	@FindBy(xpath="//*[@id='billOrgPostCode']")
	WebElement orgbillpostcode;
	
	@FindBy(xpath="//*[@id='shippingOrganization']/label/span")
	WebElement tickbox;
	
	@FindBy(xpath="//*[@id='addresses']/div[6]/button")
	WebElement submit;
	
	@FindBy(xpath="/html/body/div[5]/div/div[4]/div[1]/div[2]/div[1]")
	WebElement verifytitle;
	public createbussinessaccountpage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterdetails(String fname,
			String lname,
			String phone,
			String email,
			String role,
			String orgname1,
			String orgntype,
			String compadd,
			String cty,
			String cntry,
			String state,
			String postcode,
			String orgname2,
			String orgadd,
			String orgcty,
			String orgcntry,
			String orgstate,
			String orgpstcde) {
		action.type(first_name,fname );
		action.type(last_name, lname);
		action.type(phone_number,phone);
		action.type(email_id, email);
		action.implicitWait(driver, 20);
		action.selectByVisibleText(role, positiontitle);
		action.click(driver,nextstep);
		action.implicitWait(driver, 30);
		action.click(driver, radiobtn);
		action.type(orgname, orgname1);
		action.implicitWait(driver, 20);
		action.selectByValue(orgtype1,orgntype);
		action.click(driver, nxtstep1);
		action.implicitWait(driver, 30);
		action.type(comp_address, compadd);
		action.type(city1, cty);
		action.implicitWait(driver, 20);
		action.selectByVisibleText(cntry,country1);
		action.implicitWait(driver, 20);
		action.selectByVisibleText(state, state1);
		action.type(postalcode1,postcode);
		action.type(orgbillname, orgname2);
		action.type(orgbilladrs, orgadd);
		action.type(orgbillcity, orgcty);
		action.implicitWait(driver, 20);
		action.selectByVisibleText(orgcntry, orgbillcountry);
		action.implicitWait(driver, 20);
		action.selectByVisibleText(orgstate, orgbillstate);
		action.type(orgbillpostcode, orgpstcde);
		action.click(driver, submit);
	}
	public boolean verifythetitle() {
	return action.isDisplayed(driver, verifytitle);
	}
}
