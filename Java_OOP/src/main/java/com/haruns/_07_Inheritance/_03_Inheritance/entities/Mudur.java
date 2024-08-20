package com.haruns._07_Inheritance._03_Inheritance.entities;

import com.haruns._07_Inheritance._03_Inheritance.services.Personel;
import com.haruns._07_Inheritance._03_Inheritance.services.Yonetici;

/*

 */
public class Mudur extends Yonetici {
	// nesne degiskenlerinin erisim belirteci defaulttur.
	// aynı package icerisindeki classlardan erisim saglanabilir.
	// farklı package icerisindeki classlardan erisilemez.
	
	
	public String mudurlukDerecesi;
	public String departman;
	
	
	public Mudur() {
		super("Harun"); // super metodu ust sinifin constructorini calistirir.
		System.out.println("Mudur sinifi bos constructor calisti");
	}
	
	public Mudur(String ad) {
		super(ad);
	}
	
	@Override
	public int getMaasKatSayisi() {
		return 5;
	}
	
	//	public Mudur(String ad,String tel, String tc) {
//		this.ad=ad;
//		this.tel=tel;
//		this.tc=tc;
//	}
	

}