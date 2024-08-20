package com.haruns._13_Interface;

/**
 * Bir sinifa birden cok interface implement edilebilir.
 */
public class BraunTermometre implements ITermometre,INemOlcer,IHavaKalitesiOlcer,ITarihSaatGoster{
	@Override
	public int sicaklikOlc() {
		// braun termometre sicaklik olcme kodlari
		return 24;
	}
	
	@Override
	public double nemOlc() {
		// braun termometre nem olcme kodlari
		return 80.50;
	}
	
	@Override
	public int havaKalitesiOlc() {
		// braun termometre hava kalitesi olcme kodlari
		return 90;
	}
	
	@Override
	public String tarihGoster() {
		return "25.07.2024";
	}
	
	@Override
	public String saatGoster() {
		return "21:01";
	}
}