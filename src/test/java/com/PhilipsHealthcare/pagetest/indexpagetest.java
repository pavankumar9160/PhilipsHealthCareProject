package com.PhilipsHealthcare.pagetest;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.philipshealthcare.base.BaseClass;
import com.philipshealthcare.pageobjects.bussinesssignuppage;
import com.philipshealthcare.pageobjects.createbussinessaccountpage;
import com.philipshealthcare.pageobjects.indexpage;
import com.philipshealthcare.pageobjects.searchproductpage;
import com.philipshealthcare.utility.ListenerClass;
import com.philipshealthcare.utility.Log;

public class indexpagetest extends BaseClass{

	indexpage indexpage;
	searchproductpage searchproductpage ;
	createbussinessaccountpage createaccountpage;
	@Test
	public void consumerproduct() {
		indexpage indexpage= new indexpage();
		Log.info("verify the text");
		boolean result = indexpage.verifytext();
		Assert.assertTrue(result);
		Log.info("text verified succesfully");
		Log.info("click on the consumerproducts button");
		searchproductpage=indexpage.clickconsumerproducts();
		Log.info("clicked on the button");
	}
	@BeforeMethod
	public void setup(){
		launchApp("Chrome");
	}
	@AfterMethod
	public void terminate() {
		driver.close();
	}

}
