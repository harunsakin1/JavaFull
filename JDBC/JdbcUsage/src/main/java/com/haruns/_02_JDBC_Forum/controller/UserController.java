package com.haruns._02_JDBC_Forum.controller;

import com.haruns._02_JDBC_Forum.entity.User;
import com.haruns._02_JDBC_Forum.repository.UserRepository;

import java.util.Optional;
import java.util.Scanner;

public class UserController {
	 static Scanner sc=new Scanner(System.in);
	 private final UserRepository userRepository;
	
	public UserController() {
		this.userRepository=new UserRepository();
	}
	
	public void register(){
		System.out.print("Adınızı giriniz : ");
		String ad=sc.nextLine();
		System.out.print("Soyadınızı giriniz : ");
		String soyad=sc.nextLine();
		while (true){
			System.out.print("Kullanıcı Adınızı giriniz : ");
			String username=sc.nextLine();
			if (!userRepository.existByUsername(username)){
				System.out.print("Şifrenizi giriniz : ");
				String password=sc.nextLine();
				userRepository.save(new User(ad, soyad, username, password));
				System.out.println("Kullanıcı kaydı başarı ile oluşturulmuştur.");
				return;
			}
		}
	}
	public User girisYap(){
		System.out.print("Kullanıcı adı : ");
		String username=sc.nextLine();
		System.out.print("Şifre : ");
		String password=sc.nextLine();
		Optional<User> user = userRepository.doLogin(username, password);
		if (user.isPresent())
		{
			return user.get();
			// burada giriş yapan user'a her yerden erişilebilmeli.
		}
		System.out.println("Kullanıcı adı veya şifre hatalı");
		return null;
	}
}