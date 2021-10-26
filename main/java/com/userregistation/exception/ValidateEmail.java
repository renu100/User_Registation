package com.userregistation.exception;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ValidateEmail {
	private String email12test;
	private String expectedResult;

	public ValidateEmail(String email12test, String expectedResult) {
		super();
		this.email12test = email12test;
		this.expectedResult = expectedResult;
	}

	UserRegistration userRegistration = new UserRegistration();

	@Parameterized.Parameters
	public static Collection data()  {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", "happy" }, { "abc111@abc.com", "happy"  },
				{ "abc@1.com", "happy" }, { "abc","sad"}, { "abcgmail.com","sad"}});
	}

	@Test
	public void emailcheck() {
		System.out.println("Parameterized Email is : " + email12test);
		assertEquals(expectedResult, userRegistration.emailAddressSample(email12test));
	}

}