package com.haruns._16_InterfaceKatmanliOrnek.repositories.entities;

import java.util.UUID;

public class SatisDetay {
	String satisDetayId;
	String satisId;
	String urunId;
	Integer adet;
	Double fiyat;
	Double toplamFiyat;
	
	public SatisDetay(String satisId, String urunId, Integer adet, Double fiyat, Double toplamFiyat) {
		this.satisDetayId = UUID.randomUUID().toString();
		this.satisId = satisId;
		this.urunId = urunId;
		this.adet = adet;
		this.fiyat = fiyat;
		this.toplamFiyat = toplamFiyat;
	}
	
	public String getSatisDetayId() {
		return satisDetayId;
	}
	
	
	public String getSatisId() {
		return satisId;
	}
	
	public void setSatisId(String satisId) {
		this.satisId = satisId;
	}
	
	public String getUrunId() {
		return urunId;
	}
	
	public void setUrunId(String urunId) {
		this.urunId = urunId;
	}
	
	public Integer getAdet() {
		return adet;
	}
	
	public void setAdet(Integer adet) {
		this.adet = adet;
	}
	
	public Double getFiyat() {
		return fiyat;
	}
	
	public void setFiyat(Double fiyat) {
		this.fiyat = fiyat;
	}
	
	public Double getToplamFiyat() {
		return toplamFiyat;
	}
	
	public void setToplamFiyat(Double toplamFiyat) {
		this.toplamFiyat = toplamFiyat;
	}
	
	@Override
	public String toString() {
		return "SatisDetay{" + "satisDetayId='" + getSatisDetayId() + '\''
				+ ", satisId='" + getSatisId() + '\''
				+ ", urunId='" + getUrunId() + '\''
				+ ", adet=" + getAdet()
				+ ", fiyat=" + getFiyat()
				+ ", toplamFiyat=" + getToplamFiyat() + '}';
	}
}