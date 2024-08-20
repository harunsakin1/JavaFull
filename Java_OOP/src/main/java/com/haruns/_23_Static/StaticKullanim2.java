package com.haruns._23_Static;

import java.lang.reflect.Constructor;

public class StaticKullanim2 {
	static Integer sayi;
	Integer sayi2;
	
	/*Constructor yaratırken nesne değişkenini parametre olarak almak mantıklı olabilir. O yüzden IDE nesne
	 değişkenini önerirken, sınıf değişkenini(Static değişken) önermez.*/
	public StaticKullanim2(Integer sayi2) {
		this.sayi2 = sayi2;
	}
}