package com.haruns._23_Static;

public class Runner {
	public static void main(String[] args) {
		/*
		Nesne yaratılırken blokların çalışma sırası :
		1-Static block
		2-Init. block
		3-Constructor.
		 */
		StaticKullanim3 st3=new StaticKullanim3();
		System.out.println(StaticKullanim3.sayi);
		st3.degerAta();
		System.out.println(StaticKullanim3.sayi);
		StaticKullanim3.staticDegerAta();
		System.out.println(StaticKullanim3.sayi);
		System.out.println("-------------------");
		StaticKullanim3 st4=new StaticKullanim3();
		System.out.println(StaticKullanim3.sayi);
		
		
		
		
	}
}