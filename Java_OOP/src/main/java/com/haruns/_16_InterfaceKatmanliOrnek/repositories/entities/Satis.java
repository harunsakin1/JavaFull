package com.haruns._16_InterfaceKatmanliOrnek.repositories.entities;

import java.util.UUID;

public class Satis {
	String satisId;
	String musteriId;
	Double toplamFiyat;
	String satisTarihi;
	
	public Satis( String musteriId,  Double toplamFiyat, String satisTarihi) {
		this.satisId = UUID.randomUUID().toString();
		this.musteriId = musteriId;
		this.toplamFiyat = toplamFiyat;
		this.satisTarihi = satisTarihi;
	}
	
	public String getSatisId() {
		return satisId;
	}
	
	public String getMusteriId() {
		return musteriId;
	}
	
	public void setMusteriId(String musteriId) {
		this.musteriId = musteriId;
	}
	
	public Double getToplamFiyat() {
		return toplamFiyat;
	}
	
	public void setToplamFiyat(Double toplamFiyat) {
		this.toplamFiyat = toplamFiyat;
	}
	
	public String getSatisTarihi() {
		return satisTarihi;
	}
	
	public void setSatisTarihi(String satisTarihi) {
		this.satisTarihi = satisTarihi;
	}
	
	@Override
	public String toString() {
		return "Satis{" + "satisId='" + getSatisId() + '\''
				+ ", musteriId='" + getMusteriId() + '\''
				+ ", toplamFiyat=" + getToplamFiyat()
				+ ", satisTarihi='" + getSatisTarihi() + '\'' + '}';
	}
}