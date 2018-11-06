package com.capgemini.paymentwallet.test;

import com.capgemini.paymentwallet.service.PaymentWalletValidation;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PaymentWalletValidationTest extends TestCase {

	PaymentWalletValidation validate = new PaymentWalletValidation();
	
	public void testValidateAadharNo() {
		
		Assert.assertEquals(true, validate.validateAadharNo("267617192989"));
		Assert.assertEquals(false, validate.validateAadharNo("12345"));
		
	}

	public void testValidateCustomerName() {
		
		Assert.assertEquals(true, validate.validateCustomerName("Kavya"));
		Assert.assertEquals(false, validate.validateCustomerName("Kav"));
		
	}

	public void testValidateGender() {
		
		Assert.assertEquals(true, validate.validateGender("Male"));
		Assert.assertEquals(true, validate.validateGender("Female"));
		Assert.assertEquals(false, validate.validateGender("Blue"));
		
	}

	public void testValidateUserName() {
	
		Assert.assertEquals(true, validate.validateUserName("Kavya1"));
		Assert.assertEquals(false, validate.validateUserName("kavya"));
		
		
	}

	public void testValidateMobileNo() {
		
		Assert.assertEquals(true, validate.validateMobileNo("9876543210"));
		Assert.assertEquals(false, validate.validateMobileNo("abcde123"));
		
	}

	public void testValidateCustInitBal() {
		
		Assert.assertEquals(true , validate.validateCustInitBal(50000));
		Assert.assertEquals(false, validate.validateCustInitBal(500));
	
	}

	public void testValidateUserPassword() {
		
		Assert.assertEquals(true , validate.validateUserPassword("12345678"));
		Assert.assertEquals(false, validate.validateUserPassword("abc12345"));
	
	}

	public void testValidateEmailId() {
		
		Assert.assertEquals(true, validate.validateEmailId("ksappy9@@gmail.com"));
		Assert.assertEquals(false, validate.validateEmailId("def"));
	
	}

}
