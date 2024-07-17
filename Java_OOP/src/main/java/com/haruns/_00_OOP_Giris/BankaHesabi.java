package com.haruns._00_OOP_Giris;

public class BankaHesabi {
	private String hesapSahibiAd;
	private String hesapSahibiSoyad;
	private  String Iban;
	private double hesapSahibiBakiye;
	
	public String getHesapSahibiAd() {
		return hesapSahibiAd;
	}
	
	public void setHesapSahibiAd(String hesapSahibiAd) {
		this.hesapSahibiAd = hesapSahibiAd;
	}
	
	public String getHesapSahibiSoyad() {
		return hesapSahibiSoyad;
	}
	
	public void setHesapSahibiSoyad(String hesapSahibiSoyad) {
		this.hesapSahibiSoyad = hesapSahibiSoyad;
	}
	
	public String getIban() {
		return Iban;
	}
	
	public void setIban(String iban) {
		Iban = iban;
	}
	
	public double getHesapSahibiBakiye() {
		return hesapSahibiBakiye;
	}
	
	public void setHesapSahibiBakiye(double hesapSahibiBakiye) {
		this.hesapSahibiBakiye = hesapSahibiBakiye;
	}
	
	public BankaHesabi() {
		System.out.println("Banka hesabi olusturuldu.");
	}
	public void paraCek(int miktar){
		if (hesapSahibiBakiye>0) {
			hesapSahibiBakiye -= miktar;
		}
	}
	public void paraYatir(int miktar){
		hesapSahibiBakiye+=miktar;
	}
	public void paraGonder(String aliciIban){
		if (hesapSahibiBakiye>0){
		System.out.println(this.Iban+" ibanından "+aliciIban+" ibanina para gonderildi.");
		}
	}
	public void paraAl(String gondericiIban,int miktar){
		System.out.println(gondericiIban+" ibanından "+this.Iban+" ibanina para gonderildi.");
		this.hesapSahibiBakiye+=miktar;
	}
	
	@Override
	public String toString() {
		return "BankaHesabi{" + "hesapSahibiAd='" + hesapSahibiAd + '\'' + ", hesapSahibiSoyad='" + hesapSahibiSoyad + '\'' + ", Iban='" + Iban + '\'' + ", hesapSahibiBakiye=" + hesapSahibiBakiye + '}';
	}
}