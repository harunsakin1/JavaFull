package com.haruns._02_UserDefinedException2;

import java.util.Scanner;
/*
// kullanici yanlis secim yaptiginda yani 0-4 arasi degilse bir hata firlatin
// hata turu kendi yazdiginiz bir hata olabilir.
// WrongChoiceException
 */
public class MatematikIslemleri {
	public static void main(String[] args) {
		try {
			matematikIslemleri();
		}
		catch (WrongChoiceException e) {
			e.printStackTrace();
		}
	}
	
	private static void matematikIslemleri() throws WrongChoiceException {
		Scanner sc = new Scanner(System.in);
		int sayi1 = 10, sayi2 = 20;
		while (true){
		System.out.println("Matematik Islemleri");
		System.out.println("1 - Carpma");
		System.out.println("2 - Bolme");
		System.out.println("3 - Toplama");
		System.out.println("4 - Cikarma");
		System.out.println("0 - Cikis");
		
		int secim = sc.nextInt();
			switch (secim) {
				case 1: {
					System.out.println(sayi1 + " * " + sayi2 + " = " + (sayi1 * sayi2));
					break;
				}
				case 2: {
					System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1 / (double)sayi2));
					break;
				}
				case 3: {
					System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1 + sayi2));
					break;
				}
				case 4: {
					System.out.println(sayi1 + " - " + sayi2 + " = " + (sayi1 - sayi2));
					break;
				}
				case 0: {
					System.out.println("Uygulama sonlandiriliyor.");
					return;
				}
				default: {
					try {
						throw new WrongChoiceException("Secim 0-4 arasi olmalidir");
					}
					catch (WrongChoiceException e){
						e.printStackTrace();
					}
				}
			}
		}
	}
}