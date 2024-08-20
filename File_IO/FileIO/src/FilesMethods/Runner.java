package FilesMethods;
// new i/o
// non-blocking i/o
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class Runner {
	public static void main(String[] args) throws IOException {
		//Path path=Path.of("C:\\java15files\\silinecekDosya.txt");
		//Files.delete(path);
		//Files.deleteIfExists(path);
		
		// kopyalama : copy&paste
	/*	Path pathCopy = Files.copy(Path.of("C:\\java15files\\hata.log"), Path.of("C:\\java15files\\Kopyalanan\\hataCopy.log"), StandardCopyOption.REPLACE_EXISTING);
		System.out.println(pathCopy);*/
		
		// taşıma : cut&paste
		/*Path movedPath = Files.move(Path.of("C:\\java15files\\hata.log"), Path.of("C:\\java15files\\Moved\\hata.log"));
		System.out.println(movedPath);*/
		
		/*Files.createDirectories(Path.of("C:\\java15files\\createdDirectory"));*/
		
		// Dizin-klasör içerisinde gezinme
		System.out.println("Klasörün içerisindeki her şey");
		Files.walk(Path.of("C:\\java15files")).forEach(System.out::println);
		System.out.println("------------------------------------------------");
		// Dizindeki dosyaları listeleme
		System.out.println("Sadece Dosyalar");
		Files.walk(Path.of("C:\\java15files")).filter(Files::isRegularFile).forEach(System.out::println);
		
		// Sadece pdf'leri getir.
		System.out.println("------------------------------------------------");
		System.out.println("Sadece PDF'ler");
		Files.walk(Path.of("C:\\java15files")).filter(path->path.toString().endsWith(".pdf")).forEach(System.out::println);
		
		
		// SORU :
				Files.walk(Path.of("C:\\java15files")).filter(path -> path.toString().endsWith(".pdf")).forEach(pdf-> {
					try {
						Files.copy(pdf,Path.of("C:\\java15files\\pdfler\\copyOf"+pdf.getFileName()));
					}
					catch (IOException e) {
						e.printStackTrace();
					}
				});
		
		
	}
}