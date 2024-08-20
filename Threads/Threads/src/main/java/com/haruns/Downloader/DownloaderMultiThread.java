package com.haruns.Downloader;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DownloaderMultiThread {
	public static void main(String[] args) {
		String indirilecekDosyaAdresi = "https://www.cs.cmu.edu/afs/cs.cmu.edu/user/gchen/www/download/java/LearnJava.pdf";
		String kaydedilecekDosyaAdi = "LearnJava.pdf";
		int threadSayisi = 50;
		
		long toplamBoyut = dosyaBoyutBul(indirilecekDosyaAdresi);
		System.out.println("Dosya boyutu : " + toplamBoyut);
		
		ExecutorService executorService = Executors.newFixedThreadPool(threadSayisi);
		long parcaBoyutu = toplamBoyut / threadSayisi;
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < threadSayisi; i++) {
			long baslangic = i * parcaBoyutu;
			long bitis = (i == threadSayisi - 1) ? toplamBoyut : baslangic + parcaBoyutu - 1;
			executorService.submit(new FileDownloaderMultiThread(indirilecekDosyaAdresi, kaydedilecekDosyaAdi, baslangic, bitis, i));
		}
		
		executorService.shutdown();
		try {
			executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// İndirilen parçaları birleştir
		try (FileOutputStream fileOutputStream = new FileOutputStream(kaydedilecekDosyaAdi)) {
			for (int i = 0; i < threadSayisi; i++) {
				try (FileInputStream fis = new FileInputStream(kaydedilecekDosyaAdi + ".part" + i)) {
					byte[] buffer = new byte[1024];
					int bytesRead;
					while ((bytesRead = fis.read(buffer)) != -1) {
						fileOutputStream.write(buffer, 0, bytesRead);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Parçaları sil
		for (int i = 0; i < threadSayisi; i++) {
			new File(kaydedilecekDosyaAdi + ".part" + i).delete();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Multi thread ile download için geçen süre : " + (end - start) + " milisaniye");
	}
	
	public static long dosyaBoyutBul(String indirilecekDosyaAdresi) {
		long contentLengthLong = 0;
		try {
			URL url = new URL(indirilecekDosyaAdresi);
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setRequestMethod("HEAD");
			contentLengthLong = httpURLConnection.getContentLengthLong();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contentLengthLong;
	}
}

class FileDownloaderMultiThread implements Runnable {
	private String url;
	private String fileName;
	private long baslangic;
	private long bitis;
	private int partNumber;
	
	public FileDownloaderMultiThread(String url, String fileName, long baslangic, long bitis, int partNumber) {
		this.url = url;
		this.fileName = fileName;
		this.baslangic = baslangic;
		this.bitis = bitis;
		this.partNumber = partNumber;
	}
	
	@Override
	public void run() {
		try {
			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			String byteRange = "bytes=" + baslangic + "-" + bitis;
			connection.setRequestProperty("Range", byteRange);
			connection.connect();
			
			try (InputStream inputStream = connection.getInputStream();
			     RandomAccessFile raf = new RandomAccessFile(fileName + ".part" + partNumber, "rw")) {
				byte[] buffer = new byte[1024];
				int bytesRead;
				while ((bytesRead = inputStream.read(buffer)) != -1) {
					raf.write(buffer, 0, bytesRead);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}