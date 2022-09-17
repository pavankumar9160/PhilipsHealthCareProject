package com.PhilipsHealthcare.pagetest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.philipshealthcare.base.BaseClass;
import com.philipshealthcare.pageobjects.createaccountpage;
import com.philipshealthcare.pageobjects.indexpage;
import com.philipshealthcare.pageobjects.searchproductpage;
import com.philipshealthcare.pageobjects.signuppage;
import com.philipshealthcare.utility.DataProviders;
import com.philipshealthcare.utility.Log;

public class createaccountpagetest extends BaseClass{
	 indexpage indexpage;
	 searchproductpage searchproductpage;
		signuppage signuppage;
		createaccountpage createaccountpage;
	
	@BeforeMethod
	public void setup(){
		launchApp("Chrome");
	}
	@AfterMethod
	public void terminate() {
		driver.close();
	}
	@Test(dataProvider="registerdata",dataProviderClass=DataProviders.class)
	public void createaccounttest(String email,String password,String firstname,String lastname,String gender) {
		indexpage = new indexpage();
		Log.info("verift the text");
	boolean result=	indexpage.verifytext();
	Assert.assertTrue(result);
	Log.info("text verified");
	 searchproductpage= new searchproductpage();
	 Log.info("click on the consumer products");
	searchproductpage=indexpage.clickconsumerproducts();
	Log.info("clicked on the consumerproducts");
	signuppage = new signuppage();
	Log.info("click on signup button");
	signuppage = searchproductpage.signupbutton();
	Log.info("signup button clicked");
	createaccountpage=new createaccountpage();
	Log.info("click on create account");
	createaccountpage=signuppage.createaccount();
	Log.info("clicked on the create account button");
	Log.info("enter the details");
	createaccountpage.createaccount(email,password, firstname, lastname, gender);
	Log.info("successfully entered the register details");
	
	}

}
