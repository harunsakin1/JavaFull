package com.haruns.Downloader;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloaderTekThread {
	public static void main(String[] args) {
		String indirilecekDosyaAdresi =
				"https://www.cs.cmu.edu/afs/cs.cmu.edu/user/gchen/www/download/java/LearnJava.pdf";
		String kaydedilecekDosyaAdi = "LearnJava.pdf";
		long start = System.currentTimeMillis();
		FileDownloaderThread fileDownloaderThread = new FileDownloaderThread(indirilecekDosyaAdresi, kaydedilecekDosyaAdi);
		Long toplamBoyut = dosyaBoyutBul(indirilecekDosyaAdresi);
		System.out.println("Dosya boyutu : "+toplamBoyut);
		fileDownloaderThread.start();
		while (fileDownloaderThread.isAlive()){
			try {
				Thread.sleep(200);
				System.out.println("İnen dosya boyutu : %"+fileDownloaderThread.inenDosyaBoyutu*100/toplamBoyut);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			fileDownloaderThread.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("Tek thread ile download için geçen süre :  "+ (end-start)+" milisaniye");
	}
	public static Long dosyaBoyutBul(String indirilecekDosyaAdresi){
		long contentLengthLong=0;
		try {
			URL url=new URL(indirilecekDosyaAdresi);
			HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
			httpURLConnection.setRequestMethod("HEAD");
			String contentType = httpURLConnection.getContentType();
			System.out.println("Content Type : "+contentType);
			 contentLengthLong = httpURLConnection.getContentLengthLong();
			
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return contentLengthLong;
	}
}

class FileDownloaderThread extends Thread {
	int inenDosyaBoyutu = 0;
	String fileName;
	String url;
	
	public FileDownloaderThread(String url, String fileName) {
		this.url = url;
		this.fileName = fileName;
	}
	
	@Override
	public void run() {
		super.run();
		
		try (BufferedInputStream inputStream = new BufferedInputStream(new URL(url).openStream())) {
			FileOutputStream fileOutputStream = new FileOutputStream(fileName);
			byte[] buffer = new byte[1024];
			int readedByte;
			while ((readedByte = inputStream.read(buffer, 0, 1024)) != -1) {
				fileOutputStream.write(buffer, 0, readedByte);
				inenDosyaBoyutu += readedByte;
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}