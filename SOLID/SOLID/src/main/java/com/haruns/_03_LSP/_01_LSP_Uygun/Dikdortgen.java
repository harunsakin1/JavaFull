package com.haruns._03_LSP._01_LSP_Uygun;

public class Dikdortgen implements IShape {
	int genislik;
	int yukseklik;
	
	public int alanHesapla(){
		return genislik*yukseklik;
	}
	
	public int getGenislik() {
		return genislik;
	}
	
	public void setGenislik(int genislik) {
		this.genislik = genislik;
	}
	
	public int getYukseklik() {
		return yukseklik;
	}
	
	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}
}