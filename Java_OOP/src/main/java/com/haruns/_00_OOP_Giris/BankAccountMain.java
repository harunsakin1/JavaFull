package com.haruns._00_OOP_Giris;

public class BankAccountMain {
	public static void main(String[] args) {
		// hesap1, hesap2, hesap3 bunlar Local Değişkenlerdir.
		BankAccount hesap1=new BankAccount();
		hesap1.setHesapSahibi("Tolga Kömeç");
		hesap1.setBakiye(50_000);
		
		BankAccount hesap2=new BankAccount();
		hesap2.setHesapSahibi("Selin Sancak");
		hesap2.setBakiye(100_000);
		
		System.out.println("Faiz Oranımız:"+BankAccount.getFaizOrani());
		hesap1.setFaizOrani(0.20);
		
		
		System.out.println(hesap2.getFaizOrani()); // 0.20
		System.out.println(hesap1.getFaizOrani()); // 0.20
		System.out.println(BankAccount.getFaizOrani()); // 0.20
		
		BankAccount hesap3=new BankAccount("Özkan Sargin",150_000);
		
		System.out.println(hesap1.getHesapSahibi());
		System.out.println(hesap1.getBakiye());
		System.out.println(hesap2.getHesapSahibi());
		System.out.println(hesap2.getBakiye());
		System.out.println(hesap3.getHesapSahibi());
		System.out.println(hesap3.getBakiye());
		System.out.println("---------------------");
		BankAccount.faizEkle(hesap1);
		System.out.println(hesap1.getBakiye());
		BankAccount.faizEkle(hesap2);
		System.out.println(hesap2.getBakiye());
		
		hesap3.faizEkle();
		System.out.println(hesap3.getBakiye());
		
		System.out.println(hesap1.getHesapNo());
		System.out.println(hesap2.getHesapNo());
		System.out.println(hesap3.getHesapNo());
		
		BankAccount hesap4=new BankAccount();
		System.out.println(hesap4.getHesapNo());
		System.out.println(hesap4.getHesapSahibi());
		System.out.println(hesap4.getBakiye());
		System.out.println("-----------------------------");
		System.out.println(hesap1);
		System.out.println(hesap2);
		System.out.println(hesap3);
		System.out.println(hesap4);
		
		// Local değişkenlerde kullanılmadan önce mutlaka ilk değer verilmelidir.
		
		String adSoyad;
		adSoyad="Barış";
		System.out.println(adSoyad);
		
	}
}