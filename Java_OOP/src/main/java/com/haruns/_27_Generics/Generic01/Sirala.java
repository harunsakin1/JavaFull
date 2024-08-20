package com.haruns._27_Generics.Generic01;

import java.util.Collections;
import java.util.List;

public class Sirala {
	public static  <T extends Comparable<T>> void sirala(List<T> liste){
		Collections.sort(liste);
		liste.forEach(System.out::println);
	}
}