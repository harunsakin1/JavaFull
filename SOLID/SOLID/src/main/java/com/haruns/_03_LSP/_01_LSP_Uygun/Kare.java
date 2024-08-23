package com.haruns._03_LSP._01_LSP_Uygun;


public class Kare implements IShape {
	int kenar;
	
	public int getKenar() {
		return kenar;
	}
	
	public void setKenar(int kenar) {
		this.kenar = kenar;
	}
	
	@Override
	public int alanHesapla() {
		return kenar*kenar;
	}
}