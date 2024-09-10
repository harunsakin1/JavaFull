package com.haruns._02_JDBC_Forum;

import com.haruns._02_JDBC_Forum.entity.User;
import com.haruns._02_JDBC_Forum.repository.UserRepository;

import java.util.Optional;
import java.util.Scanner;

public class UserRegisterSystem {
	static Scanner sc=new Scanner(System.in);
	static UserRepository userRepository=new UserRepository();
	public static void main(String[] args) {
		startMenu();
	}
	
	public static void startMenu(){
		System.out.println("1- Kullanıcı Girişi");
		System.out.println("2- Kullanıcı Kayıt");
		System.out.println("0- Çıkış");
		System.out.print("Seçiminiz : ");
		int secim=sc.nextInt();
		sc.nextLine();
		switch (secim){
			case 1:
				User user=girisYap();
				if (user!=null){
					kullaniciMenu(user);
				}
				startMenu();
				break;
			case 2:
				register();
				startMenu();
				break;
			case 0:
				System.out.println("Çıkış yapılıyor");
				break;
			default:
				System.out.println("Hatalı secim yaptınız.");
		}
	}
	
//	private static int startMenuOptions(int secim) {
//		switch (secim){
//			case 1:
//				User user=girisYap();
//				if (user!=null){
//					kullaniciMenu(user);
//				}
//				break;
//			case 2:
//				register();
//				break;
//			case 0:
//				System.exit(0);
//				break;
//			default:
//				System.out.println("Hatalı secim yaptınız.");
//		}
//		return secim;
//	}
	public static void kullaniciMenu(User user){
		System.out.println("Hoşgeldin, "+user.getAd()+" "+user.getSoyad());
	}
	
	public static User girisYap(){
		System.out.print("Kullanıcı adı : ");
		String username=sc.nextLine();
		System.out.print("Şifre : ");
		String password=sc.nextLine();
		Optional<User> user = userRepository.doLogin(username, password);
		if (user.isPresent())
		{
			return user.get();
		}
		System.out.println("Kullanıcı adı veya şifre hatalı");
		return null;
	}
	
	public static void register(){
		System.out.print("Adınızı giriniz : ");
		String ad=sc.nextLine();
		System.out.print("Soyadınızı giriniz : ");
		String soyad=sc.nextLine();
		while (true){
			System.out.print("Kullanıcı Adınızı giriniz : ");
			String username=sc.nextLine();
			if (userRepository.existByUsername(username)){
				System.out.print("Şifrenizi giriniz : ");
				String password=sc.nextLine();
				userRepository.save(new User(ad,soyad,username,password));
				System.out.println("Kullanıcı kaydı başarı ile oluşturulmuştur.");
				return;
			}
		}
	}
}