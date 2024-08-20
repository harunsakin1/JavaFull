package com.haruns.streamGiris;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonelRunner {
	public static void main(String[] args) {
		List<Personel> personelList = new ArrayList<>();
		personelList.add(new Personel(1, "Cem", "Yılmaz", "Sinema", 1000.0));
		personelList.add(new Personel(2, "Tarkan", "Tevetoğlu", "Müzik", 2000.0));
		personelList.add(new Personel(3, "Elon", "Musk", "Space", 1000.0));
		personelList.add(new Personel(4, "Tarık", "Akan", "Sinema", 5000.0));
		personelList.add(new Personel(5, "Ayşe", "Kulin", "Edebiyat", 7000.0));
		personelList.add(new Personel(6, "Mauro", "Icardi", "Futbol", 10000.0));
		personelList.add(new Personel(7, "Yusuf", "Dikeç", "Spor", 5000.0));
		personelList.add(new Personel(8, "Demet", "Akalın", "Müzik", 3000.0));
		personelList.add(new Personel(9, "Albert", "Einstein", "Fizik", 3000.0));
		personelList.add(new Personel(10, "Arda", "Güler", "Futbol", 4000.0));
		personelList.add(new Personel(10, "Arda", "Turan", "Futbol", 4000.0));
		
		// Aynı kaynaktan (personelList) 4 farklı stream oluşturma yöntemi :
		Stream<Personel> stream1 = personelList.stream();
		Stream<Personel> stream2 = Stream.of(personelList.toArray(new Personel[personelList.size()]));
		Stream<Personel> stream3 = Arrays.stream(personelList.toArray(new Personel[personelList.size()]));
		personelList.stream();
		
		// 1. foreach() : Bir terminal metottur. Yani sonlandırıcıdır.
		/*personelList.stream().forEach(p-> System.out.println(p)); // lambda exp.
		personelList.stream().forEach(System.out::println); // metot referans*/
		
		stream1.forEach(p -> System.out.println(p)); // lambda exp.
		//stream1.forEach(System.out::println); // metot referans
		System.out.println("----------------");
		
		// 1.metod : foreach
		personelList.stream().forEach(p -> {
			p.increaseSalary(10);
			System.out.println(p);
		});
		
		System.out.println("----------------");
		System.out.println(personelList);
		
		System.out.println("----------------");
		// 2.metod : filter()->
		System.out.println("filter() ile adında e geçen personelleri yazdırma");
		// filter içerisine predicate ister. Predicate bir koşul gibi düşünülebilir. İçinde true, false değer dönecek
		// bir lambda ifade kullanılır.
		personelList.stream()
		            .filter(p -> p.getName().contains("e")) // intermediate operation. Kullanıldıktan sonra içindeki
		            // koşullara uygun kayıtlarla yeni bir stream oluşturur.
		            .forEach(System.out::println);
		
		System.out.println("----------------");
		personelList.stream()
		            .filter(p -> p.getName().toLowerCase().contains("a"))
				    .forEach(p->{
				p.increaseSalary(20);
				System.out.println(p);
				});
		// 3.collect : Stream'den bir collect oluşturur. Terminal operation'dur.
		System.out.println("------- collect toList -------");
		// departmanı sinema olan ve maaşı 80000den fazla olan personelleri bir listede tutalım
		List<Personel> sinema =
							personelList.stream()
				            .filter(p -> p.getDepartment().equals("Sinema"))
						    .filter(p->p.getSalary()>80000)
				            .collect(Collectors.toList());
		System.out.println(sinema);
		
		// 4. map : Map üzerinde değişiklik yapıldığında gerçek listede bir değişiklik olmuyor.
		System.out.println("------- map -------");
		personelList.stream()
		            .map(p->p.getName())
					.filter(isim->isim.contains("a"))
					.forEach(System.out::println);
		
		System.out.println("------- map maas -------");
		personelList.stream()
				.map(p->p.getSalary()+9)
				.forEach(System.out::println);
		
		List<Integer>sayilar=List.of(1,2,3,4,5,6,7);
		List<Double> kareler = sayilar.stream()
		                              .map(sayi -> Math.pow(sayi, 2))
		                              .collect(Collectors.toList());
		System.out.println(kareler);
		
		// 5. distinct : Tekrarli verileri gostermek icin kullanilir.
		System.out.println("----------- DISTINCT -----------");
		personelList.stream()
				.map(p->p.getDepartment())
				.distinct()
		        .forEach(System.out::println);
		
		//6. sorted :
		System.out.println("----------- SORTED -----------");
		personelList.stream()
		            .sorted()
		            .forEach(System.out::println);
		
		//7. reverse order sorted
		System.out.println("----------- REVERSE ORDER SORTED -----------");
		personelList.stream()
		            .sorted(Comparator.reverseOrder())
		            .forEach(System.out::println);
		
		
		//8. limit : Stream'den kaç eleman alınacağını belirler.
		System.out.println("----------- LIMIT -----------");
		personelList.stream()
		            .limit(5)
		            .forEach(System.out::println);
		
		// en dusuk maasi alan personelin adi
		System.out.println("----------- EN DUSUK MAASI ALAN PERSONELIN ISMI -----------");
		personelList.stream()
		            .sorted()
				    .limit(1)
				    .map(p->p.getName())
		            .forEach(System.out::println);
		
		//9. skip : kac tane eleman atlanacak
		System.out.println("----------- SKIP -----------");
		personelList.stream().limit(2).forEach(System.out::println);
		System.out.println("----------- SKIP(3) -----------");
		personelList.stream().skip(3).limit(2).forEach(System.out::println);
		
		//10. count : eleman sayisi
		System.out.println("----------- COUNT -----------");
		System.out.println(personelList.stream()
		                               .map(p -> p.getDepartment())
		                               .distinct()
		                               .count());
		
		//11. anyMatch : herhangi bir kosulu saglarsa true doner.
		System.out.println("-------- anyMatch --------");
		System.out.println(personelList.stream().anyMatch(p -> p.getSalary() < 40000));
		//12. allMatch : hepsi kosulu saglarsa true doner.
		System.out.println("-------- allMatch --------");
		System.out.println(personelList.stream().allMatch(p -> p.getSalary() > 30000));
		//13. noneMatch : hicbiri kosulu saglamazsa true doner.
		System.out.println("-------- noneMatch --------");
		System.out.println(personelList.stream().noneMatch(p -> p.getSalary() < 40000));
		
		//14. reduce (azaltmak)
		System.out.println("-------- reduce --------");
		List<Integer>sayilarList=Arrays.asList(5,3,2,2);
		List<Double>sayilarList2=Arrays.asList(1000.0, 2000.0, 5000.0, 7000.0, 10000.0, 5000.0, 3000.0, 4000.0, 4000.0);

		Integer sonuc = sayilarList.stream().reduce(0, (toplam, sayi) -> toplam + sayi);
		System.out.println("toplam : "+sonuc);
		sonuc = sayilarList.stream().reduce(1, (carpim, sayi) -> carpim * sayi);
		System.out.println("carpim : "+sonuc);
		
		Optional<Integer> maxDeger = sayilarList.stream().reduce((sayi1, sayi2) -> sayi1 > sayi2 ? sayi1 : sayi2);
		if (maxDeger.isPresent()){
			System.out.println("Max Deger : "+maxDeger.get());
		}
		
		//personelList içindeki departmanların adlarını bir sette toplayınız.
		System.out.println("personelList içindeki departmanların adlarını bir sette toplayınız.");
		Set<String> departmentSet = personelList.stream().map(p -> p.getDepartment()).collect(Collectors.toSet());
		departmentSet.forEach(System.out::println);
		
		//personelList içindeki personellerin adlarını tekil olarak ve ad uzunluklarını bir map'te toplayınız.
		System.out.println("personelList içindeki personellerin adlarını tekil olarak ve ad uzunluklarını bir map'te toplayınız.");
		Map<String, Integer> isimlerVeUzunluklarMap = personelList.stream()
		                                           .map(p -> p.getName())
		                                           .distinct()
		                                           .collect(Collectors.toMap(ad -> ad, ad -> ad.length()));
		isimlerVeUzunluklarMap.forEach((k,v)-> System.out.println(k+" "+v));
		
		//15. peek :
		System.out.println("--------------- PEEK ---------------");
		List<Double> zamliMaasList =
				personelList.stream().peek(p -> System.out.println("Zamdan önceki maaşı : " + p.getSalary()))
				            .map(p -> p.getSalary() * 2)
				            .peek(zamliMaas -> System.out.println("Zamdan sonraki maaşı : " + zamliMaas))
				            .collect(Collectors.toList()); // toList() metodu da kullanılabilir.
		
		//16. joining :
		System.out.println("--------------- Joining ---------------");
		String personelNames = personelList.stream().map(p -> p.getName()).collect(Collectors.joining("-"));
		System.out.println(personelNames);
		
		
	}
}