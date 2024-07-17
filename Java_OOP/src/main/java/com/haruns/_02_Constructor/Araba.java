package com.haruns._02_Constructor;

public class Araba {
	public String marka;
	public String model;
	public String yil;
	public int km;
	public int hiz;
	
	// Default constructor.
	public Araba() {
		System.out.println("Araba() Default constructor calisti");
	}
	
	public Araba(String marka, String model) {
		this.marka = marka;
		this.model = model;
		System.out.println("Araba(String, String) 2 parametreli constructor calisti");
	}
	
	public Araba(int km, String marka) {
		this.km = km;
		this.marka = marka;
		System.out.println("Araba(int, String) 2 parametreli constructor calisti");
	}
	
	public Araba(String marka, int hiz) {
		this.marka = marka;
		this.hiz = hiz;
		System.out.println("Araba(String, int) 2 parametreli constructor calisti");
	}
	
	public Araba(int km, int hiz) {
		this.km = km;
		this.hiz = hiz;
		System.out.println("Araba(int, int) 2 parametreli constructor calisti");
	}
	
	public Araba(String marka, String model, String yil, int km, int hiz) {
		// Bir constructor metod icinden diger constructor metod nasil cagrilir?
		this(marka, model); // Sadece ilk satirda kullanilabilir ve bir metod icerisinde sadece bir kez kullanilabilir.
		//this. ile this() metodu farkli islemler icin kullanilir.
		//this. ile o sinif icindeki nesne degiskenlerine erisim saglariz.
		//this() metod cagrimi ile o siniftaki constructor metodlara erisim saglariz.
		this.yil = yil;
		
		System.out.println("Araba(String, String, String, int, int) 5 parametreli constructor calisti");
	}
}