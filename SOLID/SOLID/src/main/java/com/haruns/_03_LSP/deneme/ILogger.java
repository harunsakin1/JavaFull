package com.haruns._03_LSP.deneme;

public interface ILogger {
	void logYaz();
	default void baglantiAc() {
	
	}
	default void baglantiKapat() {
	
	}
	
	
}