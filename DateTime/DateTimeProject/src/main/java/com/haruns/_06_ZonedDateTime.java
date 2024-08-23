package com.haruns;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class _06_ZonedDateTime {
	public static void main(String[] args) {
		ZonedDateTime zonedDateTime=ZonedDateTime.now();
		System.out.println(zonedDateTime);//2024-08-20T10:45:50.463468+03:00[Europe/Istanbul]
		
		LocalDateTime ldt=LocalDateTime.of(2024, 8, 20, 10, 49);
		ZonedDateTime zonedDateTime1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Pyongyang"));
		System.out.println(zonedDateTime1);
		System.out.println(ZonedDateTime.now(ZoneId.of("SystemV/AST4ADT")));
		
		AtomicInteger sayac=new AtomicInteger(1);
		ZoneId.getAvailableZoneIds().forEach(zone->{
			System.out.println(sayac+" - "+zone);
			sayac.getAndIncrement();
		});
		System.out.println(ZoneId.getAvailableZoneIds().stream().count());
		
	}
}