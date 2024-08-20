package com.haruns._27_Generics.Generic01;

import java.util.List;


public class DiziYazdirV2 {
	
	//Generic Method.
	/*
	<T> : Tüm sınıfları kabul eder.
	<T extends Hayvan> : Hayvan sınıfından miras alan tüm sınıfları kabul eder.
	<T extends Hayvan & IHavlayabilir> : Hem hayvan sınıfından miras alan hem de IHavlayabilir interface'ini implement eden tüm sınıfları kabul eder.
	 */
	public <T extends Hayvan & IHavlayabilir> void yazdir(T[]dizi){
		for (T item : dizi) {
			System.out.println(item);
		}
	}
	/*
	WildCards:
	<?> : Herhangi bir tip gelebilir.
	<? extends Number> : Number sınıfından extend alan herhangi bir sınıfı kabul eder.
	<? super Number> : Number ve Number'ın üst sınıflarını kabul eder. (Number ve Object).
	 */
	public void listeYazdir(List<?>list){
		for (Object item : list) {
			System.out.println(item);
		}
	}
	
	public double listeToplam(List<? extends Number> list){
		double toplam=0;
		for (Number number : list) {
			toplam+=number.doubleValue();
		}
		return toplam;
	}
}