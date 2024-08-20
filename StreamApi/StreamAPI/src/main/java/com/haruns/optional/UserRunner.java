package com.haruns.optional;

public class UserRunner {
	public static void main(String[] args) {
		User user=new User("harun@gmail.com","123");
		user.getAddress().ifPresent(deger->{
			deger.toLowerCase();
			System.out.println(deger);
		});
	}
}