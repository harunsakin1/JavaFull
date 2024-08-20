package com.haruns._22_StaticInnerClass;

public class Runner {
	public static void main(String[] args) {
		
		Kitaplik kitaplik1=new Kitaplik("BilgeAdam kitapligi");
		
		Kitaplik.Kitap kitap1=new Kitaplik.Kitap("A Kitabı",50);
		Kitaplik.Kitap kitap2=new Kitaplik.Kitap("B Kitabı",150);
		Kitaplik.Kitap kitap=new Kitaplik.Kitap("asd",123);

		kitaplik1.kitapListele();
		

	
	}
}