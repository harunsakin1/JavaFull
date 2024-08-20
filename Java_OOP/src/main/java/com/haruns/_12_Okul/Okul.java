package com.haruns._12_Okul;

import java.util.ArrayList;
/*
// nesne değişkenleri: okulAd, okulAdres, siniflar(ArrayList)
// constructor 1:  okulAd, okulAdres
// constructor 2:  okulAd, okulAdres, siniflar(ArrayList)
// getter&setter
// sinifEkle 1 : (Sinif sinif)
// siniflariListele -> sinifAd ve sinifLokasyon bilgileri yazsın.
// ogrenciListele -> Sınıf Sınıf öğrenci listelerini yazdırsın.
 */
public class Okul {
	private String ad;
	private String adres;
	private ArrayList<Sinif> siniflar;
	
	public void sinifEkle(Sinif sinif){
		siniflar.add(sinif);
		System.out.println(sinif.getSinifAdi()+" adli sinif eklendi.");
	}
	
	public void sinifListele(){
		for (Sinif sinif:siniflar){
			System.out.println("Sinif Adi : "+sinif.getSinifAdi()+"\n Sinif lokasyonu : "+sinif.getLokasyon());
		}
	}
	
	public void okulOgrenciList(){
		System.out.println("*********"+getAd()+" OKULU OGRENCI LISTESI *********");
		for (Sinif sinif:siniflar){
			sinif.ogrencilerListele();
		}
	}
	
	public Okul(String ad, String adres) {
		this.ad = ad;
		this.adres = adres;
		siniflar=new ArrayList<>();
	}
	
	public Okul(String ad, String adres, ArrayList<Sinif> siniflar) {
		this.ad = ad;
		this.adres = adres;
		this.siniflar = siniflar;
	}

	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getAdres() {
		return adres;
	}
	
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	public ArrayList<Sinif> getSiniflar() {
		return siniflar;
	}
	
	public void setSiniflar(ArrayList<Sinif> siniflar) {
		this.siniflar = siniflar;
	}
}