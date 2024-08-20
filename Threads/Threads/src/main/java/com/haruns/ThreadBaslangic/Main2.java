package com.haruns.ThreadBaslangic;

public class Main2 {
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread1=new MyThread("myThread1");
		MyThread2 myThread2=new MyThread2("myThread2");
		
		myThread1.start();
		myThread2.start();
		
		myThread2.join(); // Main thread, join edilen thread işlemi bitirene kadar bekler
		//Alttaki satırlar myThread2 işini bitirdikten sonra çalışır.
		myThread1.join();
		
		String activeThread = Thread.currentThread().getName();
		System.out.println(activeThread+" Threadi calismayi bitirdi.");
		
		
	}
}