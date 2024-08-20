package com.haruns._19_EnumOrnek3;

public enum TrafikIsiklar {
	KIRMIZI("DUR"),
	SARI("HAZIRLAN"),
	YESIL("GEÇ");
	
	private String durum;
	
	TrafikIsiklar(String durum) {
		this.durum = durum;
	}
	
	public String getDurum() {
		return durum;
	}
}