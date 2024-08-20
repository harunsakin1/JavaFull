package com.haruns._21_NestedSiniflar;



public class Runner {
	public static void main(String[] args) {
		Universite universite1=new Universite("BilgeAdam");
		Universite.Ogrenci ogrenci1= universite1.new Ogrenci("Harun",1744);
		Universite.Ogrenci ogrenci2= universite1.new Ogrenci("Ali",1763);
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		universite1.ogrenciListele();
		
	}
}