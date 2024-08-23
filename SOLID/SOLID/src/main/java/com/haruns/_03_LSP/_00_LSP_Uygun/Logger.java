package com.haruns._03_LSP._00_LSP_Uygun;

public abstract class Logger {
	abstract void logYaz();
}
abstract class DbLogger extends Logger{
 abstract void baglantiAc();
 abstract void baglantiKapat();
}
class DatabaseLogger extends DbLogger {
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
	void logYaz() {
		//Log kayıtlarını Txt'ye yazacak kodlar.
	}
}