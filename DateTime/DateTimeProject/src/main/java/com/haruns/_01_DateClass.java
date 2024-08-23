package com.haruns;

import java.util.Date;

/**
 * Date Class içindeki çoğu metod deprecated olmuş durumdadır.
 * Yani yeni java versiyonlarında tamamen kaldırılma ihtimali vardır.
 */
public class _01_DateClass {
	public static void main(String[] args) {
		System.out.println(new Date()); // Tue Aug 20 09:26:35 TRT 2024
		Date date=new Date();
		System.out.println("Tarih : "+date);
		System.out.println("Tarih : "+date.getTime()); // CurrentTimeMillis ile aynı işi yapar.
		System.out.println(date.getDay()); // haftanın kaçıncı günü bilgisi. (Index 0'dan baslar)
		System.out.println(date.getMonth()); // yılın kaçıncı ayı bilgisi. (Index 0'dan baslar)
	}
}