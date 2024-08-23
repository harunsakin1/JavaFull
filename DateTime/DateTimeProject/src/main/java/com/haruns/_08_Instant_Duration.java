package com.haruns;

import java.time.Duration;
import java.time.Instant;

public class _08_Instant_Duration {
	public static void main(String[] args) {
		long islemAdet=5_000_000_000L;
		long toplam=0;
		
		//1.Yöntem :
		long start = System.currentTimeMillis();
		for (long i = 0; i < islemAdet; i++) {
			toplam+=i;
		}
		System.out.println(toplam);
		long end = System.currentTimeMillis();
		System.out.println("Geçen süre : " + (end - start)+" ms");
		
		//2.Yöntem :
		 toplam=0;
		 start = System.nanoTime();
		for (long i = 0; i < islemAdet; i++) {
			toplam+=i;
		}
		System.out.println(toplam);
		 end = System.nanoTime();
		System.out.println("Geçen süre : " + (end - start)+" nanosaniye");
		
		//3.Yöntem : Instant.now()
		toplam=0;
		Instant baslangic = Instant.now();
		for (long i = 0; i < islemAdet; i++) {
			toplam+=i;
		}
		System.out.println(toplam);
		Instant bitis = Instant.now();
		Duration between = Duration.between(baslangic, bitis);
		System.out.println("Geçen süre : "+between.toMillis()+" ms");
		System.out.println("Geçen süre : "+between.toSeconds()+" s");
		System.out.println("Geçen süre : "+between.toNanos()+" nanosaniye");
	}
}