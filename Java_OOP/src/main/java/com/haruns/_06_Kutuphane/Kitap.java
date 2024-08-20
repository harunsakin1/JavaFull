package com.haruns._06_Kutuphane;

public class Kitap {
	// 1. Nesne degiskenleri
	
	private String ISBN;
	private String ad;
	private String tur;
	private int sayfaSayisi;
	private int adet; // odunc durumuna gore degisen kitap adeti
	private int stok; // toplamda kutuphanede kayitli kitap sayisi
	private String yazar;
	private String yayinEvi;
	private String yayinYili;
	
	//2. Constructorlar
	
	public Kitap() {
	}
	
	public Kitap(String ISBN, String ad, String tur, int sayfaSayisi, String yazar, String yayinEvi,
	             String yayinYili) {
		this.ISBN = ISBN;
		this.ad = ad;
		this.tur = tur;
		this.sayfaSayisi = sayfaSayisi;
		this.adet = 1;
		this.stok = 1;
		this.yazar = yazar;
		this.yayinEvi = yayinEvi;
		this.yayinYili = yayinYili;
	}
	
	//3. Getter and Setter
	
	public int getStok() {
		return stok;
	}
	
	public void setStok(int stok) {
		this.stok = stok;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	
	public String getTur() {
		return tur;
	}
	
	public void setTur(String tur) {
		this.tur = tur;
	}
	
	public int getSayfaSayisi() {
		return sayfaSayisi;
	}
	
	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}
	
	public int getAdet() {
		return adet;
	}
	
	public void setAdet(int adet) {
		this.adet = adet;
	}
	
	public String getYazar() {
		return yazar;
	}
	
	public void setYazar(String yazar) {
		this.yazar = yazar;
	}
	
	public String getYayinEvi() {
		return yayinEvi;
	}
	
	public void setYayinEvi(String yayinEvi) {
		this.yayinEvi = yayinEvi;
	}
	
	public String getYayinYili() {
		return yayinYili;
	}
	
	public void setYayinYili(String yayinYili) {
		this.yayinYili = yayinYili;
	}
	
	//4. toString
	
	
	@Override
	public String toString() {
		return "Kitap{" + "ISBN='" + getISBN() + '\'' + ", ad='" + getAd() + '\'' + ", tur='" + getTur() + '\'' + ", " +
				"sayfaSayisi=" + getSayfaSayisi() + ", adet=" + getAdet() + ", stok=" + getStok() + ", yazar='" + getYazar() + '\'' + ", yayinEvi='" + getYayinEvi() + '\'' + ", yayinYili='" + getYayinYili() + '\'' + '}';
	}
}