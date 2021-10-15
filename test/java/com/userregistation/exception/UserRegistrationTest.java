package com.userregistation.exception;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration userRegistration = new UserRegistration();

	// Testcase for valid name
	@Test
	public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Renu");
		Assert.assertEquals(true, result);
	}

	// Testcase for invalid name
	@Test
	public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
		boolean result = userRegistration.firstName("renu");
		Assert.assertEquals(false, result);
	}

}