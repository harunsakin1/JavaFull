package com.haruns;

import java.time.LocalDate;
import java.time.Period;

public class _07_Period {
	public static void main(String[] args) {
		LocalDate dogumGunu=LocalDate.of(2000,12,13);
		Period gecenZaman = Period.between(dogumGunu, LocalDate.now());
		System.out.println(gecenZaman); // P 33Y 7M 19D
		int years = gecenZaman.getYears();
		int months = gecenZaman.getMonths();
		int days = gecenZaman.getDays();
		System.out.println(years+" yıl "+months+" ay "+days+" günlüksünüz");
		
		Period onBesGunlukPeriod = Period.of(0, 0, 15);
		System.out.println(dogumGunu.plus(onBesGunlukPeriod));
	}
}