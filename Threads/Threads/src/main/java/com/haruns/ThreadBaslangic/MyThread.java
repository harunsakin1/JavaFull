package com.haruns.ThreadBaslangic;

public class MyThread extends Thread{
	private String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println(name+" isimli thread calisti");
		String activeThread = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println(i+" : thread: "+activeThread);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(activeThread+" threadi calismayi bitirdi.");
	}
}