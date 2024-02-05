package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	WebDriver ldriver;
public AddCustomerPage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}

@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[2]/a")
@CacheLookup
WebElement lnkAddNewCustomer;

@FindBy(how=How.NAME,using="name")
@CacheLookup
WebElement txtCustomerName;

@FindBy(how=How.NAME,using="rad1")
@CacheLookup
WebElement rdGender;

@FindBy(how=How.ID_OR_NAME,using="dob")
@CacheLookup
WebElement txtdob;

@FindBy(how=How.NAME,using="addr")
@CacheLookup
WebElement txtaddress;

@FindBy(how=How.NAME,using="city")
@CacheLookup
WebElement txtcity;

@FindBy(how=How.NAME,using="state")
@CacheLookup
WebElement txtstate;

@FindBy(how=How.NAME,using="pin")
@CacheLookup
WebElement txtpin;

@FindBy(how=How.NAME,using="telephone")
@CacheLookup
WebElement txttelephone;

@FindBy(how=How.NAME,using="emailid")
@CacheLookup
WebElement txtmailid;

@FindBy(how=How.NAME,using="password")
@CacheLookup
WebElement txtpassword;

@FindBy(how=How.NAME,using="sub")
@CacheLookup
WebElement btnSubmit;

public void ClickAddNewCustomer() {
	lnkAddNewCustomer.click();
}
public void custName(String cname) {
	txtCustomerName.sendKeys(cname);
}

public void custgender(String cgender) {
	rdGender.click();
}
public void custdob(String mm,String dd,String yy) {
	txtdob.sendKeys(mm);
	txtdob.sendKeys(dd);
	txtdob.sendKeys(yy);
}
public void custaddress(String caddress) {
	txtaddress.sendKeys(caddress);
}
public void custcity(String ccity) {
	txtcity.sendKeys(ccity);
	
}

public void custstate(String cstate) {
	txtstate.sendKeys(cstate);
}

public void custpin(String cpin) {
	txtpin.sendKeys(String.valueOf(cpin));
}

public void custtelephone(String ctelephone) {
	txttelephone.sendKeys(ctelephone);
}

public void custemailid(String cmailid) {
	txtmailid.sendKeys(cmailid);
}


public void custpassword(String cpassword) {
	txtpassword.sendKeys(cpassword);
}

public void custsubmit(){
	btnSubmit.click();;
}


}
