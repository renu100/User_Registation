package com.userregistation.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	/*
	 * create method to check first name
	 */
	public static boolean firstNameValidation(String firstName) throws InvalidUserDetailsException {
		try {
			IUserRegistration<String> obj = (fn) -> {
				String regex = "^[A-Z]{1}[a-z]{2,}$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(fn);
				return matcher.matches();
			};
			return obj.validate(firstName);

		} catch (NullPointerException exception) {
			throw new InvalidUserDetailsException("Invalid input");
		}
	}

	/*
	 * create method to check last name
	 */
	public static boolean lastNameValidation(String lastName) throws InvalidUserDetailsException {
		try {
			IUserRegistration<String> obj = (ln) -> {
				String regex = "^[A-Z]{1}[a-z]{4,}";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(ln);
				return matcher.matches();
			};
			return obj.validate(lastName);

		} catch (NullPointerException exception) {
			throw new InvalidUserDetailsException("Invalid input");
		}
	}

	/*
	 * create method to check email address
	 */
	public static boolean emailAddressValidation(String emailAddress) throws InvalidUserDetailsException {
		try {
			IUserRegistration<String> obj = (emailId) -> {
				String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(emailId);
				return matcher.matches();
			};
			return obj.validate(emailAddress);

		} catch (NullPointerException exception) {
			throw new InvalidUserDetailsException("Invalid input");
		}
	}

	/*
	 * create method to check mobile number
	 */
	public static boolean phoneNumberValidation(String phoneNumber) throws InvalidUserDetailsException {
		try {
			IUserRegistration<String> obj = (pNumber) -> {
				String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(pNumber);
				return matcher.matches();
			};
			return obj.validate(phoneNumber);

		} catch (NullPointerException exception) {
			throw new InvalidUserDetailsException("Invalid input");
		}
	}

	/*
	 * create method to check minimum 8 Characters
	 */
	public static boolean passwordValidationRule1(String password) throws InvalidUserDetailsException {
		try {
			IUserRegistration<String> obj = (pwd) -> {
				String regex = "^[0-9a-zA-Z]{8,}$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(pwd);
				return matcher.matches();
			};
			return obj.validate(password);

		} catch (NullPointerException exception) {
			throw new InvalidUserDetailsException("Invalid input");
		}
	}

	/*
	 * Method to check Should have at least 1 Upper Case
	 */
	public static boolean passwordValidationRule2(String password) throws InvalidUserDetailsException {
		try {
			IUserRegistration<String> obj = (pwd) -> {
				String regex = "^[A-Z]{1}[a-z]{8,}$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(pwd);
				return matcher.matches();
			};
			return obj.validate(password);

		} catch (NullPointerException exception) {
			throw new InvalidUserDetailsException("Invalid input");
		}
	}

	/*
	 * Should have at least 1 numeric number in the password
	 */
	public static boolean passwordValidationRule3(String password) throws InvalidUserDetailsException {
		try {
			IUserRegistration<String> obj = (pwd) -> {
				String regex = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9]).{8,}$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(pwd);
				return matcher.matches();
			};
			return obj.validate(password);

		} catch (NullPointerException exception) {
			throw new InvalidUserDetailsException("Invalid input");
		}
	}

	/*
	 * Password has exactly 1 Special Character
	 */
	public static boolean passwordValidationRule4(String password) throws InvalidUserDetailsException {
		try {
			IUserRegistration<String> obj = (pwd) -> {
				String regex = "^[A-Z]{1}[0-9a-zA-Z!,@#$&*().]{8,}$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(pwd);
				return matcher.matches();
			};
			return obj.validate(password);

		} catch (NullPointerException exception) {
			throw new InvalidUserDetailsException("Invalid input");
		}
	}

	/*
	 * create a method for some sample e-mails
	 */
	public static boolean emailAddressSampleValidation(String emailAddressSample) throws InvalidUserDetailsException {
		try {
			IUserRegistration<String> obj = (emailId) -> {
				String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(emailId);
				return matcher.matches();
			};
			return obj.validate(emailAddressSample);

		} catch (NullPointerException exception) {
			throw new InvalidUserDetailsException("Invalid input");
		}
	}
}
