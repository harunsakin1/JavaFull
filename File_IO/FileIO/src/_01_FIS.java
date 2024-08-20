import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _01_FIS {
	public static void main(String[] args) {
		dosyaOku("C:/javaFiles/belge2.txt");
		dosyaOku("C:/javaFiles/belge2.txt",7,5);
	}
	
	private static void dosyaOku(String dosyaYolu) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(dosyaYolu);
			
			// Döngü ile dosya okuma
			int okunanKarakter;
			String metin="";
			while ((okunanKarakter=fis.read())!=-1){
				metin+=(char)okunanKarakter;
			}
			System.out.println(metin);
		}
		catch (FileNotFoundException e) {
			System.out.println("Okunacak dosya bulunamadı.");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("FIS read() metodunda hata meydana geldi.");
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			}
			catch (IOException e) {
				System.out.println("FIS close() isleminde hata");
				e.printStackTrace();
			}
		}
	}
	private static void dosyaOku(String dosyaYolu,int baslangic, int okunacakKarakterSayisi) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(dosyaYolu);
			fis.skip(baslangic);
			// Döngü ile dosya okuma
			int okunanKarakter;
			String metin="";
			int sayac=0;
			while ((okunanKarakter=fis.read())!=-1){
				metin+=(char)okunanKarakter;
				sayac++;
				if (sayac==okunacakKarakterSayisi){
					break;
				}
			}
			System.out.println(metin);
		}
		catch (FileNotFoundException e) {
			System.out.println("Okunacak dosya bulunamadı.");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("FIS read() metodunda hata meydana geldi.");
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			}
			catch (IOException e) {
				System.out.println("FIS close() isleminde hata");
				e.printStackTrace();
			}
		}
	}
}