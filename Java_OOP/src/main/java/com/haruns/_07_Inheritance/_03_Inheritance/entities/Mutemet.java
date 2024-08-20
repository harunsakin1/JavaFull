package com.haruns._07_Inheritance._03_Inheritance.entities;

import com.haruns._07_Inheritance._03_Inheritance.services.Personel;

public class Mutemet {
//	public void maasHesapla(Mudur mudur){
//		System.out.println("Mudurun maasi : "+mudur.getMaas()* mudur.getMaasKatSayisi());
//	}
//	public void maasHesapla(Muhendis muhendis){
//		System.out.println("Muhendisin maasi : "+muhendis.getMaas()* muhendis.getMaasKatSayisi());
//	}
//	public void maasHesapla(Muhasebeci muhasebeci){
//		System.out.println("Muhasebecinin maasi : "+muhasebeci.getMaas()* muhasebeci.getMaasKatSayisi());
//	}
//	public void maasHesapla(Hizmetli hizmetli){
//		System.out.println("Hizmetlinin maasi : "+hizmetli.getMaas()* hizmetli.getMaasKatSayisi());
//	}
	
	public void maasHesapla(Personel p){
		System.out.println(p.ad+" personelinin maasi : "+p.getMaas()* p.getMaasKatSayisi());
	}
}