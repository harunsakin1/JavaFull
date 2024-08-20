package com.haruns._26_AnonymousInnerClass;

import java.util.Arrays;

public class Siralama {
	public static void main(String[] args) {
		int[] sayilar = {3, 6, 9, 5, 2, 8, 7, 4, 1};
		System.out.println("Dizinin sıralanmamış hali");
		System.out.println(Arrays.toString(sayilar));
		
		//Anonim inner class. Sınıf ismi yok. Interface newlenmiyor. Isimsiz bir sınıftan nesne oluşturuluyor.
		SortAlgorithm bubbleSort = new SortAlgorithm() {
			@Override
			public void sort(int[] array) {
				int uzunluk = array.length;
				for (int i = 0; i < uzunluk - 1; i++) {
					for (int j = 0; j < uzunluk - 1 - i; j++) {
						if (array[j]>array[j+1]){
							int temp=array[j];
							array[j]=array[j+1];
							array[j+1]=temp;
						}
					}
				}
			}
		};
		bubbleSort.sort(sayilar);
		System.out.println("Dizinin sıralanmış hali");
		System.out.println(Arrays.toString(sayilar));
		}
}