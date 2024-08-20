package com.haruns.streamOrnek;

import java.util.*;
import java.util.stream.Collectors;

public class OgrenciRunner {
	public static void main(String[] args) {
		List<Ogrenci>ogrenciler=new ArrayList<>();
		ogrenciler.add(new Ogrenci(1L,"Barış","Demirci","İstanbul","Bilg. Müh.",3.52));
		ogrenciler.add(new Ogrenci(2L,"Alexander J.","Walker","Eskişehir","Yön. Bil. Sistemleri",2.9));
		ogrenciler.add(new Ogrenci(3L,"Alperen","Bicav","Izmir","Hukuk",3.22));
		ogrenciler.add(new Ogrenci(4L,"Harun","SAKIN","Bursa","Bilg. Müh.",2.90));
		ogrenciler.add(new Ogrenci(5L,"Anıl","Özoğluoz","İstanbul","Bilg. Müh.",2.04));
		ogrenciler.add(new Ogrenci(6L, "Murat", "Sacak", "Kocaeli", "İnşaat Müh.",2.60));
		ogrenciler.add(new Ogrenci(7L,"Berkay","Basol","Angara","Fotografcilik ve Kameramanlik Prog.",0.1));
		ogrenciler.add(new Ogrenci(8L,"Ahmet","Eris","İzmir","Matematik",2.52));
		ogrenciler.add(new Ogrenci(9L,"Mehmet","Tufan","Adana","Otomotiv müh.",3.08));
		ogrenciler.add(new Ogrenci(10L, "Emirhan", "Ergun", "Tekirdag", "Matematik", 2.8));
		ogrenciler.add(new Ogrenci(11L,"Mehmet","Ertop","Ankara","EEM",3.52));
		ogrenciler.add(new Ogrenci(12L,"Emine","Karabolat","Adana","Elektrik Elektronik Müh.",3.37));
		ogrenciler.add(new Ogrenci(13L,"Mehmet Can","Karahan","İstanbul","Elektronik Haberleşme",3.50));
		ogrenciler.add(new Ogrenci(14L,"Selin", "Sancak","Ankara","İnşaat Müh.",3.18));
		ogrenciler.add(new Ogrenci(15L,"Özkan","Sargın","Kotor","Elektronik Haberleşme",3.0));
		ogrenciler.add(new Ogrenci(16L,"Alper","Güler","Ankara","İnşaat Müh.",2.52));
		ogrenciler.add(new Ogrenci(17L,"Evrim","Çalışkan","Bursa","Bilg. Programcılığı",3.22));
		ogrenciler.add(new Ogrenci(18L,"Alpreren","İkinci","Ankara","İnşaat Müh.",3.02));
		
		//Soru 1: Tüm öğrenciler
		System.out.println("SORU 1:Tüm öğrenciler ");
		ogrenciler.stream().forEach(System.out::println);
		//Soru 2: Notu 3.00 ve üstünde olan öğrencilerin tüm bilgilerini yazdırınız.
		System.out.println("Soru 2: Notu 3.00 ve üstünde olan öğrencilerin tüm bilgilerini yazdırınız. ");
		ogrenciler.stream()
		          .filter(o->o.getNot()>3.00)
		          .forEach(System.out::println);
		//Soru 3: İnşaat müh. okuyan öğrencilerin sayısı kaçtır ?
		System.out.println("İnşaat müh. okuyan öğrencilerin sayısı kaçtır ?");
		long insaatCount = ogrenciler.stream().filter(o -> o.getBolum().toLowerCase().contains("İnşaat")).count();
		System.out.println(insaatCount);
		//Soru 4: Adı a ile başlayan öğrencilerin tamamını yazdırınız.
		System.out.println("Adı a ile başlayan öğrencilerin tamamını yazdırınız.");
		ogrenciler.stream().filter(o->o.getAd().startsWith("A")).forEach(System.out::println);
		//Soru 5: Hakan adlı öğrenci var mı yok mu kontrol edin. Boolean değer dönecek.
		System.out.println("Hakan adlı öğrenci var mı yok mu kontrol edin. Boolean değer dönecek.");
		System.out.println(ogrenciler.stream().anyMatch(o -> o.getAd().equals("Hakan")));
		//Soru 6: Öğrencilerin tamamını notlara göre büyükten küçüğe sıralayınız.
		System.out.println("Öğrencilerin tamamını notlara göre büyükten küçüğe sıralayınız.");
		ogrenciler.stream()
		          .sorted()
		          .forEach(System.out::println);
		//Soru 7: Notu 3.00 üstü olan öğrencilerin adını ve bölümünü yazdırın.
		System.out.println("Notu 3.00 üstü olan öğrencilerin adını ve bölümünü yazdırın.");
		ogrenciler.stream().filter(o->o.getNot()>3.00).collect(Collectors.toList()).forEach(ogrenci ->{
			System.out.println(ogrenci.getAd() + " " + ogrenci.getBolum());
		});
		//Soru 8: Elektronik Haberleşme bölümündeki öğrencilerin sayısını yazdırın.
		System.out.println("Elektronik Haberleşme bölümündeki öğrencilerin sayısını yazdırın.");
		long elektronikHaberlesme =
				ogrenciler.stream().filter(o -> o.getBolum().toLowerCase().contains("elektronik haberleşme")).count();
		System.out.println(elektronikHaberlesme);
		//Soru 9: En yüksek nota sahip öğrencinin bilgilerini yazdırın.
		System.out.println("En yüksek nota sahip öğrencinin bilgilerini yazdırın.");
		ogrenciler.stream().sorted().limit(1).forEach(System.out::println);
		//Soru 10: Notu 2.50 ile 3.50 arasındaki öğrencilerin sayısını bulun.
		System.out.println("Notu 2.50 ile 3.50 arasındaki öğrencilerin sayısını bulun.");
		long count = ogrenciler.stream().filter(o -> o.getNot() < 3.50).filter(o -> o.getNot() > 2.50).count();
		System.out.println(count);
		//Soru 11: Bölümlere göre öğrencilerin not ortalamasını yazdırın.(grouplama)
		System.out.println("SORU 11 :Bölümlere göre öğrencilerin not ortalamasını yazdırın.(grouplama)");
		/*Map<String, Double> bolumlereGoreNotOrtalamasi = ogrenciler.stream()
		       .collect(Collectors.groupingBy(Ogrenci::getBolum, Collectors.averagingDouble(Ogrenci::getNot)));*/
		Map<String, Double> bolumOrtalama = ogrenciler.stream()
		                                        .collect(Collectors.groupingBy(Ogrenci::getBolum, Collectors.averagingDouble(Ogrenci::getNot)));
		
		bolumOrtalama.forEach((bolum, ortalama) -> {
			System.out.println(bolum + " bölümünün not ortalaması: " + ortalama);
		});
		
		//Soru 12: En düşük nota sahip öğrencinin bölümünü yazdırın.
		System.out.println("SORU 12 :En düşük nota sahip öğrencinin bölümünü yazdırın.");
		ogrenciler.stream().sorted(Comparator.reverseOrder()).map(Ogrenci::getBolum).limit(1).forEach(System.out::println);
		System.out.println();
		System.out.println("----------- Soru12: En düşük nota sahip öğrencinin bölümünü yazdırın. ----------- ");
		Optional<String> s = ogrenciler.stream()
		                               .min(Comparator.comparingDouble(Ogrenci::getNot))
		                               .map(Ogrenci::getBolum);
		//Soru 13: Notların ortalaması kaçtır?
		System.out.println("SORU 13 :Notların ortalaması kaçtır?");
		/*double notOrtalamasi = ogrenciler.stream()
		                                 .collect(Collectors.averagingDouble(Ogrenci::getNot));
		System.out.println("Notların ortalaması: " + notOrtalamasi);*/
		
		System.out.println("Ortalama : "+ogrenciler.stream().collect(Collectors.averagingDouble(Ogrenci::getNot)));
		
		//Soru14: Notu 2.50 altında kaç öğrenci vardır?
		System.out.println("----------- Soru14: Notu 2.50 altında kaç öğrenci vardır? ----------- ");
		System.out.println("Notu 2.50 altında olan ogrenci sayisi : "+ogrenciler.stream().filter(o -> o.getNot() < 2.50).count());
		
		
		//Soru15: Her bölümdeki öğrenci sayısı kaçtır? (grouplama) -> Gruplama sonucunda count,max,min,avg,sum gibi
		// değerler alınabilir.
		System.out.println("----------- Soru15: Her bölümdeki öğrenci sayısı kaçtır? (grouplama) ----------- ");
		Map<String, Long> bolumdekOgrenciSayisi =
				ogrenciler.stream().collect(Collectors.groupingBy(Ogrenci::getBolum, Collectors.counting()));
		bolumdekOgrenciSayisi.forEach((bolum, sayi)->{
			System.out.println(bolum+" bolumundeki ogrencilerin sayisi : "+sayi);
		});
		
		
		//Soru16: Adı en uzun olan öğrencinin adını yazdırın.
		System.out.println("----------- Soru16: Adı en uzun olan öğrencinin adını yazdırın. -----------");
		ogrenciler.stream()
		          .max(Comparator.comparingInt(o -> o.getAd().length()))
		          .ifPresent(ogrenci-> System.out.println("En uzun adli ogrencinin adi : "+ogrenci.getAd()) );
		
	}
		
	}