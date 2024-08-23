package com.haruns._03_LSP._00_LSP_Aykiri;

public abstract class Logger {
	abstract void baglantiAc();
	
	abstract void baglantiKapat();
	
	abstract void logYaz();
}

class DatabaseLogger extends Logger {
	
	@Override
	void baglantiAc() {
	
	}
	
	@Override
	void baglantiKapat() {
	
	}
	
	@Override
	void logYaz() {
		baglantiAc();
		//Log kayıtlarını DB'ye yazacak kodlar.
		baglantiKapat();
	}
}

class FileLogger extends Logger{
	
	@Override
	void baglantiAc() {
	
	}
	
	@Override
	void baglantiKapat() {
	
	}
	
	@Override
	void logYaz() {
		//Log kayıtlarını Txt'ye yazacak kodlar.
	}
}