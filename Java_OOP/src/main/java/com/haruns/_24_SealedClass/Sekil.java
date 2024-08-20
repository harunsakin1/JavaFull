package com.haruns._24_SealedClass;

/**
 * sealed class ile permits kısmında verilen sınıfların miras almasına izin verilmiştir. Onlar dışındaki sınıflar
 * miras alamazlar.
 * Miras alan sınıfların da final, sealed veya non-sealed keywordleri ile işaretlenmesi gerekir.
 */
public sealed class Sekil permits Kare , Ucgen {
	private String ad;
	private double cevre;
	private double alan;
	private double hacim;
	
}