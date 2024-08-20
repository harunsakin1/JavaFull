package com.haruns.ThreadSorunlar;

public class ThreadSorun3 {
	// Volatile : bir değişkenin değeri direkt olarak bellekten alınması istendiğinde kullanılır.
	// İşlemcide cache mekanizması var.
	// burada volatile keyword'ü ile bu değişkenin işlemci cache'lerinde tutulması engellenir.
	// değeri direkt olarak ram bellekten getirilir.
	
	public static volatile boolean flag=false;
	public static void main(String[] args) {
		Thread thread1=new Thread(()->{
			System.out.println("Thread 1 çalıştı.");
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			flag=true;
			System.out.println("Flag değeri true yapıldı.");
		});
		Thread thread2=new Thread(()->{
			System.out.println("Thread 2 çalıştı");
			while (!flag){
				System.out.println("Thread 2 while bloğu çalıştı.");
			}
			System.out.println("Flag değeri true oldu");
		});
		thread1.start();
		thread2.start();
	}
}