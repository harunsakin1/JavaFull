package com.haruns._09_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListOrnek {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		arrayList.add("Istanbul");
		arrayList.add(16);
		arrayList.add(true);
		arrayList.add(null);
		arrayList.add('!');
		
		arrayListYazdir(arrayList);
		arrayList.remove(null);
		arrayList.add(1,"Bursa");
		arrayList.addFirst("Basina eleman ekleme");
		arrayList.addLast("Sonuna eleman ekleme");
		arrayList.add(0,"Bursa");
		arrayList.remove(0);
		arrayListYazdir(arrayList);
		// sadece integer degerler tutabilen bir arrayList
		ArrayList<Integer> sayilar=new ArrayList<>();
		Random rnd=new Random();
		for (int i = 0; i < 10; i++) {
			sayilar.add(rnd.nextInt(0,101));
		}
		arrayListYazdir(sayilar);

		Kisi kisi1=new Kisi("Harun","SAKIN");
		Kisi kisi2=new Kisi("Ali","TAS");
		Kisi kisi3=new Kisi("Ayse","SARI");

		ArrayList<Kisi> kisiler=new ArrayList<>();
		kisiler.add(kisi1);
		kisiler.add(kisi2);
		kisiler.add(kisi3);
		arrayListYazdir(kisiler);
		
	}
	
	private static void arrayListYazdir(ArrayList arrayList) {
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println((i+1)+". eleman : "+ arrayList.get(i));
		}
		System.out.println("-----------------------------------------------------");
	}
}