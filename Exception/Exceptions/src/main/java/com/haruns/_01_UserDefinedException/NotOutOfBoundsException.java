package com.haruns._01_UserDefinedException;
/*
NotOutOfBoundsException : Checked exception.
Eğer unchecked olmasını istersem RuntimeException'dan miras almalıyım.
 */
public class NotOutOfBoundsException extends Exception{
	
	public NotOutOfBoundsException() {
		super();
	}
	
	public NotOutOfBoundsException(String message) {
		super(message);
	}
}