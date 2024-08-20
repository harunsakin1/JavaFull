package com.haruns._27_Generics.Generic01;
// Generic Class.
public class DiziYazdir<T extends Hayvan> {
	public void yazdir(T[]dizi){
		for (T item : dizi) {
			System.out.println(item);
		}
	}
}