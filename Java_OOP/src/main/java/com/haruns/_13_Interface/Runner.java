package com.haruns._13_Interface;

public class Runner {
	public static void main(String[] args) {
		BraunTermometre bt110=new BraunTermometre();
		System.out.println(bt110.sicaklikOlc());
		System.out.println(bt110.nemOlc());
		System.out.println(bt110.havaKalitesiOlc());
		System.out.println(bt110.saatGoster());
		System.out.println(bt110.tarihGoster());
		
		SinboTermometre st110=new SinboTermometre();
		System.out.println(st110.sicaklikOlc());
		System.out.println(st110.nemOlc());
		
		Olcum olcum1=new Olcum();
		System.out.println("**********");
		olcum1.nemOlc(st110);  // nemOlc metodu parametre olarak interface istiyordu.
		// ama biz ona bir nesne gonderdik
		
		ArcelikTermometre arc220=new ArcelikTermometre();
		//olcum1.nemOlc(arc220); // ilgili interface'i implement etmeyen sinifi kabul etmiyor.
		olcum1.nemOlc(bt110);
		
		
		System.out.println("-------------------------");
		
		// Abstraction:Soyutlama, Gizleme: Hangi termometre ile olcum yapildigini bilmiyorum.
		ITermometre iTermometre = olcum1.termometreOlustur();
		System.out.println(iTermometre.sicaklikOlc());
		
		INemOlcer iNemOlcer = olcum1.nemOlcerOlustur();
		System.out.println(iNemOlcer.nemOlc());
		
		
	}
}