import java.io.InputStream;
import java.io.OutputStream;

/**
 * Dosya işlemleri -> File IO Input/Output
 * Bilgisayar sisteminde kullanılan her şey bir dosyadır.
 * Bunlar farklı programlar tarafından üretilir ve kullanılır. Dosya 2 bölümden oluşur.
 * [DOSYA_ADI].[DOSYA_UZANTISI]
 *
 * txt, xls, xlsx, doc, docx, ppt, pptx -> Dokuman dosyaları
 * jpg, jpeg, png, heic, raw, gif -> Resim dosyaları
 * mp4, mov, mpeg -> Video
 * mp3, zip, rar, wav, dll, html, css, js, java, bat ... -> Diğer uzantılar
 */
public class Main {
	public static void main(String[] args) {
		// Java Programınız > FileOutputStream > Dosya
		// Dosyaya veri yazmak için kullanılan abstract sınıf : OutputStream
		// write(): byte dizisini dosyaya yazmak için kullanılacak.
		// flush(): tamponlanmış veriyi hızlı şekilde bir kerede yazmayı sağlar.
		// close(): outputStream'i kapatmayı sağlar.
		
		
		
		// Dosya > FileInputStream > Java Programınız
		// Dosyadan veri okumak için : Input
		// read(): Dosya'dan veri okumayı sağlar. Eğer dosyada okunacak karakter kalmazsa bu metot -1 döner.
		// close(): inputStream'i kapatmayı sağlar.
		
	}
}