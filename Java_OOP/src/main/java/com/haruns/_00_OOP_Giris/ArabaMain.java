package com.haruns._00_OOP_Giris;

public class ArabaMain {
	public static void main(String[] args) {
		int sayi=20; // Metodun icinde tanimlanan degiskenler local degiskenlerdir.
		// Asagidaki ifadeler gercekten de bellekte (heapte) nesneyi uretir.
		// Ama bu nesnelere erisemezsiniz.
//		new Araba();
//		new Araba();
//		new Araba();
		// Ulasabilmek icin referanslarini tutacak degiskenlere atamak gereklidir.
		// Constructor metotlar geriye deger donme ile ilgili bir tanimlama icermezler.
		// Ancak geriye olusturulan nesnenin bellek adresini donerler.
		Araba araba1=new Araba("Audi","A3");
		// araba1 uretilen nesnenin referans degiskenidir. Bellekteki adresini tutar.
		araba1.yil="2020";
		araba1.km=10_000;
		araba1.hiz=0;
		Motor motor1=new Motor();
		
		motor1.motorHacmi=1400;
		motor1.sasiNo="HS1963";
		motor1.beygir=90;
		motor1.tork=250;
		
		araba1.motor=motor1;
		System.out.println("araba1.motor.motorHacmi "+araba1.motor.motorHacmi);
		
		Araba araba2=new Araba("Toyota","Corolla");
		araba2.yil="2022";
		araba2.km=18_000;
		araba2.hiz=50;

		System.out.println(araba1.getInfo());
		System.out.println(araba2.getInfo());

		araba1=araba2;
		araba2.marka="Porsche";
		System.out.println(araba1.getInfo());
		System.out.println(araba2.getInfo());
		
	}
}