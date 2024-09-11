package com.haruns._02_JDBC_Forum;

import com.haruns._02_JDBC_Forum.controller.PostController;
import com.haruns._02_JDBC_Forum.entity.User;
import com.haruns._02_JDBC_Forum.controller.UserController;

import java.util.Scanner;

public class UserRegisterSystem {
	static Scanner sc=new Scanner(System.in);
	static UserController userController=new UserController();
	static PostController postController=new PostController();
	
	public static void main(String[] args) {
		startMenu();
	}
	
	public static int startMenu(){
		int secim;
		do {
			System.out.println("1- Kullanıcı Girişi");
			System.out.println("2- Kullanıcı Kayıt");
			System.out.println("0- Çıkış");
			System.out.print("Seçiminiz : ");
			secim=sc.nextInt();
			sc.nextLine();
			secim= startMenuOptions(secim);
		}while (secim!=0);
		return secim;
	}
	
	private static int startMenuOptions(int secim) {
		switch (secim){
			case 1:
				User user=userController.girisYap();
				if (user!=null){
					kullaniciMenu(user);
				}
				return secim;
			case 2:
				userController.register();
				return secim;
			case 0:
				System.out.println("Çıkış yapılıyor");
				return secim;
			default:
				System.out.println("Hatalı secim yaptınız.");
		}
		return secim;
	}
	public static int kullaniciMenu(User user){
		System.out.println("Hoşgeldin, "+user.getAd()+" "+user.getSoyad());
		int secim;
		do {
			System.out.println("1- Postları Görüntüle");
			System.out.println("2- Post Paylaş");
			System.out.println("3- Kendi Postlarını Görüntüle");
			System.out.println("4- Kullanıcı Listele");
			System.out.println("0- Oturumu Kapat");
			System.out.print("Seçiminiz : ");
			secim=sc.nextInt();
			sc.nextLine();
			secim= kullaniciMenuOptions(secim,user);
		}while (secim!=0);
		return secim;
	}
	
	private static int kullaniciMenuOptions(int secim,User user) {
		switch (secim){
			case 1:{
				postController.postlariGoruntule();
				return secim;
			}
			case 2:{
				postController.postPaylas(user);
				return secim;
			}
			case 3:{
				postController.kendiPostlariniGoruntule(user);
				return secim;
			}
			case 4:{
				postController.kullanicilariGoruntule();
				return secim;
			}
			case 0:{
				System.out.println("Oturum kapatıldı.");
				return secim;
			}
			default:
				System.out.println("Lütfen geçerli bir seçim yapınız!");
		}
		return secim;
	}
	
	

}