package com.haruns.optional;

import java.util.Optional;

public class User {
	private String email;
	private String password;
	private String address;
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public Optional<String> getAddress() {
		return Optional.ofNullable(address);
	}
}