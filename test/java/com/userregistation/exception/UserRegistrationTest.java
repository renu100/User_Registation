package com.userregistation.exception;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();

	// Test case for valid first name
	@Test
	public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.firstNameValidation("Renu");
		;
		Assert.assertEquals(true, result);
	}

	// Test case for invalid first name
	@Test
	public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
		try {
			boolean result = userRegistration.firstNameValidation("renu");
			Assert.assertEquals(false, result);
		} catch (InvalidUserDetailsException e) {
			System.out.println("invalid first name");
		}

	}

	// Test case for valid last name
	@Test
	public void givenLastName_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.lastNameValidation("Chandraker");
		Assert.assertEquals(true, result);
	}

	// Test case for invalid last name
	@Test
	public void givenLastName_WhenOurOfFormat_ShouldReturnFalse() {
		try {
			boolean result = userRegistration.lastNameValidation("chandraker");
			Assert.assertEquals(false, result);
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid last name");
		}

	}

	// Test case for valid Email address
	@Test
	public void givenEmail_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.emailAddressValidation("abc@gmail.com");
		Assert.assertEquals(true, result);
	}

	// Test case for invalid Email address
	@Test
	public void givenEmail_WhenOurOfFormat_ShouldReturnFalse() {
		try {
			boolean result = userRegistration.emailAddressValidation("abc()*gmail.com");
			Assert.assertEquals(false, result);
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid email id");
		}
	}

	// Test case for valid mobile number
	@Test
	public void givenPhoneNumber_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.phoneNumberValidation("91 9604315270");
		Assert.assertEquals(true, result);
	}

	// Test case for invalid mobile number
	@Test
	public void givenPhoneNumber_WhenOurOfFormat_ShouldReturnFlase() {
		try {
			boolean result = userRegistration.phoneNumberValidation("+91 9604315270");
			Assert.assertEquals(false, result);
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid mobile number");
		}
	}

	// Test case for valid password minimum 8 Characters
	@Test
	public void givenPassword_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.passwordValidationRule1("abcdegfhij");
		Assert.assertEquals(true, result);
	}

	// Test case for invalid password minimum 8 Characters
	@Test
	public void givenPassword_WhenOurOfFormat_ShouldReturnFalse() {
		try {
			boolean result = userRegistration.passwordValidationRule1("abcd");
			Assert.assertEquals(false, result);
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid password rule1");
		}
	}

	// Test case for valid password it contains atleast 1 upper case
	@Test
	public void givenPasswordRule2_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.passwordValidationRule2("Abcdefghij");
		Assert.assertEquals(true, result);
	}

	// Test case for invalid password that not contains atleast 1 Upper Case
	@Test
	public void givenPasswordRule2_WhenOurOfFormat_ShouldReturnFalse() {
		try {
			boolean result = userRegistration.passwordValidationRule2("abcdefghij");
			Assert.assertEquals(false, result);
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid password rule2");
		}
	}

	// Test case for valid password it contains atleast 1 numeric number
	@Test
	public void givenPasswordRule3_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.passwordValidationRule3("Rajendra22");
		Assert.assertEquals(true, result);
	}

	// Test case for invalid password that not contains atleast 1 numeric number
	@Test
	public void givenPasswordRule3_WhenOurOfFormat_ShouldReturnFalse() {
		try {
			boolean result = userRegistration.passwordValidationRule3("Rajendra");
			Assert.assertEquals(false, result);
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid password rule3");
		}
	}

	// Test case for valid password it contains atleast 1 Special Character
	@Test
	public void givenPasswordRule4_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.passwordValidationRule4("Rajendra@22");
		Assert.assertEquals(true, result);
	}

	// Test case for invalid password that not contains atleast 1 Special Character
	@Test
	public void givenPasswordRule4_WhenOurOfFormat_ShouldReturnFalse() {
		try {
			boolean result = userRegistration.passwordValidationRule4("Rajendra");
			Assert.assertEquals(false, result);
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid password rule4");
		}
	}

	// Test case for valid Email id
	@Test
	public void givenEmail4_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.emailAddressSampleValidation("abc@1.com");
		Assert.assertEquals(true, result);
	}

	// Test case for invalid Email id
	@Test
	public void givenEmail4_WhenOurOfFormat_ShouldReturnFalse() {
		try {
			boolean result = userRegistration.emailAddressSampleValidation("aabc.@gmail.com");
			Assert.assertEquals(false, result);
		} catch (InvalidUserDetailsException e) {
			System.out.println("Invalid password");
		}
	}

}