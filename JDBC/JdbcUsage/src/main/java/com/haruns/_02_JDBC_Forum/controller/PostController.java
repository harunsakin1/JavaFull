package com.haruns._02_JDBC_Forum.controller;

import com.haruns._02_JDBC_Forum.entity.Post;
import com.haruns._02_JDBC_Forum.entity.User;
import com.haruns._02_JDBC_Forum.repository.PostRepository;
import com.haruns._02_JDBC_Forum.repository.UserRepository;

import java.time.LocalDate;
import java.util.Scanner;

public class PostController {
	static Scanner sc=new Scanner(System.in);
	private final PostRepository postRepository;
	private final UserRepository userRepository;
	
	
	public PostController() {
		this.postRepository=new PostRepository();
		this.userRepository=new UserRepository();
	}
	
	public void postlariGoruntule(){
		postRepository.findAll().forEach(System.out::println);
	}
	
	public void postPaylas(User user){
		System.out.print("Başlık giriniz : ");
		String baslik=sc.nextLine();
		System.out.print("İçerik giriniz : ");
		String icerik=sc.nextLine();
		postRepository.save(new Post(user.getId(), baslik, icerik, LocalDate.now()));
	}
	
	public void kendiPostlariniGoruntule(User user){
		postRepository.findPostsByUserId(user);
	}
	
	public void kullanicilariGoruntule(){
		userRepository.findAll().forEach(System.out::println);
	}
	
}