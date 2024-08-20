package com.haruns._00_ExceptionGiris;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _01_CheckedOrnek {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis=new FileInputStream("C:/javaFiles/Hello3.txt"); //Unhandled exception: java.io.FileNotFoundException
		}
		catch (Exception e) {
			System.out.println("catche düştük");
			e.printStackTrace();
			// throw new RuntimeException(e); burası yeni bir hata fırlatır. Program durur.
		}
		
		
		//buradaki exception CheckedException'dır. Eğer handle edilmezse Derleme hatası verir. Kod çalışmaz.
		//2 alternatif sunar, birisi metod imzasına throws keywordü ile hatayı yazmaktır.
		//Diğeri ise try catch ile sarmalamaktır.
		
		try {
			Thread.sleep(2000); // 2sn beklet.
			System.out.println("Thread bekleme süresi bitti.");
		}
		catch (InterruptedException e) {
			System.out.println("catch InterruptedExceptiona düştük...");
			e.printStackTrace();
			
			
		}
		
		System.out.println("Program hata olsa da çalışmaya devam ediyor.");
	}
}