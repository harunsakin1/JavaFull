package com.haruns;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class _03_LocalDate {
	public static void main(String[] args) {
		//LocalDate localDate=LocalDate.now();
		LocalDate localDate=LocalDate.of(2024,3,31);
		System.out.println(localDate); // 2024-08-20
		System.out.println(localDate.getYear()); // 2024
		System.out.println(localDate.getMonth()); // AUGUST
		System.out.println(localDate.getDayOfWeek()); // TUESDAY
		System.out.println(localDate.getDayOfMonth()); // 20
		System.out.println(localDate.getDayOfYear()); // 233
		System.out.println(localDate.getEra()); // CE : Milattan sonra
		
		LocalDate localDateYarin=localDate.plusDays(1);
		System.out.println(localDateYarin);
		
		LocalDate ucAySonrasi=localDate.plusMonths(3);
		System.out.println(ucAySonrasi);
		
		LocalDate birAyOncesi=localDate.minusMonths(1);
		System.out.println(birAyOncesi);
		
		LocalDate ikiHaftaSonrasi=localDate.plusWeeks(2);
		System.out.println(ikiHaftaSonrasi);
		
		LocalDate tarih1=LocalDate.of(2024,2,29);
		System.out.println(tarih1.minusDays(5));
		
		// 100 yıl once bugun
		System.out.println(LocalDate.now().minusYears(100));
		System.out.println(LocalDate.now().minus(100, ChronoUnit.YEARS));
		System.out.println(LocalDate.now().plus(100, ChronoUnit.YEARS));
		
		// Bugunden 30 gün sonrayı
		for (int i = 0; i < 12; i++) {
			System.out.println((i+1)+". Taksit ödeme tarihi : "+LocalDate.now().plusMonths(i));
		}
		
		LocalDate parseEdilmisTarih = LocalDate.parse("2008-05-28");
		System.out.println(parseEdilmisTarih.plusDays(2));
		
		System.out.println("---------------------------------------------------");
		
		
		
		
	}
}