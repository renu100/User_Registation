package com.userregistation.exception;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration userRegistration = new UserRegistration();

	// Test case for valid first name
	@Test
	public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
		String result = userRegistration.firstName("Renu");
		Assert.assertEquals("happy", result);
	}

	// Test case for invalid first name
	@Test
	public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
		String result = userRegistration.firstName("renu");
		Assert.assertEquals("sad", result);
	}

	// Test case for valid last name
	@Test
	public void givenLastName_WhenInFormat_ShouldReturnTrue() {
		String result = userRegistration.lastName("Chandraker");
		Assert.assertEquals("happy", result);
	}

	// Test case for invalid last name
	@Test
	public void givenLastName_WhenOurOfFormat_ShouldReturnFalse() {
		String result = userRegistration.lastName("chandraker");
		Assert.assertEquals("sad", result);

	}

	// Test case for valid Email address
	@Test
	public void givenEmail_WhenInFormat_ShouldReturnTrue() {
		String result = userRegistration.emailAddress("abc@gmail.com");
		Assert.assertEquals("happy", result);
	}

	// Test case for invalid Email address
	@Test
	public void givenEmail_WhenOurOfFormat_ShouldReturnFalse() {
		String result = userRegistration.emailAddress("abc()*gmail.com");
		Assert.assertEquals("sad", result);
	}

	// Test case for valid mobile number
	@Test
	public void givenPhoneNumber_WhenInFormat_ShouldReturnTrue() {
		String result = userRegistration.phoneNumber("91 9604315270");
		Assert.assertEquals("happy", result);
	}

	// Test case for invalid mobile number
	@Test
	public void givenPhoneNumber_WhenOurOfFormat_ShouldReturnFlase() {
		String result = userRegistration.phoneNumber("+91 9604315270");
		Assert.assertEquals("sad", result);
	}

	// Test case for valid password minimum 8 Characters
	@Test
	public void givenPassword_WhenInFormat_ShouldReturnTrue() {
		String result = userRegistration.passwordRule1("abcdegfhij");
		Assert.assertEquals("happy", result);
	}

	// Test case for invalid password minimum 8 Characters
	@Test
	public void givenPassword_WhenOurOfFormat_ShouldReturnFalse() {
		String result = userRegistration.passwordRule1("abcd");
		Assert.assertEquals("sad", result);
	}

	// Test case for valid password it contains atleast 1 upper case
	@Test
	public void givenPasswordRule2_WhenInFormat_ShouldReturnTrue() {
		String result = userRegistration.passwordRule2("Abcdefghij");
		Assert.assertEquals("happy", result);
	}

	// Test case for invalid password that not contains atleast 1 Upper Case
	@Test
	public void givenPasswordRule2_WhenOurOfFormat_ShouldReturnFalse() {
		String result = userRegistration.passwordRule2("abcdefghij");
		Assert.assertEquals("sad", result);
	}

	// Test case for valid password it contains atleast 1 numeric number
	@Test
	public void givenPasswordRule3_WhenInFormat_ShouldReturnTrue() {
		String result = userRegistration.passwordRule3("Rajendra22");
		Assert.assertEquals("happy", result);
	}

	// Test case for invalid password that not contains atleast 1 numeric number
	@Test
	public void givenPasswordRule3_WhenOurOfFormat_ShouldReturnFalse() {
		String result = userRegistration.passwordRule3("Rajendra");
		Assert.assertEquals("sad", result);
	}

	// Test case for valid password it contains atleast 1 Special Character
	@Test
	public void givenPasswordRule4_WhenInFormat_ShouldReturnTrue() {
		String result = userRegistration.passwordRule4("Rajendra@22");
		Assert.assertEquals("happy", result);
	}

	// Test case for invalid password that not contains atleast 1 Special Character
	@Test
	public void givenPasswordRule4_WhenOurOfFormat_ShouldReturnFalse() {
		String result = userRegistration.passwordRule4("Rajendra");
		Assert.assertEquals("sad", result);
	}

	// Test case for valid Email id
	@Test
	public void givenEmail4_WhenInFormat_ShouldReturnTrue() {
		String result = userRegistration.emailAddressSample("abc@1.com");
		Assert.assertEquals("happy", result);
	}

	// Test case for invalid Email id
	@Test
	public void givenEmail4_WhenOurOfFormat_ShouldReturnFalse() {
		String result = userRegistration.emailAddressSample("aabc.@gmail.com");
		Assert.assertEquals("sad", result);
	}

}