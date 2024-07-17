package com.haruns._05_OtoGaleri;

public class OtoGaleriRunner {
	public static void main(String[] args) {
		OtoGaleri kardeslerOto = new OtoGaleri(10);
		kardeslerOto.setAd("Kardesler Oto");
		kardeslerOto.setTel("01230120525");
		kardeslerOto.setYetkiliKisi("Ayhan Kardes");
		
		// Araba ekleme yolu 1-
		kardeslerOto.arabaEkle(new OtoGaleriAraba("Honda", "Civic", "2018", "Fume", 19000, 0, new OtoGaleriMotor(2600, "a1b2c3d4", 90, 300)));
		
		// Araba ekleme yolu 2-
		OtoGaleriMotor motor2=new OtoGaleriMotor(2600, "asad2334", 90, 300);
		kardeslerOto.arabaEkle(new OtoGaleriAraba("Opel", "Astra", "2022", "Siyah", 20000, 0, motor2));
		
		// Araba ekleme yolu 3-
		OtoGaleriMotor motor3=new OtoGaleriMotor(2600, "a1aasda4", 90, 300);
		OtoGaleriAraba araba=new OtoGaleriAraba("Toyota", "Corolla", "2024", "Beyaz", 20005, 0, motor3);
		
		
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("---------------------------KARDESLER OTO----------------------------");
		System.out.println("--------------------------------------------------------------------");
		kardeslerOto.arabaEkle(araba);
		System.out.println(kardeslerOto);
		kardeslerOto.arabaListele();
		
		
		OtoGaleri galericiMahmut=new OtoGaleri(3);
		OtoGaleriMotor motor4=new OtoGaleriMotor(2700,"q1w2e3r4",150,280);
		OtoGaleriAraba araba2=new OtoGaleriAraba("Seat","Leon","2020","Mavi",13250,0,motor4);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------GALERICI MAHMUT---------------------------");
		System.out.println("--------------------------------------------------------------------");
		galericiMahmut.arabaEkle(araba2);
		galericiMahmut.arabaEkle(araba2);
		galericiMahmut.arabaEkle(araba2);
		galericiMahmut.arabaEkle(araba2);
		
		galericiMahmut.arabaListele();
		galericiMahmut.setAd("Galerici Mahmut");
		galericiMahmut.setTel("05322352353");
		galericiMahmut.setYetkiliKisi("Mahmut ");
		System.out.println(galericiMahmut);
		//galericiMahmut.arabaEkle();
	}
}