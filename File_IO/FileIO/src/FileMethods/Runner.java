package FileMethods;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Runner {
	public static void main(String[] args) {
		File file = new File("C:\\java15files\\deneme.txt");
		System.out.println("file.exists() : "+file.exists()); // Dosya ve klasör varlığını kontrol etmek için kullanılır.
		System.out.println("file.getAbsolutePath() : "+file.getAbsolutePath());
		try {
			System.out.println("file.getCanonicalFile() : "+file.getCanonicalFile());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("file.length() : "+file.length());
		System.out.println("file.getParent() : "+file.getParent());
		System.out.println("file.isFile() : "+file.isFile());
		System.out.println("file.isDirectory() : "+file.isDirectory());
		System.out.println("Dosya'nın son değiştirilme zamanı : "+new Date(file.lastModified()));
		
	}
}