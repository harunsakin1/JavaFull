package com.haruns.streamOrnek;

import java.util.*;
import java.util.stream.IntStream;

public class _00_IntStream {
	public static void main(String[] args) {
		IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
		//intStream.forEach(System.out::println);
		
		System.out.println(intStream.min());
		
		
		IntStream.iterate(0,i->i+2).limit(10).forEach(System.out::println);
		System.out.println("----------------------------------");
		IntStream.generate(new Random()::nextInt).limit(5).forEach(System.out::println);
		System.out.println("----------------------------------");
		int sum=IntStream.rangeClosed(0,30).sum();
		System.out.println(sum);
		System.out.println("----------------------------------");
		OptionalInt max = IntStream.range(10, 100).max();
		System.out.println(max.getAsInt());
		System.out.println("----------------------------------");
		List<Integer>sayilar= Arrays.asList(5,20,30,10,15);
		System.out.println(sayilar.stream().filter(s -> s % 2 == 0).count());
		//mapToInt : Integer nesnelerini primitive int değerlere dönüştürür. (UNBOXING)
		System.out.println(sayilar.stream().mapToInt(Integer::intValue).filter(s -> s % 2 == 0).count());
		//BOXING : primitive data type'ı Wrapper nesnesine çevirmek.
		IntStream intStream1 = IntStream.rangeClosed(0, 5000);
		intStream1.boxed().toList().forEach(System.out::println);
	}
}