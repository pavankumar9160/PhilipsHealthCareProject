package com.PhilipsHealthcare.pagetest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.philipshealthcare.base.BaseClass;
import com.philipshealthcare.pageobjects.createbussinessaccountpage;
import com.philipshealthcare.pageobjects.indexpage;
import com.philipshealthcare.pageobjects.bussinesssignuppage;
import com.philipshealthcare.utility.DataProviders;
import com.philipshealthcare.utility.Log;

public class createbussinessaccountpagetest extends BaseClass{

	indexpage indexpage;
	bussinesssignuppage signuppage;
	createbussinessaccountpage createbussinessaccountpage;
	
	
	@BeforeMethod
	public void setup(){
		launchApp("Chrome");
	}
	@AfterMethod
	public void terminate() {
		driver.close();
	}
	
	
	@Test(dataProvider="bussinessregisterdata",dataProviderClass=DataProviders.class)
	public void bussinessaccountcreatetest(String fname,
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
		 indexpage = new indexpage();
		 createbussinessaccountpage=new createbussinessaccountpage();
		createbussinessaccountpage= indexpage.clickhere();
		Log.info("enter personal details");
		createbussinessaccountpage.enterdetails(fname,lname,phone,email,role,orgname1,orgntype,compadd,cty,
				cntry,state,postcode,orgname2,orgadd,orgcty,orgcntry,orgstate,orgpstcde);
		Log.info("verify the title");
		boolean result1 =createbussinessaccountpage.verifythetitle();
		Assert.assertTrue(result1);
	}
}
