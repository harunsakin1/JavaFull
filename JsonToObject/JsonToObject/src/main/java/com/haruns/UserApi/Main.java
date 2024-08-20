package com.haruns.UserApi;

/**
 * JSON : JavaScript Object Notation
 * JSON : Hangi dili kullandığımız farketmeksizin veri taşımak için kullanılan ortak bir yapıdır.
 * xml'e göre çok daha az boyut kapladığı için tercih edilmektedir.
 * JSON ile sistemler arasında veri taşımaktadır.
 * [
 * {
 *     "ad":"Barış",
 *     "yaş":30,
 *     "araba":null
 * },Bir JSON objesidir.
 * {
 *      "ad":"Harun",
 *      "yaş":23,
 * } Bir JSON objesi daha.
 * ] Bir JSON array.
 * {} : JSON obje
 * [] : JSON array
 *
 * API : Application Programming Interface
 */

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Json :
 * {
 *     "employees" :
 *      [
 *        { "ad" : "Selim", "soyad" : "TAS", "maas" : 50000 },
 *        { "ad" : "Kenan", "soyad" : "SARI", "maas" : 70000 }
 *        { "ad" : "Ayse", "soyad" : "YILMAZ", "maas" : 90000 }
 *     ]
 * }
 * xml :
 * <employees>
 *     <employee>
 *         <ad>Selim</> <soyad>TAS</soyad> <maas>50000</maas>
 *     </employee>
 *     <employee>
 *         <ad>Kenan</> <soyad>SARI</soyad> <maas>70000</maas>
 *     </employee>
 *     <employee>
 *         <ad>Ayse</> <soyad>YILMAZ</soyad> <maas>90000</maas>
 *     </employee>
 * </employees>
 *
  *
  * {
  *     "employees" : ["Selim","Ayse","Kenan"],
  *     "butce" : 500000,
  *     "vergiBorcu" : false,
  *     "sirket" : null,
  * }
 */
public class Main {
	public static void main(String[] args) {
		UserRepository userRepo = new UserRepository();
		// 1. Soru : En yaşlı kullanıcının kim olduğunu bul :
		List<User> kullanicilarList = userRepo.getUsers(105);
		kullanicilarList.forEach(System.out::println);
		
		User enYasliKullanici = kullanicilarList.stream().map(user -> (User) user)
		                                        .max(Comparator.comparingLong(user -> user.getDob().getAge()))
		                                        .orElse(null);
		
		System.out.println("En yaşlı kullanıcının adı ve yaşı : " +
				                   enYasliKullanici.getName().getFirst() + " " +
				                   enYasliKullanici.getName().getLast()+" "+enYasliKullanici.getDob().getAge());
		
		// 2. Soru : Kullanıcıların yaş ortalamasını hesapla :
		
		OptionalDouble ortalamaYas = kullanicilarList.stream().mapToLong(user -> user.getDob().getAge()).average();
		
		System.out.println("Kullanıcıların yaş ortalaması: " + ortalamaYas.getAsDouble());
		
		// 3. Soru : İsmi A ile başlayan kullanıcıları bul ve listele :
		List<User> ismiAileBaslayanlar = kullanicilarList.stream()
		                                                 .filter(user -> user.getName().getFirst().startsWith("A")).toList();
		System.out.println("##### İsmi A ile başlayan kullanıcılar #####");
		for (User user:ismiAileBaslayanlar){
			System.out.println(user.getName().getFirst());
		}
		// 4. Soru : Her ülkeden kaç kullanıcı olduğunu bul :
		System.out.println("##### Ülkelerdeki kullanıcı sayıları #####");
		kullanicilarList.stream()
		                .collect(Collectors.groupingBy(user -> user.getLocation().getCountry(), Collectors.counting()))
		                .forEach((k,v)-> System.out.println(k+" "+v));
		// 5. Soru : Kullanıcıları cinsiyetlere göre ayır ve cinsiyetlerin yaş ortalamasını bul :
		System.out.println("##### Cinsiyetlere göre yaş ortalamaları #####");
		kullanicilarList.stream()
		       .collect(Collectors.groupingBy(user -> user.getGender(), Collectors.averagingDouble(value -> value.getDob().getAge())))
		       .forEach((k,v)-> System.out.println(k+" "+v));
		// 6. Soru : 30 Yaşından küçük kullanıcıları isimleri ile birlikte yaşlarına göre küçükten büyüğe sırala :
		System.out.println("##### 30 Yaşından küçük kullanıcıların küçükten büyüğe doğru sıralanması #####");
		List<User> otuzYasindanKucukler = kullanicilarList.stream()
		                                     .filter(user -> user.getDob().getAge() < 30)
		                                     .sorted(Comparator.comparingLong(user -> user.getDob().getAge()))
		                                     .toList();
		otuzYasindanKucukler.forEach(user -> System.out.println(user.getName().getFirst()+" "+user.getDob().getAge()));
		// 7. Soru : Adı ve soyadı toplamı 15 karakterden uzun olan kullanıcıların adının tamamını büyük harfle yazdırma
		System.out.println("##### Adı ve soyadı toplamı 15 karakterden uzun olan kullanıcılar #####");
		kullanicilarList.stream()
		.filter(user -> (user.getName().getFirst().length())+(user.getName().getLast().length())>15)
		.forEach(user -> System.out.println(user.getName().getFirst().toUpperCase()+" "+user.getName().getLast().toUpperCase()));
		// 8. Soru : Hangi ayda kaç kullanıcını doğduğunu bul :
		System.out.println("##### Aylara göre doğan kişi sayısı #####");
		Map<Integer, Long> aylaraGoreDoganKisiSayisi = kullanicilarList.stream().collect(Collectors.groupingBy(user -> {
			String[] ayrilmisTarih = user.getDob().getDate().split("-");
			int ay = Integer.parseInt(ayrilmisTarih[1]);
			return ay;
		}, Collectors.counting()));
		aylaraGoreDoganKisiSayisi.forEach((ay,sayi)-> System.out.println(ay+". ayda doğan kişi sayısı : "+sayi));
		// 9. Soru : Şehirlere göre kullanıcı sayısını bul :
		System.out.println("##### Şehirlere göre kullanıcı sayıları #####");
		kullanicilarList.stream()
		                .collect(Collectors.groupingBy(user -> user.getLocation().getCity(),
		                                          Collectors.counting())).forEach((k,v)-> System.out.println(k+" "+v));
		// 10. Soru : En eski kullanıcıyı bulup adını yazdır :
		System.out.println("##### En eski kullanıcıyı bulup adını yazdırma #####");
		User enEskiKullanici = kullanicilarList.stream().min(Comparator.comparing(user -> user.getRegistered().getDate()))
		                             .orElse(null);
		System.out.println("En eski kullanıcının adı : "+enEskiKullanici.getName().getFirst()+" "+enEskiKullanici
				                   .getName().getLast() +"\nKayıt tarihi : "+enEskiKullanici.getRegistered().getDate());
		
	}
	
	// Burada 10 farklı soru yaz ve çözümlerini yap! (ÖDEV)
	
}