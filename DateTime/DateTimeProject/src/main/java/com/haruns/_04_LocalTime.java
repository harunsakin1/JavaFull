package com.haruns;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class _04_LocalTime {
	public static void main(String[] args) {
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);// 09:47:57.125461200
		
		LocalTime localTime1=LocalTime.of(02,15,30);
		System.out.println(localTime1); // 02:15:30
		System.out.println(localTime1.getHour()); // 2
		System.out.println(localTime1.getMinute()); // 15
		System.out.println(localTime1.getSecond()); // 30
		System.out.println(localTime1.getNano()); // 0
		System.out.println("İki saat sonra : "+localTime1.plusHours(2));
		System.out.println("30 dakika önce : "+localTime1.minus(30, ChronoUnit.MINUTES));
		
	}
}