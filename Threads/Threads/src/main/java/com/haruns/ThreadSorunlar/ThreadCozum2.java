package com.haruns.ThreadSorunlar;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadCozum2 {
	/*
	Lock kullanmak : Kilit Mekanizması
	Lock kullanarak bir thread tarafından ulaşılan metoda başka bir thread erişimi o anlık engellenir.
	 */
	private static int sayac=0;
	private static Lock lock=new ReentrantLock();
	public static void sayacArttir(){
		try {
			lock.lock();
			sayac++;
		}
		finally {
			lock.unlock();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread thread1=new Thread(()->{
			for (int i = 0; i < 5000; i++) {
				sayacArttir();
			}
			System.out.println("Thread 1 calismayi bitirdi. Sayac degeri : "+sayac);
		});
		Thread thread2=new Thread(()->{
			for (int i = 0; i < 5000; i++) {
				sayacArttir();
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