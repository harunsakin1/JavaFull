package com.haruns._01_CompoundObject;
public class Runner {
	public static void main(String[] args) {
		Bolum bolum1=new Bolum("Yazilim Muh.","YZMH");
		Ogrenci ogr1=new Ogrenci("Harun SAKIN","1921012067");
		Ders ders1=new Ders("Computer Science","YZMH",5);
		Hoca hoca1=new Hoca("Utku KOSEOGLU","Prof.");
		
		bolum1.bolumBaskani=hoca1;
		bolum1.dersler[0]=ders1;
		bolum1.ogrenciler[0]=ogr1;
		
		ogr1.bolum=bolum1;
		ogr1.aldigiDersler[0]=ders1;
		ogr1.danisman=hoca1;
		
		
		ders1.hoca=hoca1;
		ders1.bolum=bolum1;
		ders1.ogrenciler[0]=ogr1;
		
		hoca1.bolum=bolum1;
		hoca1.danisanOgrenciler[0]=ogr1;
		hoca1.verdigiDersler[0]=ders1;
		
		// Ogr1'in aldigi ilk dersin adi nedir ?
		
		System.out.println("Ogr1'in aldigi ilk dersin adi : "+ogr1.aldigiDersler[0].ad);
		
		// Ogr1'in aldigi ilk dersin hocasinin adi nedir ?
		
		System.out.println("Ogr1'in aldigi ilk dersin hocasinin adi : "+ogr1.aldigiDersler[0].hoca.ad);
		
		// Ogr1'in aldigi ilk dersin hocasinin bolumunun kodu nedir ?
		
		System.out.println("Ogr1'in aldigi ilk dersin hocasinin bolumunun kodu : "+ogr1.aldigiDersler[0].hoca.bolum.kod);
		
	}

}