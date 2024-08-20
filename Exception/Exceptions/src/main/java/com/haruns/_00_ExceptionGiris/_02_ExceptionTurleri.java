package com.haruns._00_ExceptionGiris;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Exception;
 * - Sizin tanımladığınız exceptionlar (User-Defined Exception)
 * - Hazır gelen exceptionlar (Built-in Exceptions)
 *      -Checked (ClassNotFoundException, InterruptedException, IOException, FileNotFoundException)
 *          Compile Time'da mutlaka kontrol sağlanmasını zorunlu kılar.
 *          Bu kontrol için 2 yol vardır.
 *              1.YOL : Try-Catch bloğuna almak.
 *              2.YOL : İçinde bulunduğumuz metodun imzasına throws ile Exception adını yazmak.
 *      -Unchecked (ArithmeticException, NullPointerException, ArrayIndexOutfOfBoundsException) : RunTime exception'dan exten alan sınıflar.
 *
 */
public class _02_ExceptionTurleri {
	public static void main(String[] args) {
		try {
			dosyaOku();
			beklet();
		}
		// catch bloklarından sadece 1 tanesi çalışır
		catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("e.getMessage() : "+e.getMessage());
			System.out.println("e.getLocalizedMessage() : "+e.getLocalizedMessage());
			System.out.println("e : "+e);
		}
		catch (IOException e){
			System.out.println("IO Exception : "+e.getMessage());
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("program devam ediyor. 1");
		
		
		// ORNEK 2 :
		Personel p1=new Personel("Ali","KAYA");
		System.out.println(p1.getName());
		Personel p2=null;
		try {
			System.out.println(p2.getName());
		}
		// Catch sıralaması önemlidir. Özelden genele doğru gidilmelidir.
		catch (NullPointerException e) {
			//e.printStackTrace();
			System.out.println("e NullPointerException : "+e);
		}
		catch (Exception e) {
			//e.printStackTrace();
			System.out.println("e Exception : "+e);
		}
		System.out.println("program devam ediyor. 2");
		
		// ÖRNEK 3:
		int[] sayiDizisi={3,5};
		System.out.println(sayiDizisi[1]);
		try {
			System.out.println(sayiDizisi[5]);
			System.out.println(5/0);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println("e Exception : "+e);
		}
		catch (Exception e){
			//e.printStackTrace();
			System.out.println("e Exception : "+e);
		}
		finally {
			System.out.println("finally bloguna dustuk");
		}
		System.out.println("program devam ediyor. 3");
	}
	
	private static void beklet() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	private static void dosyaOku() throws FileNotFoundException {
		FileInputStream fis = null;
		
			fis=new FileInputStream("C:/javaFiles/Hello3.txt");
		
	}
	
	
}