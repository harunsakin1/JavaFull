package com.haruns._00_OOP_Giris;

import com.haruns._03_Constant.Constants;

public class Araba {
	// Ozellikler, Uye degiskenler, Field, Nesne degiskenleri
	public String marka;
	public String model;
	public String yil;
	public int km; // Primitive datatype'larin default degerleri devreye girer (int icin=0).
	// Ama wrapper classlarin (Integer) default degeri null'dir. Onun uzerine ilk deger verilmeden islem yapilamaz.
	public int hiz;
	
	public Motor motor;
	// Default Constructor Method: Sinif ismiyle ayni isme sahip. Geri donus ile ilgili herhangi bir deger icermeyen
	// metottur.
	// Bu metod ile bu siniftan nesneler uretilecek.
	// Bu metodu elle yazmasaniz bile, derleme asamasindan sonra olusan .class dosyasina otomatik olarak eklenir.
	
	public Araba(String marka, String model) {
		this.marka = marka;
		this.model = model;
	}
	
	// Davranislar, Uye Metodlar
	public void dur() {
		hiz = 0;
	}
	
	public void hizlan(int hizlanmaMiktari) {
		hiz += hizlanmaMiktari;
		if (hiz> Constants.MAX_SPEED){
			hiz=Constants.MAX_SPEED;
		}
		
			System.out.println(Constants.ARABA_UYARI_HIZLANMA+" "+hiz);
		
		
	}
	public void yavasla(int yavaslamaMiktari){
		hiz-=yavaslamaMiktari;
		if (hiz<Constants.MIN_SPEED){
			hiz=Constants.MIN_SPEED;
		}
		else {
		System.out.println(Constants.ARABA_UYARI_YAVASLAMA+" "+hiz);
		}
	}
	
	public void git(int gidilecekKm) {
		km += gidilecekKm;
	}
	
	
	
	public String getInfo() {
		return "marka='" + marka + '\'' + ", model='" + model + '\'' + ", yil='" + yil + '\'' + ", km=" + km + ", hiz=" + hiz ;
	}
}