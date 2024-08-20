package com.haruns._07_Inheritance._03_Inheritance;

import com.haruns._07_Inheritance._03_Inheritance.entities.*;// * isareti entities package i altindaki butun siniflarin temsili icin konulmustur.
import com.haruns._07_Inheritance._03_Inheritance.services.Personel;

public class Runner {
	public static void main(String[] args) {
		Mudur mudur1=new Mudur();
		System.out.println(mudur1.ad);
		
		Muhasebeci aliBey=new Muhasebeci("Ali Bey");
		aliBey.muhasebeciUnvani="Mali Musavir";
		System.out.println(aliBey.getInfo());
		
		Personel personel1=new Personel("Harun");
		System.out.println(mudur1.yoneticiOzelligi);
		System.out.println(mudur1.ad);
		mudur1.yoneticiMetodu();
		
		
	}
}