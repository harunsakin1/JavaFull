package com.haruns;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class _11_Sorular {
	public static void main(String[] args) {
		// Soru 1 :
		LocalDate ld=LocalDate.of(2000,12,13);
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE");
		Locale localeTR=new Locale("tr","TR");
		System.out.println(ld.getDayOfWeek().getDisplayName(TextStyle.FULL, localeTR));
		LocalDateTime ldt=LocalDateTime.of(2024,8,21,9,30);
		System.out.println(ldt.getHour());
		System.out.println(tarihDogruMu(ldt));
		// Soru 2 : Restoran rezervasyon sisteminde müşteri belirli tarih ve saate rez. yapabiliyor. Ama restoran saat
		// 23'de kapanıyor ve saat 10'da açılıyor. Seçilen rez. saatinin bu aralıkta olduğunu kontrol eden bir metod
		// yazınız. Eğer bu aralıkta değilse hata mesajı versin. Eğer bu aralıktaysa true dönsün.
		
	}
	public static boolean tarihDogruMu(LocalDateTime tarih){
		LocalTime acilisSaati=LocalTime.of(10,0);
		LocalTime kapanisSaati=LocalTime.of(23,0);
		LocalTime rezervasyonSaati=tarih.toLocalTime();
		if (rezervasyonSaati.getHour()>=kapanisSaati.getHour() || rezervasyonSaati.getHour()<=acilisSaati.getHour()){
			return false;
		}
		else return true;
		//return (rezervasyonSaati.isAfter(acilisSaati)&&rezervasyonSaati.isBefore(kapanisSaati));
	}
}