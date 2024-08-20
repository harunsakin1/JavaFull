package com.haruns._00_ExceptionGiris;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_FinallyOrnek {
	public static void main(String[] args) {
		FileInputStream fileData = null;
		
		try {
			fileData=new FileInputStream("C:/javaFiles/Hello5.txt");
			int readedData;
			System.out.print("Dosya icerigi : ");
			while ((readedData= fileData.read())!=-1){ //Burada bir hata oldugunda FileInputStream açılmış olacak.
				System.out.print((char) readedData);
			}
			//fileData.close(); // ama bu satır çalışmayacağı için FileInputStream kapatılmamış olacak. (memory leak)
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fileData.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			catch (NullPointerException e){
				System.out.println("fileData is null...");
			}
		}
//		try {
//			fileData.close();// eğer FileInputStream açılamazsa, o zaman kapatamayız ve NullPointerException hatası
//			// alırız
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("Program devam ediyor...");
	}
}