package com.haruns._19_EnumOrnek3;

public class RunnerTrafikIsiklar {
	public static void main(String[] args) {
		TrafikIsiklar[] isiklar = TrafikIsiklar.values();
		
		for (TrafikIsiklar item:isiklar){
			System.out.println(item+" "+item.getDurum());
		}
		
		System.out.println(TrafikIsiklar.KIRMIZI.name().equals("KIRMIZI"));
		System.out.println(TrafikIsiklar.SARI.getDurum().equals("HAZIRLAN"));
		
		TrafikIsiklar isik1=null;
		System.out.println(isik1==TrafikIsiklar.YESIL);
		System.out.println(isik1.equals(TrafikIsiklar.YESIL)); //NPE
		
	}
}