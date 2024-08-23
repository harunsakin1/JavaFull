package com.haruns;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _05_LocalDateTime {
	public static void main(String[] args) {
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println(localDateTime); // 2024-08-20T10:39:58.224343400
		LocalDateTime localDateTime1=LocalDateTime.of(2000,12,13,15,30);
		System.out.println(localDateTime1);
		LocalDate localDate=LocalDate.of(2024,10,5);
		LocalTime localTime=LocalTime.of(10,30);
		LocalDateTime localDateTime2 = LocalDateTime.of(localDate, localTime);
		System.out.println(localDateTime2);
		
		
		
	}
}