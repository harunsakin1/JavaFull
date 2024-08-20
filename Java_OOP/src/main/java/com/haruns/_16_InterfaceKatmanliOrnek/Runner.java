package com.haruns._16_InterfaceKatmanliOrnek;

import com.haruns._16_InterfaceKatmanliOrnek.repositories.MusteriRepository;
import com.haruns._16_InterfaceKatmanliOrnek.repositories.UrunRepository;
import com.haruns._16_InterfaceKatmanliOrnek.repositories.entities.Musteri;
import com.haruns._16_InterfaceKatmanliOrnek.repositories.entities.Urun;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		MusteriRepository dbMusteri=new MusteriRepository();
		Musteri m1=new Musteri("Ahmet","SAKIN","aha","1234","Bursa");
		Musteri m2=new Musteri("Ali","SAKIN","qwer","1234","Bursa");
		Musteri m3=new Musteri("Veli","SAKIN","asdf","1234","Bursa");
		Musteri m4=new Musteri("Harun","SAKIN","harunsakin","1234","Bursa");
		Musteri m5=new Musteri("Harun","SAKIN","harunsakin","1234","Bursa");
		dbMusteri.kaydet(m1);
		dbMusteri.kaydet(m2);
		dbMusteri.kaydet(m3);
		dbMusteri.kaydet(m4);
		dbMusteri.kaydet(m5);
		dbMusteri.listele();
		
		dbMusteri.sil(2);
		dbMusteri.listele();
		
		
		m2.setAd("Ayse");
		m2.setAdres("Edirne");
		dbMusteri.guncelle(m2);
		dbMusteri.guncelle("harunsakin","Harun","SAKIN","4444","Antalya");
		dbMusteri.listele();

		UrunRepository dbUrun=new UrunRepository();
		Urun u1=new Urun("Cikolata","Lindt",200.50);
		dbUrun.kaydet(u1);
		
		
	}
}