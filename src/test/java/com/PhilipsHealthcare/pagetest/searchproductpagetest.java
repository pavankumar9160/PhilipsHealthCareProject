package com.PhilipsHealthcare.pagetest;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.philipshealthcare.base.BaseClass;
import com.philipshealthcare.pageobjects.indexpage;
import com.philipshealthcare.pageobjects.searchproductpage;
import com.philipshealthcare.utility.Log;

public class searchproductpagetest extends BaseClass{
	searchproductpage searchproductpage;
	
	@BeforeMethod
	public void setup(){
		launchApp("Chrome");
	}
	@AfterMethod
	public void terminate() {
		driver.quit();
	}
	@Test
	public void searchforproduct() {
		indexpage indexpage = new indexpage();
		Log.info("verify the text");
	boolean	result = indexpage.verifytext();
	Assert.assertTrue(result);
	Log.info("text verified succesfully");
	Log.info("click on the consumerproducts button");
	indexpage.clickconsumerproducts();
	Log.info("clicked on the button");
	 searchproductpage = new searchproductpage();
	 Log.info("verify the automotive text");
	searchproductpage.verifytext();
	Log.info("text verified successfully");
	Log.info("click on the search product button");
	searchproductpage.product();
	Log.info("specifications are visible");
	
	}
}

