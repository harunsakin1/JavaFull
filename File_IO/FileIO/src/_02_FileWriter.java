import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
FOS ve FIS ile tüm dosya türleri üzerinde IO işlemleri yapılabilir.
FileWriter ve FileReader ile sadece metin dosyaları üzerinde çalışabilirsiniz.
 */

public class _02_FileWriter {
	public static void main(String[] args) {
//		dosyaYaz1();
//		dosyaYaz2();
		//scannerlaDosyayaYaz();
		scannerlaDosyayaYaz2();
	}
	private static void scannerlaDosyayaYaz2(){
		// try-with-resources : Kaynaklarla çalışan try
		// Bu yapının kullanılması için içindeki sınıf Closeable interface'ini implement etmeli.
		// Bu yapı ile beraber artık finally bloğu içinde nesne kapatmaya gerek kalmayacak.
		
		try(FileWriter fw=new FileWriter("dosya4.txt",true); Scanner sc=new Scanner(System.in)){
			System.out.println("Bir metin giriniz : ");
			String girdi="";
			StringBuilder sb=new StringBuilder();
			while (!(girdi=sc.nextLine()).equals("-1")){
				System.out.println("Bir metin giriniz : ");
				sb.append(girdi+"\n");
			}
			fw.write(sb.toString());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private static void scannerlaDosyayaYaz(){
		// try-with-resources : Kaynaklarla çalışan try
		// Bu yapının kullanılması için içindeki sınıf Closeable interface'ini implement etmeli.
		// Bu yapı ile beraber artık finally bloğu içinde nesne kapatmaya gerek kalmayacak.
		
		try(FileWriter fw=new FileWriter("dosya3.txt",true); Scanner sc=new Scanner(System.in)){
			String girdi="";
			while (true){
				System.out.println("Bir metin giriniz : ");
				girdi= sc.nextLine();
				if (girdi.equals("-1")){
					break;
				}
				fw.write(girdi+"\n");
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private static void dosyaYaz2(){
		// try-with-resources : Kaynaklarla çalışan try
		// Bu yapının kullanılması için içindek sınıf Closeable interface'ini implement etmeli.
		// Bu yapı ile beraber artık finally bloğu içinde nesne kapatmaya gerek kalmayacak.
		
		try(FileWriter fw=new FileWriter("dosya2.txt")){
			fw.write("Galatasaray");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private static void dosyaYaz1() {
		FileWriter fw=null;
		try {
			fw=new FileWriter("dosya.txt");
			fw.write("Bursaspor");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close(); // Close işlemi sonunda kayıt gerçekleşir.
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}