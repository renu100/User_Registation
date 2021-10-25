package com.userregistation.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	/*
	 * create method to check first name
	 */
	public String firstName(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{3,}";
		if (Pattern.matches(regex, firstName)) {
			return "happy";
		} else {
			return "sad";
		}
	}

	/*
	 * create method to check last name
	 */
	public String lastName(String lastName) {
		String regex = "^[A-Z]{1}[a-z]{4,}";
		if (Pattern.matches(regex, lastName)) {
			return "happy";
		} else {
			return "sad";
		}
	}

	/*
	 * create method to check email address
	 */
	public String emailAddress(String email) {
		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
		if (Pattern.matches(regex, email)) {
			return "happy";
		} else {
			return "sad";
		}
	}

	/*
	 * create method to check mobile number
	 */
	public String phoneNumber(String phoneNumber) {
		String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
		if (Pattern.matches(regex, phoneNumber)) {
			return "happy";
		} else {
			return "sad";
		}
	}

	/*
	 * create method to check minimum 8 Characters
	 */
	public String passwordRule1(String password) {
		String regex = "^[0-9a-zA-Z]{8,}$";
		if (Pattern.matches(regex, password)) {
			return "happy";
		} else {
			return "sad";
		}
	}

	/*
	 * Method to check Should have at least 1 Upper Case
	 */
	public String passwordRule2(String password) {
		String regex = "^[A-Z]{1}[a-z]{8,}$";
		if (Pattern.matches(regex, password)) {
			return "happy";
		} else {
			return "sad";
		}
	}

	/*
	 * Should have at least 1 numeric number in the password
	 */
	public String passwordRule3(String password) {
		String regex = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9]).{8,}$";
		if (Pattern.matches(regex, password)) {
			return "happy";
		} else {
			return "sad";
		}
	}

	/*
	 * Password has exactly 1 Special Character
	 */
	public String passwordRule4(String password) {
		String regex = "^[A-Z]{1}[0-9a-zA-Z!,@#$&*().]{8,}$";
		if (Pattern.matches(regex, password)) {
			return "happy";
		} else {
			return "sad";
		}
	}

	/*
	 * create a method for some sample e-mails
	 */

	public String emailAddressSample(String emailId) {
		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
		if (Pattern.matches(regex, emailId)) {
			return "happy";
		} else {
			return "sad";
		}
	}

}
