package com.haruns.optional;

import java.util.Optional;

/**
 * Optional : null olabilme ihtimali olan değerlerle çalışmayı güvenli hale getirmek için eklenmiştir.
 * NPE riskini azaltmak için tasarlanmıştır.
 * Bir metod optional değer döndüğü zaman "NULL değer dönebilirim" mesajını programcıya vermiş olur.
 * Bu sayede zorunlu olarak null kontrolü yaptırmış oluruz.
 */
public class _00_OptionalGiris {
	public static void main(String[] args) {
		// Optional oluşturma
		Optional<String> emptyOptional=Optional.empty();
		
		Optional<String> stringOptional=Optional.of("null");
		
		
		//eğer value null ise boş (empty) optional döner.
		Optional<String> nullableOptional = Optional.ofNullable(null);
		
		// System.out.println(stringOptional.get().toLowerCase()); get ile direkt değeri alırsak NPE veya NoSuchElementException alma ihtimalimiz hala vardır.
		
		nullableOptional.ifPresent(System.out::println);
		System.out.println(nullableOptional);
		
		nullableOptional.ifPresentOrElse(System.out::println,()-> System.out.println("Deger yok"));
		
		// optional ile sarmalanmış değer eğer 10'dan büyükse değeri yazdırsın, değilse değer 10dan büyük değil mesajı versin.
		Optional<Integer> optionalInteger1 = Optional.of(8);
		optionalInteger1.filter(sayi -> sayi > 10)
		                .ifPresentOrElse(
				                System.out::println, // eğer koşul sağlanırsa çalışacak
				                ()-> System.out.println("Değer 10'dan büyük değil.") // Eğer koşul sağlanmazsa çalışacak.
		                );
	}
}