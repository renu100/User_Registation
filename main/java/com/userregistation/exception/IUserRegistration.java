package com.userregistation.exception;

@FunctionalInterface
public interface IUserRegistration<T> {
	boolean validate(T param);
}
