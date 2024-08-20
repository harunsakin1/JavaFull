package com.haruns._03_UserSearch;

import java.util.Random;

public class User {
	private Long id;
	private String name;
	
	public User(String name) {
		this.id= new Random().nextLong();
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "User{" + "id=" + getId() + ", name='" + getName() + '\'' + '}';
	}
}