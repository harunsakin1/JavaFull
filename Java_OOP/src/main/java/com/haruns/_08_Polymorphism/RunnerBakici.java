package com.haruns._08_Polymorphism;

public class RunnerBakici {
	public static void main(String[] args) {
		// Hayvan hayvan=new Hayvan("isim",25,5); Hayvan sınıfı abstract oldugu icin nesne olusturulamaz.
		
		Kedi tekir=new Kedi("Tekir",60,4);
		Kopek karabas=new Kopek("Karabas",110,6);
		
		Bakici bakici=new Bakici();
		bakici.hayvanKonustur(tekir,3);
		bakici.hayvanKonustur(karabas,5);
		
		Kus duman=new Kus("Duman",20,1);
		bakici.hayvanKonustur(duman,2);
	}
}