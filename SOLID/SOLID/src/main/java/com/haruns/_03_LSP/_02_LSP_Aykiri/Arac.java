package com.haruns._03_LSP._02_LSP_Aykiri;

public class Arac {
	public void calistir(){
		System.out.println("Araç çalıştı.");
	}
	public void hizlan(){
		System.out.println("Araç hızlandı.");
	}
}
class Araba extends Arac{
	@Override
	public void calistir() {
		System.out.println("Araba çalıştı.");
	}
	
	@Override
	public void hizlan() {
		System.out.println("Araba hızlandı.");
	}
}

class Bisiklet extends Arac{
	@Override
	public void calistir() {
		throw new UnsupportedOperationException("Bu işlem desteklenmiyor...");
	}
	
	@Override
	public void hizlan() {
		super.hizlan();
	}
}