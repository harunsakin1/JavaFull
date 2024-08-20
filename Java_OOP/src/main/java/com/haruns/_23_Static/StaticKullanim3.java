package com.haruns._23_Static;

public class StaticKullanim3 {
	static Integer sayi=10;
	
	public void degerAta(){
		sayi=20;
	}
	
	public StaticKullanim3() {
		System.out.println("Constructor Calisti");
		sayi=30;
	}
	
	static void staticDegerAta(){
		sayi=40;
	}
	
	static { // Static bloklar sadece bir kere çalışır
		System.out.println("Static block calisti");
		sayi=50;
	}
	{ // Init. blok, her nesne yaratıldığında çalışır. Constructor'dan önce çalışır.
		System.out.println("Init. block calisti");
		sayi=60;
	}
}