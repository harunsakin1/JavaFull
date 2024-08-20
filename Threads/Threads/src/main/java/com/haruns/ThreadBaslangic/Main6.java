package com.haruns.ThreadBaslangic;

public class Main6 {
	public static void main(String[] args) {
		// Anonymous Inner Type
		String name="Lambda Thread";
		new Thread(() -> {
			System.out.println("\u001B[31m" + name + " isimli thread calisti \u001B[0m");
			String activeThread = Thread.currentThread().getName();
			for (int i = 0; i < 5; i++) {
				
				try {
					Thread.sleep(1000);
					System.out.println("\u001B[31m" + i + " : thread: " + activeThread + "\u001B[0m");
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("\u001B[31m" + activeThread + " threadi calismayi bitirdi. \u001B[0m");
		}).start();
		System.out.println("Main thread son satır");
	}
}