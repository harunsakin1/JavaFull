package com.haruns.EczaneApi;

import java.util.List;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PharmacyRepository pharmacyRepository=new PharmacyRepository();
		String il,ilce;
		System.out.print("Lutfen il giriniz : ");
		il=sc.nextLine();
		System.out.print("Lutfen ilce giriniz : ");
		ilce=sc.nextLine();
		List<Pharmacy> pharmacies = pharmacyRepository.getPharmacies(il, ilce);
		pharmacies.forEach(System.out::println);  // Eczane verilerini konsola yazdır
	}
}