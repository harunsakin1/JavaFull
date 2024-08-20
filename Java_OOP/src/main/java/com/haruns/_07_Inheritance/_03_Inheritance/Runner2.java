package com.haruns._07_Inheritance._03_Inheritance;

import com.haruns._07_Inheritance._03_Inheritance.entities.*;
import com.haruns._07_Inheritance._03_Inheritance.services.Yonetici;


public class Runner2 {
	public static void main(String[] args) {
		Mudur mudur=new Mudur("Mudur1");
		Muhendis muhendis=new Muhendis("Harun", "555", 4);
		Muhasebeci muhasebeci=new Muhasebeci("Muhasebeci1");
		Hizmetli hizmetli=new Hizmetli("Hizmetli1");
		
		Mutemet mutemet=new Mutemet();
		
		mutemet.maasHesapla(mudur);
		mutemet.maasHesapla(muhendis);
		mutemet.maasHesapla(muhasebeci);
		mutemet.maasHesapla(hizmetli);
		
		Muhendis muhendis2=new Muhendis("Muhendis2", "555", 4);
		
		muhendis2.setMaas(20000);
		mutemet.maasHesapla(muhendis2);
	}
}