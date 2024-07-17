package com.haruns._06_Kutuphane;
/*
Üye
uyeNo
ad
soyad
telno
dtarih
adres
tc
kayittarihi
puan
oduncAldıgıKitapSayisi

 */
public class Uye {
	private int uyeNo;
	private String ad;
	private String soyAd;
	private String telNo;
	private String dTarih;
	private String adres;
	private String tcNo;
	private String kayitTarihi;
	private int puan;
	private int oduncAldigiKitapSayisi;
	
	public Uye() {
	}
	
	public Uye(int uyeNo, String ad, String soyAd, String telNo, String dTarih, String adres, String tcNo,
	           String kayitTarihi, int puan, int oduncAldigiKitapSayisi) {
		this.uyeNo = uyeNo;
		this.ad = ad;
		this.soyAd = soyAd;
		this.telNo = telNo;
		this.dTarih = dTarih;
		this.adres = adres;
		this.tcNo = tcNo;
		this.kayitTarihi = kayitTarihi;
		this.puan = puan;
		this.oduncAldigiKitapSayisi = oduncAldigiKitapSayisi;
	}
	
	public int getUyeNo() {
		return uyeNo;
	}
	
	public void setUyeNo(int uyeNo) {
		this.uyeNo = uyeNo;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getSoyAd() {
		return soyAd;
	}
	
	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}
	
	public String getTelNo() {
		return telNo;
	}
	
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	public String getdTarih() {
		return dTarih;
	}
	
	public void setdTarih(String dTarih) {
		this.dTarih = dTarih;
	}
	
	public String getAdres() {
		return adres;
	}
	
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	public String getTcNo() {
		return tcNo;
	}
	
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	
	public String getKayitTarihi() {
		return kayitTarihi;
	}
	
	public void setKayitTarihi(String kayitTarihi) {
		this.kayitTarihi = kayitTarihi;
	}
	
	public int getPuan() {
		return puan;
	}
	
	public void setPuan(int puan) {
		this.puan = puan;
	}
	
	public int getOduncAldigiKitapSayisi() {
		return oduncAldigiKitapSayisi;
	}
	
	public void setOduncAldigiKitapSayisi(int oduncAldigiKitapSayisi) {
		this.oduncAldigiKitapSayisi = oduncAldigiKitapSayisi;
	}
	
	@Override
	public String toString() {
		return "com.haruns._06_Kutuphane.Uye{" + "uyeNo=" + getUyeNo() +
				", ad='" + getAd() + '\'' +
				", soyAd='" + getSoyAd() + '\'' +
				", telNo='" + getTelNo() + '\'' +
				", dTarih='" + getdTarih() + '\'' +
				", adres='" + getAdres() + '\'' +
				", tcNo='" + getTcNo() + '\'' +
				", kayitTarihi='" + getKayitTarihi() + '\'' +
				", puan=" + getPuan() +
				", oduncAldigiKitapSayisi=" + getOduncAldigiKitapSayisi() + '}';
	}
}