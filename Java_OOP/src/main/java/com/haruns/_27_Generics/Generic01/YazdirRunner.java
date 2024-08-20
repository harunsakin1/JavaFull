package com.haruns._27_Generics.Generic01;

import java.util.List;

public class YazdirRunner {
	public static void main(String[] args) {
		Integer[] sayilar={1,3,5,7,9};
		String[] kelimeler={"lorem","ipsum","dolor","sit","amet","consectetur"};
		
		DiziYazdirV2 diziYazdirV2=new DiziYazdirV2();
		//diziYazdirV2.yazdir(kelimeler);
		
		Kopek kopek=new Kopek("Leo",50,5);
		Kopek kopek2=new Kopek("Pitt",50,5);
		Kopek kopek3=new Kopek("Bull",50,5);
		Kopek[]kopekler={kopek,kopek2,kopek3};
		diziYazdirV2.yazdir(kopekler);
		
		Kedi kedi=new Kedi("Bihter",50,2);
		Kedi kedi2=new Kedi("Olaf",50,2);
		Kedi kedi3=new Kedi("Lokum",50,2);
		Kedi[]kediler={kedi,kedi2,kedi3};
		//diziYazdirV2.yazdir(kediler);
		
		List<String>sehirler=List.of("Bursa","Ankara","Izmir");
		diziYazdirV2.listeYazdir(sehirler);
		
		List<Integer>sayilarList=List.of(5,10,15,20,25);
		diziYazdirV2.listeYazdir(sayilarList);
		
		List<Double>listDouble=List.of(5.5,7.25,3.69);
		double toplam = diziYazdirV2.listeToplam(listDouble);
		System.out.println(toplam);
	}
}