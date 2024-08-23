package com.haruns;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class _10_DateTimeFormatter {
	public static void main(String[] args) {
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate yasGunu=LocalDate.of(2000,12,13);
		System.out.println("Formatsız LocalDate : "+yasGunu);
		System.out.println("Formatlı LocalDate : "+yasGunu.format(dtf));
		
		
	}
}