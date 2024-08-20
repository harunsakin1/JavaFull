package com.haruns._17_Enum;

import java.util.Arrays;

public class PersonelRunner {
	public static void main(String[] args) {
		Personel p1=new Personel("Harun","Bursa",Unvanlar.MUHENDIS);
		Personel p2=new Personel("Ahmet","Bursa",Unvanlar.MUHASEBECI);
		Personel p3=new Personel("Eylül","Ankara",Unvanlar.HIZMETLI);
		Personel p4=new Personel("Ece","İzmir",Unvanlar.MUDUR);
		
		// yukarıdaki personellerden mühendis olanları bul dediğimde nasıl getirebiliriz?
		
		/*System.out.println(Unvanlar.MUDUR);
		System.out.println(Unvanlar.MUDUR.name()); // MUDUR
		System.out.println(Unvanlar.MUDUR.ordinal()); // 3 ( Yani Enum'daki index numarası)*/
		
		
		System.out.println("p1.getUnvan() : "+p1.getUnvan().getUnvan());
		System.out.println("p1.getUnvan() : "+p1.getUnvan().getNo());
		
		System.out.println(p1.getUnvan().ordinal());
		System.out.println(Unvanlar.valueOf("MUHENDIS"));
		
		System.out.println(Arrays.toString(Unvanlar.values()));
		
		
	}
}