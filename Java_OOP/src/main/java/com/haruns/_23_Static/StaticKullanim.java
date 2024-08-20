package com.haruns._23_Static;

public class StaticKullanim {
	// static değişkene ilk değer tanımlandığı ana verilebilir.
	static Integer sayi=15;
	
	static Integer sayi2;
	//sayi2=20;// class içerisinde direkt olarak değer verilemez.
	
	static Integer sayi3;
	
	public static void main(String[] args) {
		sayi3=30; // static değişkene main metotta değer verebiliriz.
	}
	static Integer sayi4;
	public void degerVer(){
		sayi4=40; // normal bir metot içerisinde değer verebiliriz.
	}
	static Integer sayi5;
	public static void staticMetotlaDegerVer(){
		sayi5=50; // Static metot içerisinde değer verebiliriz.
	}
	static Integer sayi6;
	 {
		sayi6=60; // normal bir blokta değer verebiliriz.
	}
	static Integer sayi7;
	static {
		 sayi7=70; // Static blok içerisinde değer verebiliriz.
	}
}