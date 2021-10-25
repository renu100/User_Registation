package com.userregistation.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	/*
	 * create method to check first name
	 */
	public boolean firstName(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{3,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(firstName);
		return match.matches();

	}

	/*
	 * create method to check last name
	 */
	public boolean lastName(String lastName) {
		String regex = "^[A-Z]{1}[a-z]{4,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}

	/*
	 * create method to check email address
	 */
	public boolean emailAddress(String email) {
		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	/*
	 * create method to check mobile number
	 */
	public boolean phoneNumber(String phoneNumber) {
		String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phoneNumber);
		return matcher.matches();
	}

	/*
	 * create method to check minimum 8 Characters
	 */
	public boolean passwordRule1(String password) {
		String regex = "^[0-9a-zA-Z]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}

}
