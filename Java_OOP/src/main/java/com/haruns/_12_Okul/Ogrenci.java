package com.haruns._12_Okul;

public class Ogrenci {
	private String okulNo;
	private String ad;
	private String soyAd;
	private double notOrt;
	
	public Ogrenci(String ad, String soyAd, String okulNo, double notOrt) {
		
		setNotOrt(notOrt);
		this.ad = ad;
		this.soyAd = soyAd;
		this.okulNo = okulNo;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public double getNotOrt() {
		return notOrt;
	}
	
	public void setNotOrt(double notOrt) {
		if (notOrt >= 0 && notOrt <= 100){
			this.notOrt = notOrt;
		}
		else {
			System.err.println("Not ortalamasi 0-100 arasi olmalidir.");
		}
	}
	
	public String getOkulNo() {
		return okulNo;
	}
	
	public void setOkulNo(String okulNo) {
		this.okulNo = okulNo;
	}
	
	public String getSoyAd() {
		return soyAd;
	}
	
	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}
	
	@Override
	public String toString() {
		return "Ogrenci{" + "ad='" + getAd() + '\''
				+ ", soyAd='" + getSoyAd() + '\''
				+ ", okulNo='" + getOkulNo() + '\''
				+ ", notOrt=" + getNotOrt() + '}';
	}
}