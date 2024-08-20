package com.haruns.streamGiris;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _00_StreamGiris {
	public static void main(String[] args) {
		// Stream oluşturma :
		Stream<String> tekKayitliStream =Stream.of("Pazartesi");
		Stream<Double> cokKayitliStream=Stream.of(1.0,2.0,3.0);
		Stream<String> bosStream=Stream.empty();
		
		//List'ten Stream oluşturma :
		List<String> gunlerList=List.of("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar");
		Stream<String> gunlerStream = gunlerList.stream();
		List<String> gunlerStartsWithP = gunlerStream.filter(gun -> gun.startsWith("P")).collect(Collectors.toList());
		System.out.println(gunlerStartsWithP);
	}
}