package com.haruns._03_LSP._02_LSP_Uygun;

public class Araba implements IMotorluArac{
	@Override
	public void calistir() {
		System.out.println("Araba çalıştı.");
	}
	
	@Override
	public void hizlan() {
		System.out.println("Araba hızlandı.");
	}
}