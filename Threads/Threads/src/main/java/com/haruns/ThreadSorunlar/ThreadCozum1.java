package com.haruns.ThreadSorunlar;

public class ThreadCozum1 {
	// Çözüm 1 : synchronized block kullanımı
	private static int sayac=0;
	
	public static void sayacArttir(){
		synchronized (ThreadCozum1.class){
			sayac++;
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