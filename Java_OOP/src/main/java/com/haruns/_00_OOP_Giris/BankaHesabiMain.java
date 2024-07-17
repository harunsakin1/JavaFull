package com.haruns._00_OOP_Giris;

public class BankaHesabiMain {
	public static void main(String[] args) {
		BankaHesabi bnk=new BankaHesabi();
		bnk.setIban("TR97898989789");
		
		bnk.paraAl("TR12312313",500);
	}
}