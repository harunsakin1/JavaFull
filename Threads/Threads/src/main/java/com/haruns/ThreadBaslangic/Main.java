package com.haruns.ThreadBaslangic;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread1=new MyThread("myThread1");
		MyThread myThread2=new MyThread("myThread2");
		//Eşzamanlılık (Concurrency)
		myThread1.start(); // Start metodu çağrıldığında thread içindeki run metodu tetiklenir ve yeni bir thread
		// çalışmaya başlar.
		myThread2.start();
		String activeThread = Thread.currentThread().getName();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" : thread: "+activeThread);
			Thread.sleep(1000);
			
		}
		
	}
}