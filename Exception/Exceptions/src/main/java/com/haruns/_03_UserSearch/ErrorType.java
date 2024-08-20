package com.haruns._03_UserSearch;

public enum ErrorType {
	REPOSITORY_USER_NOT_FOUND(1001,"Aradiginiz kullanici bulunamadi."),
	REPOSITORY_USER_SAVE_ERROR(1002,"Kullanici daha onceden kayitli oldugu icin kayit edilemedi.");
	
	
	private int code;
	private String message;
	
	ErrorType() {
	}
	
	ErrorType(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}
}