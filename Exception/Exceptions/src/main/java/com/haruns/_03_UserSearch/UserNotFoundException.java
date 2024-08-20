package com.haruns._03_UserSearch;

public class UserNotFoundException extends Exception{
	private final ErrorType errorType;
	
	public UserNotFoundException( ErrorType errorType) {
		super(errorType.getMessage());
		this.errorType = errorType;
	}
	public UserNotFoundException( ErrorType errorType,String message) {
		super(message);
		this.errorType = errorType;
	}
	
	public ErrorType getErrorType() {
		return errorType;
	}
}