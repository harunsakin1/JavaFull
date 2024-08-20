package Logger;

import java.util.ArrayList;

public class RunnerDosyaIslemleri {
	public static void main(String[] args) {
		Log log1=new Log("Hata mesaji1","Classname1","Methodname1","Aciklama1",System.currentTimeMillis());
		Log log2=new Log("Hata mesaji2","Classname2","Methodname2","Aciklama2",System.currentTimeMillis());
		Log log3=new Log("Hata mesaji3","Classname3","Methodname3","Aciklama3",System.currentTimeMillis());
		Ogrenci ogrenci=new Ogrenci("Harun",151L);
		Ogrenci ogrenci2=new Ogrenci("Ahmet",157L);
		Ogrenci ogrenci3=new Ogrenci("Seda",159L);
		
		DosyaIslemleri<Log> logDosyaIslemleri=new DosyaIslemleri<>();
		logDosyaIslemleri.writeToBinary(log1,"loglar.bin");
		logDosyaIslemleri.writeToBinary(log2,"loglar.bin");
		logDosyaIslemleri.writeToBinary(log3,"loglar.bin");
		ArrayList<Log> logs = logDosyaIslemleri.readFromBinary("loglar.bin");
		logs.forEach(System.out::println);
		
		DosyaIslemleri<Ogrenci> ogrenciDosyaIslemleri=new DosyaIslemleri<>();
		ogrenciDosyaIslemleri.writeToBinary(ogrenci,"ogrler.bin");
		ogrenciDosyaIslemleri.writeToBinary(ogrenci2,"ogrler.bin");
		ogrenciDosyaIslemleri.writeToBinary(ogrenci3,"ogrler.bin");
		ArrayList<Ogrenci> ogrencilerArrayList = ogrenciDosyaIslemleri.readFromBinary("ogrler.bin");
		ogrencilerArrayList.forEach(System.out::println);
	}
}