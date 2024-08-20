package com.haruns._16_InterfaceKatmanliOrnek.repositories;

import com.haruns._16_InterfaceKatmanliOrnek.repositories.entities.Musteri;

import java.util.ArrayList;

public class MusteriRepository implements IMusteriRepository {
	
	ArrayList<Musteri>musteriList;
	
	public MusteriRepository() {
		this.musteriList = new ArrayList<>();
	}
	
	@Override
	public void kaydet(Object o) {
		
		Musteri musteri=(Musteri)o;
		for (Musteri m:musteriList){
			if (m.getKullaniciAdi().equals(musteri.getKullaniciAdi())){
				System.out.println(m.getKullaniciAdi()+" kullanici adi daha onceden alinmis.");
				return;
			}
		}
		musteriList.add(musteri);
		System.out.println(musteri.getAd()+" adli musteri eklendi.");
		
	}
	
	@Override
	public void guncelle(Object o) {
		Musteri guncelMusteri=(Musteri)o;
		int index=musteriList.indexOf(guncelMusteri);
		musteriList.set(index,guncelMusteri);
//		for (int i = 0; i < musteriList.size(); i++) {
//			Musteri varOlanMusteri = musteriList.get(i);
//			if (varOlanMusteri.getKullaniciAdi().equals(guncelMusteri.getKullaniciAdi())){
//				musteriList.set(i,guncelMusteri);
//				System.out.println(guncelMusteri.getAd()+" adli musteri guncellendi");
//				return;
//			}
//		}
//		System.out.println(guncelMusteri.getAd()+" adli musteri listede yok. Guncelleme yapilamadi.");
		
	}
	
	@Override
	public void sil(int index) {
//		Musteri musteri=(Musteri)o;
//		if(musteriList.remove(musteri)) {
//			System.out.println(musteri.getAd() + " adlı Müşteri Silindi.");
//		}
//		else {
//			System.out.println(musteri.getAd() + " Müşteri listede yok. Silinemedi.");
//		}
				if (musteriList.size()>=index) {
			musteriList.remove(index);
			System.out.println(index + ". indexteki musteri silindi.");
		}
		else {
			System.out.println("Musteri bulunamadi.");
		}
	}
	
	@Override
	public void listele() {
		System.out.println("********MUSTERI LISTESI********");
//		System.out.println(musteriList);
		
		for (Musteri item:musteriList){
			System.out.println(item.getMusteriId()+" "+item.getAd()+" "+item.getKullaniciAdi()+" "+item.getAdres());
		}
		// Lambda expression kullanimi(->)
//		musteriList.forEach(item-> System.out.println(item.getMusteriId()+" "+item.getAd()+" "+item.getKullaniciAdi()));
		
		//Metot referans.
//		musteriList.forEach(System.out::println);
	}
	
	@Override
	public void ara(Object o) {
		Musteri aranacakMusteri=(Musteri)o;
		
		
	}
	
	
	@Override
	public Musteri getMusteri(String uuid) {
		return null;
	}
	
	@Override
	public void guncelle(String kullaniciAdi, String ad, String soyAd, String sifre, String adres) {
		for (Musteri musteri:musteriList){
			if (musteri.getKullaniciAdi().equalsIgnoreCase(kullaniciAdi)){
				musteri.setAd(ad);
				musteri.setSoyAd(soyAd);
				musteri.setSifre(sifre);
				musteri.setAdres(adres);
				System.out.println(kullaniciAdi+" kullanici adli musteri guncellendi.");
				return;
			}
		}
		System.out.println(kullaniciAdi+" kullanici adli musteri listede yok. Guncellenemedi");
	}
}