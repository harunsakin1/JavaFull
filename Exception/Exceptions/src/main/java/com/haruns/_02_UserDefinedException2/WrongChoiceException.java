package com.haruns._02_UserDefinedException2;

public class WrongChoiceException extends Exception{
	
	public WrongChoiceException() {
		super();
	}
	
	public WrongChoiceException(String message) {
		super(message);
	}
}