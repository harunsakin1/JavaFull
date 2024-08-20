package com.haruns.ThreadSorunlar;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadCozum3 {
	/*
	Atomic Sınıflar Kullanmak.
	 */
	private static AtomicInteger sayac=new AtomicInteger(0);
	public static void main(String[] args) throws InterruptedException {
		Thread thread1=new Thread(()->{
			for (int i = 0; i < 5000; i++) {
				sayac.getAndIncrement(); //sayac++ ' nın AtomicInteger karşılığı
			}
			System.out.println("Thread 1 calismayi bitirdi. Sayac degeri : "+sayac);
		});
		Thread thread2=new Thread(()->{
			for (int i = 0; i < 5000; i++) {
				sayac.getAndIncrement();
			}
			System.out.println("Thread 2 calismayi bitirdi. Sayac degeri : "+sayac);
		});
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.out.println("Main thread calismayi bitirdi. Sayac degeri : "+sayac);
	}
}