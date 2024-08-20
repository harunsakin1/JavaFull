package com.haruns._03_UserSearch;

public class Runner {
	public static void main(String[] args) {
		UserRepository repo=new UserRepository();
		User ali = null;
		try {
			ali = repo.getUserByName("qwe");
			System.out.println(ali);
		}
		catch (UserNotFoundException e) {
			System.err.println(e.getErrorType().getCode()+" "+e.getErrorType().getMessage());
		}
		
		System.out.println("----------------------");
		try {
			repo.getUserListByName("w").forEach(System.out::println);
		}
		catch (UserNotFoundException e) {
			System.err.println(e.getErrorType().getCode()+" "+e.getMessage());
			
		}
		
	}
}