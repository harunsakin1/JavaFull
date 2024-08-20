package com.haruns._12_Okul;

import java.util.ArrayList;
/*
// nesne değişkenleri: sinifAd, lokasyon, ogrenciler(ArrayList).
// constructor:  sinifAd, lokasyon + sinifAd, lokasyon, ogrenciler(ArrayList).
// sınıfa öğrenciEkle metodu olmalı. Ogrenci nesnesi alarak ekleme olabilir, veya okulNo, ad,soyad,notOrt bilgilerini
// alıp öğrenci oluşturma işini eklerken de yapabiliriz.
// sınıftaki öğrencileri listeleyecek bir metod
 */
public class Sinif {
	private String sinifAdi;
	private String lokasyon;
	private ArrayList<Ogrenci> ogrenciler;
	
	public Sinif(String sinifAdi, String lokasyon) {
		this.sinifAdi = sinifAdi;
		this.lokasyon = lokasyon;
		ogrenciler=new ArrayList<>();
	}
	
	public Sinif(String lokasyon, String sinifAdi, ArrayList<Ogrenci> ogrenciler) {
		this.lokasyon = lokasyon;
		this.sinifAdi = sinifAdi;
		this.ogrenciler = ogrenciler;
	}
	
	public void ogrenciEkle(Ogrenci ogrenci){
		ogrenciler.add(ogrenci);
	}
	public void ogrenciEkle(String ad,String soyAd,String okulNo,double notOrt){
		ogrenciler.add(new Ogrenci(ad,soyAd,okulNo,notOrt));
	}
	
	public ArrayList<Ogrenci> ogrenciListele(){
		for (int i = 0; i < ogrenciler.size(); i++) {
			System.out.println(ogrenciler);
		}
		return ogrenciler;
	}
	public void ogrencilerListele(){
		System.out.println("*************"+getSinifAdi().toUpperCase()+" SINIF LISTESI *****************");
		for (Ogrenci ogrenci:ogrenciler){
			System.out.println(ogrenci);
		}
	}
	
	public String getLokasyon() {
		return lokasyon;
	}
	
	public void setLokasyon(String lokasyon) {
		this.lokasyon = lokasyon;
	}
	
	public ArrayList<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}
	
	public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
		this.ogrenciler = ogrenciler;
	}
	
	public String getSinifAdi() {
		return sinifAdi;
	}
	
	public void setSinifAdi(String sinifAdi) {
		this.sinifAdi = sinifAdi;
	}
	
	@Override
	public String toString() {
		return "Sinif{" + "sinifAdi='" + getSinifAdi() + '\''
				+ ", lokasyon='" + getLokasyon() + '\''
				+ ", ogrenciler=" + getOgrenciler() + '}';
	}
}