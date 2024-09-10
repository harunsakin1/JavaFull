package com.haruns._01_JDBC_ETicaret;

import com.haruns._01_JDBC_ETicaret.entity.Adres;
import com.haruns._01_JDBC_ETicaret.entity.Musteri;
import com.haruns._01_JDBC_ETicaret.repository.AdresRepository;
import com.haruns._01_JDBC_ETicaret.repository.MusteriRepository;

import java.time.LocalDate;
import java.util.Optional;

public class Runner {
	public static void main(String[] args) {
		//(String ad, String soyad, String cinsiyet, LocalDate dtarih, String tel, String email, String sehir)
		MusteriRepository musteriRepository = new MusteriRepository();
		AdresRepository adresRepository=new AdresRepository();
//		Musteri m1=new Musteri("Selim", "Sarı", "E", LocalDate.of(2000,5,13),"05553332211","selimsari@gmail.com",
//		"Ankara");

//		musteriRepository.save(m1);

//		musteriRepository.delete(1000);

//		musteriRepository.findAll().forEach(System.out::println);

//		musteriRepository.findById(99)
//		                 .ifPresentOrElse(System.out::println, () -> System.out.println("Aradığınız müsteriID'li " +
//				                                                                                "musteri bulunamadi"));
//		Optional<Musteri>guncellenecekMusteri=musteriRepository.findById(2000);
//		if (guncellenecekMusteri.isPresent()){
//			guncellenecekMusteri.get().setSoyad("YeniSarı");
//			guncellenecekMusteri.get().setEmail("selimyenisari@gmail.com");
//			musteriRepository.update(guncellenecekMusteri.get());
//		}
//		else {
//			System.out.println("Güncellenecek müşteri bulunamadı.");
//		}
//
//		musteriRepository.findById(1002)
//		                 .ifPresentOrElse(System.out::println, () -> System.out.println("Aradığınız müsteriID'li " +
//				                                                                                "musteri bulunamadi"));
//		Adres adres=new Adres(500,"Bursa","Osmangazi","Sakarya","Yıldız Sk. No: 5");
//		adresRepository.save(adres);
		
//		adresRepository.delete(2018);
	
//		adresRepository.findAll().forEach(System.out::println);
		
//		adresRepository.findById(2000).ifPresentOrElse(System.out::println, () -> System.out.println("Aradığınız " +
//				                                                                                              "adres " +
//				"bulunamadı"));
	
		
	}
}