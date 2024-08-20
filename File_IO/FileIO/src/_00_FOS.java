import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _00_FOS {
	public static void main(String[] args) {
		dosyaYaz("C:/javaFiles/belge2.txt","YAZILACAK METIN");
		
	}
	
	private static void dosyaYaz(String filePath, String metin) {
		//File file=new File("belge.txt"); // relative Path(goreceli). gerçekte: E:\JavaDersleri\OOP\File_IO\FileIO
		FileOutputStream fos = null;
		byte[] bytes = {'J','A','V','A'};
		
		try {
			fos = new FileOutputStream(filePath,true); // absolute Path (Tam Yol)
			fos.write(metin.getBytes());
			
		}
		catch (FileNotFoundException e) {
			System.out.println("FOS dosyayi bulamadi.");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("FOS yazma isleminde hata ile karsilasti.");
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			}
			catch (IOException e) {
				System.out.println("FOS kapatmada bir hata meydana geldi.");
				e.printStackTrace();
			}
		}
	}
}