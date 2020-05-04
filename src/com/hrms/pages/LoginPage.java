package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class LoginPage extends BaseClass{
static By txt_loginname = By.name("txtUserName");
static By txt_passowrd  = By.xpath("//input[@name='txtPassword']");
static By btn_login = By.name("Submit");
public static void login(String un,String pw) throws Exception{
driver.findElement(txt_loginname).sendKeys(un);
driver.findElement(txt_passowrd).sendKeys(pw);
driver.findElement(btn_login).click();
Thread.sleep(3000);
Reporter.log("Login completed");
}
}
