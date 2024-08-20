package com.haruns.ThreadSorunlar;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSorun2 {
	// Atomic Integer değişkenleri multi-thread uygulamalardada
	// ve lambda expression içinde local değişken gereken yerlerde kullanabiliriz.
	public static void main(String[] args) {
		AtomicInteger i= new AtomicInteger(1);
		List<String>isimler=List.of("Özkan","Ahmet","Emine","Alex","Muzaffer","Emirhan");
		isimler.forEach(isim->{
			System.out.println(i+". kişi : "+isim);
			i.getAndIncrement();
		});
	}
}