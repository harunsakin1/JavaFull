package com.haruns._12_Okul;

import java.util.ArrayList;

public class RunnerOkul {
	public static void main(String[] args) {
		Ogrenci ogr1 = new Ogrenci("Harun", "SAKIN", "1744", 97.5);
		Ogrenci ogr2 = new Ogrenci("Ahmet", "YILMAZ", "1235", 46);
		Ogrenci ogr3 = new Ogrenci("Ece", "DENIZ", "1452", 64);
		Ogrenci ogr4 = new Ogrenci("Ali", "TAS", "1007", 79);
		
		Sinif sinif = new Sinif("1/A", "1.Kat 101 No'lu derslik");
		Sinif sinif2 = new Sinif("2/B", "2.Kat 202 No'lu derslik");
		Sinif sinif3 = new Sinif("3/C", "3.Kat 303 No'lu derslik");
		Sinif sinif4 = new Sinif("4/D", "4.Kat 404 No'lu derslik");
		
		sinif.ogrenciEkle(ogr1);
		sinif.ogrenciEkle(ogr2);
		sinif.ogrenciEkle(ogr3);
		sinif.ogrenciEkle(ogr4);
		
		Ogrenci ogr5 = new Ogrenci("ogr5", "SAKIN", "996", 97.5);
		Ogrenci ogr6 = new Ogrenci("ogr6", "YILMAZ", "997", 46);
		Ogrenci ogr7 = new Ogrenci("ogr7", "DENIZ", "998", 64);
		Ogrenci ogr8 = new Ogrenci("ogr8", "TAS", "999", 79);
		
		sinif2.ogrenciEkle(ogr5);
		sinif2.ogrenciEkle(ogr6);
		sinif2.ogrenciEkle(ogr7);
		sinif2.ogrenciEkle(ogr8);
		
		sinif.ogrencilerListele();
		sinif2.ogrencilerListele();
		
		Okul okul1=new Okul("Uludag ilkogretim okulu","Osmangazi/BURSA");
		okul1.sinifEkle(sinif);
		okul1.sinifEkle(sinif2);
		okul1.okulOgrenciList();
		System.out.println(sinif2.getOgrenciler().get(3).getAd());
	}
}