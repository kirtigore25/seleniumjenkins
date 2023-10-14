package com.selenium;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.msc.D1app;




@Test
public class Apptest {
	public void testlogin() {
		D1app myapp =new D1app();
		Assert.assertEquals(0,myapp.User_Login("abc","abc123"));
		
	}
	public void testlogin1() {
		D1app myapp =new D1app();
		Assert.assertEquals(0,myapp.User_Login("abc","abc@123"));
		
	}

}
