package com.haruns._22_StaticInnerClass;

import java.util.ArrayList;

public class Kitaplik {
	private String ad;
	private static ArrayList<Kitap>kitapArrayList;
	
	public Kitaplik(String ad) {
		this.ad = ad;
		kitapArrayList=new ArrayList<>();
	}
	
	public  void kitapListele(){
		System.out.println(ad+" adlı kütüphanedeki kitapların listesi");
		for (Kitap kitap:kitapArrayList){
			System.out.println(kitap);
		}
	}
	
	public static class Kitap{
		private String ad;
		private int price;
		
		public Kitap(String ad, int price) {
			this.ad = ad;
			this.price = price;
			kitapArrayList.add(this);
		}
		
		@Override
		public String toString() {
			return "Kitap{" + "ad='" + ad + '\'' + ", price=" + price + '}';
		}
	}
}