package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC001 {
@Test
public static void tc001() throws Exception{
	
	BaseClass.openApplication();
	VerifyPage.verifyTitle("HRMS");
	LoginPage.login("admin", "admin");
	VerifyPage.verifyTitle("OrangeHRM");
	LogoutPage.logout();
	BaseClass.closeApplication();
}
}
