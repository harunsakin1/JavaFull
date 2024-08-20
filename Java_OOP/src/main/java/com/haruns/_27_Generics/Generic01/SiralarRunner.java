package com.haruns._27_Generics.Generic01;

import java.util.ArrayList;
import java.util.List;

public class SiralarRunner {
	public static void main(String[] args) {
		List<Integer>liste=new ArrayList<>();
		liste.add(500);
		liste.add(50);
		liste.add(5);
		liste.add(5000);
		Sirala.sirala(liste);
		
		List<String>liste2=new ArrayList<>();
		liste2.add("Bursa");
		liste2.add("Ankara");
		liste2.add("Isparta");
		liste2.add("Denizli");
		Sirala.sirala(liste2);
		
		List<Kopek>liste3=new ArrayList<>();
		liste3.add(new Kopek("Karabas",100,5));
		liste3.add(new Kopek("S",100,5));
		liste3.add(new Kopek("D",100,5));
		/*Sirala.sirala(liste3);  Kopek sınıfı Comparable interface'ini implement etmediği için Sırala sınıfındaki
		 generic method bu listeyi kabul etmiyor*/
	}
}