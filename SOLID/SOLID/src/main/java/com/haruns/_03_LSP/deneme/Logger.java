package com.haruns._03_LSP.deneme;

public abstract class Logger {

}

class DatabaseLogger implements ILogger {
	@Override
	public void logYaz() {
		baglantiAc();
		System.out.println(" DB'ye log yazildi");
		baglantiKapat();
	}
	
	@Override
	public void baglantiAc() {
		System.out.println("baglanti acildi");
	}
	
	@Override
	public void baglantiKapat() {
		System.out.println("baglanti kapandi");
	}
}

class FileLogger implements ILogger {
	
	
	@Override
	public void logYaz() {
		System.out.println("Txt'ye log yazildi");
	}
}